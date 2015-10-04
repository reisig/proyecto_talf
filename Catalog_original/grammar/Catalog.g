// ===============================================================
//                               LEXER
// ===============================================================
class CatalogLexer extends Lexer;
options {
    k = 2;
    testLiterals = false;
    charVocabulary = '\3'..'\377';
}

// arithmetic
PLUS: 	'+';
MINUS:	'-';
TIMES: 	'*';
DIV: 	'/';
ASSIGN: '='; // assignment operator

// grouping/separating
SEMI: 	';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
PERIOD:	'.';

// comparison
EQ:		"==";
NOTEQ:	"!=";
GREAT:	'>';
LESS:	'<';
GREATEQ:">=";
LESSEQ:	"<=";

// logical
AND:	"&&";
OR:		"||";

protected LETTER : ('a'..'z' | 'A'..'Z');
protected DIGIT  : '0'..'9';

ID options { testLiterals = true; }: (LETTER | '_') (LETTER | '_' | DIGIT)* ;

VAR: '$' ID;

NUMBER: (DIGIT)+;

STRING: '"'! ( '"' '"'! | ~('"'))*  '"'!; // string, escape " with ")

WS: (' ' | '\t' | '\n' { newline(); } | '\r') { $setType(Token.SKIP); }; // white space

COMMENTS: '#'(~('\n'|'\r'))* { $setType(Token.SKIP); }; // comments, single line only

// ===============================================================
//                            PARSER
// ===============================================================
class CatalogParser extends Parser;
options {
    buildAST = true;
    k = 2;
}

tokens { STATEMENTS; REVERSE; FOR; }

file: (stmt SEMI!)* EOF! { #file = #([STATEMENTS], file); };

stmt:
	"print"^ stmt |
	"if"^ or LBRACE! (stmt SEMI!)* RBRACE! | // if { ... }
	"cp"^ stmt STRING | // command cp (copy files from one path to another)
	"mv"^ stmt STRING | // command mv (move files from one path to another)
	"del"^ stmt |	// command del (delete files from a path)
	foreach | // loop
	VAR ASSIGN^ stmt | // assignment
	or;
or: and (OR^ and)*; // ||
and: eqneq (AND^ eqneq)*; // &&
eqneq: comp ((EQ^ | NOTEQ^) comp)*; // == and !=
comp: addsub ((LESS^ | LESSEQ^ | GREAT^ | GREATEQ^) addsub)*; // <, <=, >, >=
addsub: multdiv ((PLUS^ | MINUS^) multdiv)*; // + and -
multdiv: pattern ((TIMES^ | DIV^) pattern)*; // * and /
pattern: property (LPAREN^ property RPAREN!)*;
property: basic (PERIOD^ basic)*;
basic: 	ID | VAR | NUMBER | STRING | MINUS^ basic { #basic.setType(REVERSE); } |
		TRUE | FALSE | LPAREN! stmt RPAREN!; // basic element

foreach: "foreach"^ v:VAR ("in" | "inside") filelist (sort)? LBRACE! (stmt SEMI!)* RBRACE! {
	#foreach = #([FOR, "FOR"], #foreach); };
sort: "sortby"^ ID ((PLUS|MINUS)!)?;

filelist: STRING (PERIOD^ ID)*;

// ===============================================================
//                            WALKER
// ===============================================================

class CatalogWalker extends TreeParser; { 
	CatalogTable ctlTable = new CatalogTable(); // stores variables
	CatalogFiles ctlFiles = new CatalogFiles(); // handles essential file operations
}

file { CatalogType a; }: #(STATEMENTS (a=stmt)* );

stmts returns [CatalogType s1] { s1 = null; CatalogType s2; }: s1=stmt (s2=stmts)?;

stmt returns [CatalogType r] {
		r = null;
		CatalogType a = null;
		CatalogType b = null;
	}:
	#("print" a=stmt { System.out.println(a); r = new CatalogType(true); } ) |
	#("if" a=ifCond:stmt { if (a.isTrue()) { r = stmts(ifCond.getNextSibling()); } } ) |
	#("cp" a=stmt b=stmt { r = new CatalogType(ctlFiles.copyFile(a, b)); } ) |
	#("mv" a=stmt b=stmt { r = new CatalogType(ctlFiles.moveFile(a, b)); } ) |
	#("del" a=stmt { r = new CatalogType(ctlFiles.deleteFile(a)); } ) |
	#(FOR f:"foreach"  {
		AST var = #f.getFirstChild();
		AST flag = var.getNextSibling();
		String path = flag.getNextSibling().getText();
		java.util.List list = ctlFiles.getFiles(new CatalogType(path), flag.getText());
		for (int i = 0; i < list.size(); i++) {
			ctlTable.put(var.getText(), (CatalogType)list.get(i));
			r = stmts(flag.getNextSibling());
		}
	} ) |
	#(ASSIGN VAR a=stmt { ctlTable.put(#VAR.getText(), a); } ) |
	#(OR a=firstOr:stmt {
		r = new CatalogType(a.isTrue() ? true : stmt(firstOr.getNextSibling()).isTrue()); } ) |
	#(AND a=stmt b=stmt { r = new CatalogType(a.isTrue() && b.isTrue()); } ) |
	#(EQ a=stmt b=stmt { r = a.equals(b); } ) |
	#(NOTEQ a=stmt b=stmt { r = a.notEquals(b); } ) |
	#(LESS a=stmt b=stmt { r = a.lessThan(b); } ) |
	#(LESSEQ a=stmt b=stmt { r = a.lessThanOrEquals(b); } ) |
	#(GREAT a=stmt b=stmt { r = a.greaterThan(b); } ) |
	#(GREATEQ a=stmt b=stmt { r = a.greaterThanOrEquals(b); } ) |
	#(PLUS a=stmt b=stmt { r = a.add(b); } ) |
	#(MINUS a=stmt b=stmt { r = a.subtract(b); } ) |
	#(TIMES a=stmt b=stmt { r = a.multiply(b); } ) |
	#(DIV a=stmt b=stmt { r = a.divide(b); } ) |
	#(PERIOD a=property:stmt {
		r = a.getProperty(property.getNextSibling().getText()); } ) |
	#(LPAREN a=pattern:stmt {
		r = a.applyPattern(stmt(pattern.getNextSibling()).getStrValue()); } ) |
	#(VAR {
		if ( !(ctlTable.containsKey(#VAR.getText()))) {
			System.err.println("unknown variable " + #VAR.getText()); 
		}
		r = (CatalogType)ctlTable.get(#VAR.getText());
	} ) |
	#(NUMBER { r = new CatalogType(#NUMBER.getText()); } ) |
	#(STRING { r = new CatalogType(#STRING.getText()); } ) |
	#(REVERSE a=stmt { r = new CatalogType(-a.getIntValue()); } ) |
	#(TRUE { r = new CatalogType(true); } ) |
	#(FALSE { r = new CatalogType(false); } )
;