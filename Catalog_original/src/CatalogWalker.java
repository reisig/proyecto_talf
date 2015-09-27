// $ANTLR 2.7.7 (20060930): "Catalog.g" -> "CatalogWalker.java"$

import antlr.NoViableAltException;
import antlr.RecognitionException;
import antlr.collections.AST;
import antlr.collections.impl.BitSet;


public class CatalogWalker extends antlr.TreeParser       implements CatalogLexerTokenTypes
 {
 
	CatalogTable ctlTable = new CatalogTable(); // stores variables
	CatalogFiles ctlFiles = new CatalogFiles(); // handles essential file operations
	public CatalogWalker() {
	    tokenNames = _tokenNames;
	}

	public final void file(AST _t) throws RecognitionException {
		
		AST file_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		CatalogType a;
		
		try {      // for error handling
			AST __t88 = _t;
			AST tmp1_AST_in = (AST)_t;
			match(_t,STATEMENTS);
			_t = _t.getFirstChild();
			{
			_loop90:
			do {
				if (_t==null) _t=ASTNULL;
				if ((_tokenSet_0.member(_t.getType()))) {
					a=stmt(_t);
					_t = _retTree;
				}
				else {
					break _loop90;
				}
				
			} while (true);
			}
			_t = __t88;
			_t = _t.getNextSibling();
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
	}
	
	public final CatalogType  stmt(AST _t) throws RecognitionException {
		CatalogType r;
		
		AST stmt_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		AST ifCond = null;
		AST f = null;
		AST firstOr = null;
		AST property = null;
		AST pattern = null;
		
				r = null;
				CatalogType a = null;
				CatalogType b = null;
			
		
		try {      // for error handling
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case LITERAL_print:
			{
				AST __t94 = _t;
				AST tmp2_AST_in = (AST)_t;
				match(_t,LITERAL_print);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				System.out.println(a); r = new CatalogType(true);
				_t = __t94;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_if:
			{
				AST __t95 = _t;
				AST tmp3_AST_in = (AST)_t;
				match(_t,LITERAL_if);
				_t = _t.getFirstChild();
				ifCond = _t==ASTNULL ? null : (AST)_t;
				a=stmt(_t);
				_t = _retTree;
				if (a.isTrue()) { r = stmts(ifCond.getNextSibling()); }
				_t = __t95;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_cp:
			{
				AST __t96 = _t;
				AST tmp4_AST_in = (AST)_t;
				match(_t,LITERAL_cp);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = new CatalogType(ctlFiles.copyFile(a, b));
				_t = __t96;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_mv:
			{
				AST __t97 = _t;
				AST tmp5_AST_in = (AST)_t;
				match(_t,LITERAL_mv);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = new CatalogType(ctlFiles.moveFile(a, b));
				_t = __t97;
				_t = _t.getNextSibling();
				break;
			}
			case LITERAL_del:
			{
				AST __t98 = _t;
				AST tmp6_AST_in = (AST)_t;
				match(_t,LITERAL_del);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				r = new CatalogType(ctlFiles.deleteFile(a));
				_t = __t98;
				_t = _t.getNextSibling();
				break;
			}
			case FOR:
			{
				AST __t99 = _t;
				AST tmp7_AST_in = (AST)_t;
				match(_t,FOR);
				_t = _t.getFirstChild();
				f = (AST)_t;
				match(_t,LITERAL_foreach);
				_t = _t.getNextSibling();
				
						AST var = f.getFirstChild();
						AST flag = var.getNextSibling();
						String path = flag.getNextSibling().getText();
						java.util.List list = ctlFiles.getFiles(new CatalogType(path), flag.getText());
						for (int i = 0; i < list.size(); i++) {
							ctlTable.put(var.getText(), (CatalogType)list.get(i));
							r = stmts(flag.getNextSibling());
						}
					
				_t = __t99;
				_t = _t.getNextSibling();
				break;
			}
			case ASSIGN:
			{
				AST __t100 = _t;
				AST tmp8_AST_in = (AST)_t;
				match(_t,ASSIGN);
				_t = _t.getFirstChild();
				AST tmp9_AST_in = (AST)_t;
				match(_t,VAR);
				_t = _t.getNextSibling();
				a=stmt(_t);
				_t = _retTree;
				ctlTable.put(tmp9_AST_in.getText(), a);
				_t = __t100;
				_t = _t.getNextSibling();
				break;
			}
			case OR:
			{
				AST __t101 = _t;
				AST tmp10_AST_in = (AST)_t;
				match(_t,OR);
				_t = _t.getFirstChild();
				firstOr = _t==ASTNULL ? null : (AST)_t;
				a=stmt(_t);
				_t = _retTree;
				
						r = new CatalogType(a.isTrue() ? true : stmt(firstOr.getNextSibling()).isTrue());
				_t = __t101;
				_t = _t.getNextSibling();
				break;
			}
			case AND:
			{
				AST __t102 = _t;
				AST tmp11_AST_in = (AST)_t;
				match(_t,AND);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = new CatalogType(a.isTrue() && b.isTrue());
				_t = __t102;
				_t = _t.getNextSibling();
				break;
			}
			case EQ:
			{
				AST __t103 = _t;
				AST tmp12_AST_in = (AST)_t;
				match(_t,EQ);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.equals(b);
				_t = __t103;
				_t = _t.getNextSibling();
				break;
			}
			case NOTEQ:
			{
				AST __t104 = _t;
				AST tmp13_AST_in = (AST)_t;
				match(_t,NOTEQ);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.notEquals(b);
				_t = __t104;
				_t = _t.getNextSibling();
				break;
			}
			case LESS:
			{
				AST __t105 = _t;
				AST tmp14_AST_in = (AST)_t;
				match(_t,LESS);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.lessThan(b);
				_t = __t105;
				_t = _t.getNextSibling();
				break;
			}
			case LESSEQ:
			{
				AST __t106 = _t;
				AST tmp15_AST_in = (AST)_t;
				match(_t,LESSEQ);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.lessThanOrEquals(b);
				_t = __t106;
				_t = _t.getNextSibling();
				break;
			}
			case GREAT:
			{
				AST __t107 = _t;
				AST tmp16_AST_in = (AST)_t;
				match(_t,GREAT);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.greaterThan(b);
				_t = __t107;
				_t = _t.getNextSibling();
				break;
			}
			case GREATEQ:
			{
				AST __t108 = _t;
				AST tmp17_AST_in = (AST)_t;
				match(_t,GREATEQ);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.greaterThanOrEquals(b);
				_t = __t108;
				_t = _t.getNextSibling();
				break;
			}
			case PLUS:
			{
				AST __t109 = _t;
				AST tmp18_AST_in = (AST)_t;
				match(_t,PLUS);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.add(b);
				_t = __t109;
				_t = _t.getNextSibling();
				break;
			}
			case MINUS:
			{
				AST __t110 = _t;
				AST tmp19_AST_in = (AST)_t;
				match(_t,MINUS);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.subtract(b);
				_t = __t110;
				_t = _t.getNextSibling();
				break;
			}
			case TIMES:
			{
				AST __t111 = _t;
				AST tmp20_AST_in = (AST)_t;
				match(_t,TIMES);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.multiply(b);
				_t = __t111;
				_t = _t.getNextSibling();
				break;
			}
			case DIV:
			{
				AST __t112 = _t;
				AST tmp21_AST_in = (AST)_t;
				match(_t,DIV);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				b=stmt(_t);
				_t = _retTree;
				r = a.divide(b);
				_t = __t112;
				_t = _t.getNextSibling();
				break;
			}
			case PERIOD:
			{
				AST __t113 = _t;
				AST tmp22_AST_in = (AST)_t;
				match(_t,PERIOD);
				_t = _t.getFirstChild();
				property = _t==ASTNULL ? null : (AST)_t;
				a=stmt(_t);
				_t = _retTree;
				
				r = a.getProperty(property.getNextSibling().getText());
				_t = __t113;
				_t = _t.getNextSibling();
				break;
			}
			case LPAREN:
			{
				AST __t114 = _t;
				AST tmp23_AST_in = (AST)_t;
				match(_t,LPAREN);
				_t = _t.getFirstChild();
				pattern = _t==ASTNULL ? null : (AST)_t;
				a=stmt(_t);
				_t = _retTree;
				r = a.applyPattern(stmt(pattern.getNextSibling()).getStrValue());
				_t = __t114;
				_t = _t.getNextSibling();
				break;
			}
			case VAR:
			{
				AST __t115 = _t;
				AST tmp24_AST_in = (AST)_t;
				match(_t,VAR);
				_t = _t.getFirstChild();
				
						if ( !(ctlTable.containsKey(tmp24_AST_in.getText()))) {
							System.err.println("unknown variable " + tmp24_AST_in.getText()); }
						r = (CatalogType)ctlTable.get(tmp24_AST_in.getText());
					
				_t = __t115;
				_t = _t.getNextSibling();
				break;
			}
			case NUMBER:
			{
				AST __t116 = _t;
				AST tmp25_AST_in = (AST)_t;
				match(_t,NUMBER);
				_t = _t.getFirstChild();
				r = new CatalogType(tmp25_AST_in.getText());
				_t = __t116;
				_t = _t.getNextSibling();
				break;
			}
			case STRING:
			{
				AST __t117 = _t;
				AST tmp26_AST_in = (AST)_t;
				match(_t,STRING);
				_t = _t.getFirstChild();
				r = new CatalogType(tmp26_AST_in.getText());
				_t = __t117;
				_t = _t.getNextSibling();
				break;
			}
			case REVERSE:
			{
				AST __t118 = _t;
				AST tmp27_AST_in = (AST)_t;
				match(_t,REVERSE);
				_t = _t.getFirstChild();
				a=stmt(_t);
				_t = _retTree;
				r = new CatalogType(-a.getIntValue());
				_t = __t118;
				_t = _t.getNextSibling();
				break;
			}
			case TRUE:
			{
				AST __t119 = _t;
				AST tmp28_AST_in = (AST)_t;
				match(_t,TRUE);
				_t = _t.getFirstChild();
				r = new CatalogType(true);
				_t = __t119;
				_t = _t.getNextSibling();
				break;
			}
			case FALSE:
			{
				AST __t120 = _t;
				AST tmp29_AST_in = (AST)_t;
				match(_t,FALSE);
				_t = _t.getFirstChild();
				r = new CatalogType(false);
				_t = __t120;
				_t = _t.getNextSibling();
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return r;
	}
	
	public final CatalogType  stmts(AST _t) throws RecognitionException {
		CatalogType s1;
		
		AST stmts_AST_in = (_t == ASTNULL) ? null : (AST)_t;
		s1 = null; CatalogType s2;
		
		try {      // for error handling
			s1=stmt(_t);
			_t = _retTree;
			{
			if (_t==null) _t=ASTNULL;
			switch ( _t.getType()) {
			case PLUS:
			case MINUS:
			case TIMES:
			case DIV:
			case ASSIGN:
			case LPAREN:
			case PERIOD:
			case EQ:
			case NOTEQ:
			case GREAT:
			case LESS:
			case GREATEQ:
			case LESSEQ:
			case AND:
			case OR:
			case VAR:
			case NUMBER:
			case STRING:
			case REVERSE:
			case FOR:
			case LITERAL_print:
			case LITERAL_if:
			case LITERAL_cp:
			case LITERAL_mv:
			case LITERAL_del:
			case TRUE:
			case FALSE:
			{
				s2=stmts(_t);
				_t = _retTree;
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(_t);
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			if (_t!=null) {_t = _t.getNextSibling();}
		}
		_retTree = _t;
		return s1;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"PLUS",
		"MINUS",
		"TIMES",
		"DIV",
		"ASSIGN",
		"SEMI",
		"LPAREN",
		"RPAREN",
		"LBRACE",
		"RBRACE",
		"PERIOD",
		"EQ",
		"NOTEQ",
		"GREAT",
		"LESS",
		"GREATEQ",
		"LESSEQ",
		"AND",
		"OR",
		"LETTER",
		"DIGIT",
		"ID",
		"VAR",
		"NUMBER",
		"STRING",
		"WS",
		"COMMENTS",
		"STATEMENTS",
		"REVERSE",
		"FOR",
		"\"print\"",
		"\"if\"",
		"\"cp\"",
		"\"mv\"",
		"\"del\"",
		"TRUE",
		"FALSE",
		"\"foreach\"",
		"\"in\"",
		"\"inside\"",
		"\"sortby\""
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2195206424048L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	}
	
