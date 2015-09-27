// $ANTLR 2.7.7 (20060930): "Catalog.g" -> "CatalogParser.java"$

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class CatalogParser extends antlr.LLkParser       implements CatalogLexerTokenTypes
 {

protected CatalogParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public CatalogParser(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected CatalogParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public CatalogParser(TokenStream lexer) {
  this(lexer,2);
}

public CatalogParser(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void file() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST file_AST = null;
		
		try {      // for error handling
			{
			_loop43:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					stmt();
					astFactory.addASTChild(currentAST, returnAST);
					match(SEMI);
				}
				else {
					break _loop43;
				}
				
			} while (true);
			}
			match(Token.EOF_TYPE);
			file_AST = (AST)currentAST.root;
			file_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(STATEMENTS)).add(file_AST));
			currentAST.root = file_AST;
			currentAST.child = file_AST!=null &&file_AST.getFirstChild()!=null ?
				file_AST.getFirstChild() : file_AST;
			currentAST.advanceChildToEnd();
			file_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		returnAST = file_AST;
	}
	
	public final void stmt() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST stmt_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_print:
			{
				AST tmp32_AST = null;
				tmp32_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp32_AST);
				match(LITERAL_print);
				stmt();
				astFactory.addASTChild(currentAST, returnAST);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_if:
			{
				AST tmp33_AST = null;
				tmp33_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp33_AST);
				match(LITERAL_if);
				or();
				astFactory.addASTChild(currentAST, returnAST);
				match(LBRACE);
				{
				_loop46:
				do {
					if ((_tokenSet_0.member(LA(1)))) {
						stmt();
						astFactory.addASTChild(currentAST, returnAST);
						match(SEMI);
					}
					else {
						break _loop46;
					}
					
				} while (true);
				}
				match(RBRACE);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_cp:
			{
				AST tmp37_AST = null;
				tmp37_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp37_AST);
				match(LITERAL_cp);
				stmt();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp38_AST = null;
				tmp38_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp38_AST);
				match(STRING);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_mv:
			{
				AST tmp39_AST = null;
				tmp39_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp39_AST);
				match(LITERAL_mv);
				stmt();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp40_AST = null;
				tmp40_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp40_AST);
				match(STRING);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_del:
			{
				AST tmp41_AST = null;
				tmp41_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp41_AST);
				match(LITERAL_del);
				stmt();
				astFactory.addASTChild(currentAST, returnAST);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			case LITERAL_foreach:
			{
				foreach();
				astFactory.addASTChild(currentAST, returnAST);
				stmt_AST = (AST)currentAST.root;
				break;
			}
			default:
				if ((LA(1)==VAR) && (LA(2)==ASSIGN)) {
					AST tmp42_AST = null;
					tmp42_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp42_AST);
					match(VAR);
					AST tmp43_AST = null;
					tmp43_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp43_AST);
					match(ASSIGN);
					stmt();
					astFactory.addASTChild(currentAST, returnAST);
					stmt_AST = (AST)currentAST.root;
				}
				else if ((_tokenSet_2.member(LA(1))) && (_tokenSet_3.member(LA(2)))) {
					or();
					astFactory.addASTChild(currentAST, returnAST);
					stmt_AST = (AST)currentAST.root;
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		returnAST = stmt_AST;
	}
	
	public final void or() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST or_AST = null;
		
		try {      // for error handling
			and();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop49:
			do {
				if ((LA(1)==OR)) {
					AST tmp44_AST = null;
					tmp44_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp44_AST);
					match(OR);
					and();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop49;
				}
				
			} while (true);
			}
			or_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		returnAST = or_AST;
	}
	
	public final void foreach() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST foreach_AST = null;
		Token  v = null;
		AST v_AST = null;
		
		try {      // for error handling
			AST tmp45_AST = null;
			tmp45_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp45_AST);
			match(LITERAL_foreach);
			v = LT(1);
			v_AST = astFactory.create(v);
			astFactory.addASTChild(currentAST, v_AST);
			match(VAR);
			{
			switch ( LA(1)) {
			case LITERAL_in:
			{
				AST tmp46_AST = null;
				tmp46_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp46_AST);
				match(LITERAL_in);
				break;
			}
			case LITERAL_inside:
			{
				AST tmp47_AST = null;
				tmp47_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp47_AST);
				match(LITERAL_inside);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			filelist();
			astFactory.addASTChild(currentAST, returnAST);
			{
			switch ( LA(1)) {
			case LITERAL_sortby:
			{
				sort();
				astFactory.addASTChild(currentAST, returnAST);
				break;
			}
			case LBRACE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(LBRACE);
			{
			_loop80:
			do {
				if ((_tokenSet_0.member(LA(1)))) {
					stmt();
					astFactory.addASTChild(currentAST, returnAST);
					match(SEMI);
				}
				else {
					break _loop80;
				}
				
			} while (true);
			}
			match(RBRACE);
			foreach_AST = (AST)currentAST.root;
			
				foreach_AST = (AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(FOR,"FOR")).add(foreach_AST));
			currentAST.root = foreach_AST;
			currentAST.child = foreach_AST!=null &&foreach_AST.getFirstChild()!=null ?
				foreach_AST.getFirstChild() : foreach_AST;
			currentAST.advanceChildToEnd();
			foreach_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		returnAST = foreach_AST;
	}
	
	public final void and() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST and_AST = null;
		
		try {      // for error handling
			eqneq();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop52:
			do {
				if ((LA(1)==AND)) {
					AST tmp51_AST = null;
					tmp51_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp51_AST);
					match(AND);
					eqneq();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop52;
				}
				
			} while (true);
			}
			and_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
		returnAST = and_AST;
	}
	
	public final void eqneq() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST eqneq_AST = null;
		
		try {      // for error handling
			comp();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop56:
			do {
				if ((LA(1)==EQ||LA(1)==NOTEQ)) {
					{
					switch ( LA(1)) {
					case EQ:
					{
						AST tmp52_AST = null;
						tmp52_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp52_AST);
						match(EQ);
						break;
					}
					case NOTEQ:
					{
						AST tmp53_AST = null;
						tmp53_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp53_AST);
						match(NOTEQ);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					comp();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop56;
				}
				
			} while (true);
			}
			eqneq_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		returnAST = eqneq_AST;
	}
	
	public final void comp() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST comp_AST = null;
		
		try {      // for error handling
			addsub();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop60:
			do {
				if (((LA(1) >= GREAT && LA(1) <= LESSEQ))) {
					{
					switch ( LA(1)) {
					case LESS:
					{
						AST tmp54_AST = null;
						tmp54_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp54_AST);
						match(LESS);
						break;
					}
					case LESSEQ:
					{
						AST tmp55_AST = null;
						tmp55_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp55_AST);
						match(LESSEQ);
						break;
					}
					case GREAT:
					{
						AST tmp56_AST = null;
						tmp56_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp56_AST);
						match(GREAT);
						break;
					}
					case GREATEQ:
					{
						AST tmp57_AST = null;
						tmp57_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp57_AST);
						match(GREATEQ);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					addsub();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop60;
				}
				
			} while (true);
			}
			comp_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		returnAST = comp_AST;
	}
	
	public final void addsub() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST addsub_AST = null;
		
		try {      // for error handling
			multdiv();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop64:
			do {
				if ((LA(1)==PLUS||LA(1)==MINUS)) {
					{
					switch ( LA(1)) {
					case PLUS:
					{
						AST tmp58_AST = null;
						tmp58_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp58_AST);
						match(PLUS);
						break;
					}
					case MINUS:
					{
						AST tmp59_AST = null;
						tmp59_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp59_AST);
						match(MINUS);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					multdiv();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop64;
				}
				
			} while (true);
			}
			addsub_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		returnAST = addsub_AST;
	}
	
	public final void multdiv() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST multdiv_AST = null;
		
		try {      // for error handling
			pattern();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop68:
			do {
				if ((LA(1)==TIMES||LA(1)==DIV)) {
					{
					switch ( LA(1)) {
					case TIMES:
					{
						AST tmp60_AST = null;
						tmp60_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp60_AST);
						match(TIMES);
						break;
					}
					case DIV:
					{
						AST tmp61_AST = null;
						tmp61_AST = astFactory.create(LT(1));
						astFactory.makeASTRoot(currentAST, tmp61_AST);
						match(DIV);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					pattern();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop68;
				}
				
			} while (true);
			}
			multdiv_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
		returnAST = multdiv_AST;
	}
	
	public final void pattern() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST pattern_AST = null;
		
		try {      // for error handling
			property();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop71:
			do {
				if ((LA(1)==LPAREN)) {
					AST tmp62_AST = null;
					tmp62_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp62_AST);
					match(LPAREN);
					property();
					astFactory.addASTChild(currentAST, returnAST);
					match(RPAREN);
				}
				else {
					break _loop71;
				}
				
			} while (true);
			}
			pattern_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_11);
		}
		returnAST = pattern_AST;
	}
	
	public final void property() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST property_AST = null;
		
		try {      // for error handling
			basic();
			astFactory.addASTChild(currentAST, returnAST);
			{
			_loop74:
			do {
				if ((LA(1)==PERIOD)) {
					AST tmp64_AST = null;
					tmp64_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp64_AST);
					match(PERIOD);
					basic();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop74;
				}
				
			} while (true);
			}
			property_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_12);
		}
		returnAST = property_AST;
	}
	
	public final void basic() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST basic_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case ID:
			{
				AST tmp65_AST = null;
				tmp65_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp65_AST);
				match(ID);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case VAR:
			{
				AST tmp66_AST = null;
				tmp66_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp66_AST);
				match(VAR);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case NUMBER:
			{
				AST tmp67_AST = null;
				tmp67_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp67_AST);
				match(NUMBER);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case STRING:
			{
				AST tmp68_AST = null;
				tmp68_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp68_AST);
				match(STRING);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case MINUS:
			{
				AST tmp69_AST = null;
				tmp69_AST = astFactory.create(LT(1));
				astFactory.makeASTRoot(currentAST, tmp69_AST);
				match(MINUS);
				basic();
				astFactory.addASTChild(currentAST, returnAST);
				basic_AST = (AST)currentAST.root;
				basic_AST.setType(REVERSE);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case TRUE:
			{
				AST tmp70_AST = null;
				tmp70_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp70_AST);
				match(TRUE);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case FALSE:
			{
				AST tmp71_AST = null;
				tmp71_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp71_AST);
				match(FALSE);
				basic_AST = (AST)currentAST.root;
				break;
			}
			case LPAREN:
			{
				match(LPAREN);
				stmt();
				astFactory.addASTChild(currentAST, returnAST);
				match(RPAREN);
				basic_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_13);
		}
		returnAST = basic_AST;
	}
	
	public final void filelist() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST filelist_AST = null;
		
		try {      // for error handling
			AST tmp74_AST = null;
			tmp74_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp74_AST);
			match(STRING);
			{
			_loop86:
			do {
				if ((LA(1)==PERIOD)) {
					AST tmp75_AST = null;
					tmp75_AST = astFactory.create(LT(1));
					astFactory.makeASTRoot(currentAST, tmp75_AST);
					match(PERIOD);
					AST tmp76_AST = null;
					tmp76_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp76_AST);
					match(ID);
				}
				else {
					break _loop86;
				}
				
			} while (true);
			}
			filelist_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		returnAST = filelist_AST;
	}
	
	public final void sort() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST sort_AST = null;
		
		try {      // for error handling
			AST tmp77_AST = null;
			tmp77_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp77_AST);
			match(LITERAL_sortby);
			AST tmp78_AST = null;
			tmp78_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp78_AST);
			match(ID);
			{
			switch ( LA(1)) {
			case PLUS:
			case MINUS:
			{
				{
				switch ( LA(1)) {
				case PLUS:
				{
					AST tmp79_AST = null;
					tmp79_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp79_AST);
					match(PLUS);
					break;
				}
				case MINUS:
				{
					AST tmp80_AST = null;
					tmp80_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp80_AST);
					match(MINUS);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			case LBRACE:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			sort_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		returnAST = sort_AST;
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
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 4381369959456L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 1649770759200L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 4381378334448L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 268438016L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 268442112L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 272636416L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 274733568L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 274831872L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 276797952L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 276798000L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 276798192L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 276799216L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 276815600L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 17592186048512L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 4096L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	
	}
