/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Catalog;

tokens { STATEMENTS, REVERSE, FOR }

@members {
    CatalogTable ctlTable = new CatalogTable(); // stores variables
    CatalogFiles ctlFiles = new CatalogFiles(); // essential file operations
}

file locals [CatalogType a] : (stmt SEMI)* EOF;	

stmt returns [CatalogType r] locals [CatalogType r; CatalogType a; CatalogType b;]:
	PRINT (stmt|STRING|NUMBER)
	|	IF or LBRACE (stmt SEMI)* RBRACE   
	|	COPY stmt STRING   		
	| 	MOVE stmt STRING 		
	| 	DELETE stmt 
	|	foreach	
	|	VAR ASSIGN stmt 
	|	or 
        ;		
	
or: and (OR and)*; // ||

and: eqneq (AND eqneq)*; // &&

eqneq: comp ((EQ | NOTEQ) comp)*; // == and !=

comp: addsub ((LESS | LESSEQ | GREAT | GREATEQ) addsub)*; // <, <=, >, >=

addsub: multdiv ((PLUS | MINUS) multdiv)*; // + and -

multdiv: pattern ((TIMES | DIV) pattern)*; // * and /

pattern: property (LPAREN property RPAREN)*;

property: basic (PERIOD basic)*;

basic: 	(ID|VAR|NUMBER|STRING)
        |  MINUS basic 
        |  (TRUE|FALSE)
        |  LPAREN stmt RPAREN ; // basic element
		
foreach: FOREACH VAR (IN | INSIDE) filelist (sort)? LBRACE (stmt SEMI)* RBRACE;

sort: SORT ID ((PLUS|MINUS))?;

filelist: STRING (PERIOD ID)*;

// arithmetic
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
ASSIGN: '=';

// grouping/separating
SEMI: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
PERIOD: '.';

// comparison
EQ: '==';
NOTEQ: '!=';
GREAT: '>';
LESS: '<';
GREATEQ:'>=';
LESSEQ: '<=';

// logical
AND: '&&';
OR: '||';
TRUE: 'true';
FALSE: 'false';

// keywords/commands
PRINT: 'print';
IF: 'if';
COPY: 'cp';
MOVE: 'mv';
DELETE: 'del';
FOREACH: 'foreach';

LETTER : [a-zA-Z];
NUMBER : [0-9]+;
UNDERSC: '_';

IN : 'in';
INSIDE : 'inside';
SORT : 'sortby';

ID : (UNDERSC|LETTER)(UNDERSC|LETTER|NUMBER)*;

VAR: '$' ID;
STRING: '"' ( '"' '"' | ~('"'))* '"'; // string, escape " with ")
WS: (' '|'\t'|'\n'|'\r') -> skip; // white space
COMMENTS: '#'(~('\n'|'\r'))* -> skip; // single line comments
