// Generated from Catalog.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIV=4, ASSIGN=5, SEMI=6, LPAREN=7, RPAREN=8, 
		LBRACE=9, RBRACE=10, PERIOD=11, EQ=12, NOTEQ=13, GREAT=14, LESS=15, GREATEQ=16, 
		LESSEQ=17, AND=18, OR=19, TRUE=20, FALSE=21, PRINT=22, IF=23, COPY=24, 
		MOVE=25, DELETE=26, FOREACH=27, LETTER=28, NUMBER=29, UNDERSC=30, IN=31, 
		INSIDE=32, SORT=33, ID=34, VAR=35, STRING=36, WS=37, COMMENTS=38, STATEMENTS=39, 
		REVERSE=40, FOR=41;
	public static final int
		RULE_file = 0, RULE_stmt = 1, RULE_or = 2, RULE_and = 3, RULE_eqneq = 4, 
		RULE_comp = 5, RULE_addsub = 6, RULE_multdiv = 7, RULE_pattern = 8, RULE_property = 9, 
		RULE_basic = 10, RULE_foreach = 11, RULE_sort = 12, RULE_filelist = 13;
	public static final String[] ruleNames = {
		"file", "stmt", "or", "and", "eqneq", "comp", "addsub", "multdiv", "pattern", 
		"property", "basic", "foreach", "sort", "filelist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'('", "')'", "'{'", "'}'", 
		"'.'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", 
		"'false'", "'print'", "'if'", "'cp'", "'mv'", "'del'", "'foreach'", null, 
		null, "'_'", "'in'", "'inside'", "'sortby'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "DIV", "ASSIGN", "SEMI", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "PERIOD", "EQ", "NOTEQ", "GREAT", "LESS", "GREATEQ", 
		"LESSEQ", "AND", "OR", "TRUE", "FALSE", "PRINT", "IF", "COPY", "MOVE", 
		"DELETE", "FOREACH", "LETTER", "NUMBER", "UNDERSC", "IN", "INSIDE", "SORT", 
		"ID", "VAR", "STRING", "WS", "COMMENTS", "STATEMENTS", "REVERSE", "FOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Catalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    CatalogTable ctlTable = new CatalogTable(); // stores variables
	    CatalogFiles ctlFiles = new CatalogFiles(); // essential file operations

	public CatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public CatalogType a;
		public TerminalNode EOF() { return getToken(CatalogParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CatalogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CatalogParser.SEMI, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOREACH) | (1L << NUMBER) | (1L << ID) | (1L << VAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(28);
				stmt();
				setState(29);
				match(SEMI);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public CatalogType r;
		CatalogType a; 
		CatalogType b;
		public TerminalNode PRINT() { return getToken(CatalogParser.PRINT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode STRING() { return getToken(CatalogParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CatalogParser.NUMBER, 0); }
		public TerminalNode IF() { return getToken(CatalogParser.IF, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CatalogParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CatalogParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CatalogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CatalogParser.SEMI, i);
		}
		public TerminalNode COPY() { return getToken(CatalogParser.COPY, 0); }
		public TerminalNode MOVE() { return getToken(CatalogParser.MOVE, 0); }
		public TerminalNode DELETE() { return getToken(CatalogParser.DELETE, 0); }
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public TerminalNode VAR() { return getToken(CatalogParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(CatalogParser.ASSIGN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(PRINT);
				setState(42);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(39);
					stmt();
					}
					break;
				case 2:
					{
					setState(40);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(41);
					match(NUMBER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IF);
				setState(45);
				or();
				setState(46);
				match(LBRACE);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOREACH) | (1L << NUMBER) | (1L << ID) | (1L << VAR) | (1L << STRING))) != 0)) {
					{
					{
					setState(47);
					stmt();
					setState(48);
					match(SEMI);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(COPY);
				setState(58);
				stmt();
				setState(59);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(MOVE);
				setState(62);
				stmt();
				setState(63);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(DELETE);
				setState(66);
				stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				foreach();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(VAR);
				setState(69);
				match(ASSIGN);
				setState(70);
				stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CatalogParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CatalogParser.OR, i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			and();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(75);
				match(OR);
				setState(76);
				and();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public List<EqneqContext> eqneq() {
			return getRuleContexts(EqneqContext.class);
		}
		public EqneqContext eqneq(int i) {
			return getRuleContext(EqneqContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CatalogParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CatalogParser.AND, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			eqneq();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(83);
				match(AND);
				setState(84);
				eqneq();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqneqContext extends ParserRuleContext {
		public List<CompContext> comp() {
			return getRuleContexts(CompContext.class);
		}
		public CompContext comp(int i) {
			return getRuleContext(CompContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(CatalogParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(CatalogParser.EQ, i);
		}
		public List<TerminalNode> NOTEQ() { return getTokens(CatalogParser.NOTEQ); }
		public TerminalNode NOTEQ(int i) {
			return getToken(CatalogParser.NOTEQ, i);
		}
		public EqneqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqneq; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitEqneq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqneqContext eqneq() throws RecognitionException {
		EqneqContext _localctx = new EqneqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eqneq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			comp();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NOTEQ) {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(92);
				comp();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public List<AddsubContext> addsub() {
			return getRuleContexts(AddsubContext.class);
		}
		public AddsubContext addsub(int i) {
			return getRuleContext(AddsubContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(CatalogParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(CatalogParser.LESS, i);
		}
		public List<TerminalNode> LESSEQ() { return getTokens(CatalogParser.LESSEQ); }
		public TerminalNode LESSEQ(int i) {
			return getToken(CatalogParser.LESSEQ, i);
		}
		public List<TerminalNode> GREAT() { return getTokens(CatalogParser.GREAT); }
		public TerminalNode GREAT(int i) {
			return getToken(CatalogParser.GREAT, i);
		}
		public List<TerminalNode> GREATEQ() { return getTokens(CatalogParser.GREATEQ); }
		public TerminalNode GREATEQ(int i) {
			return getToken(CatalogParser.GREATEQ, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			addsub();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREAT) | (1L << LESS) | (1L << GREATEQ) | (1L << LESSEQ))) != 0)) {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREAT) | (1L << LESS) | (1L << GREATEQ) | (1L << LESSEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(100);
				addsub();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddsubContext extends ParserRuleContext {
		public List<MultdivContext> multdiv() {
			return getRuleContexts(MultdivContext.class);
		}
		public MultdivContext multdiv(int i) {
			return getRuleContext(MultdivContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CatalogParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CatalogParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CatalogParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CatalogParser.MINUS, i);
		}
		public AddsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddsubContext addsub() throws RecognitionException {
		AddsubContext _localctx = new AddsubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addsub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			multdiv();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(107);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(108);
				multdiv();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultdivContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CatalogParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CatalogParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CatalogParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CatalogParser.DIV, i);
		}
		public MultdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdiv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitMultdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultdivContext multdiv() throws RecognitionException {
		MultdivContext _localctx = new MultdivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multdiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			pattern();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(116);
				pattern();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CatalogParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CatalogParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CatalogParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CatalogParser.RPAREN, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			property();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(123);
				match(LPAREN);
				setState(124);
				property();
				setState(125);
				match(RPAREN);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public List<BasicContext> basic() {
			return getRuleContexts(BasicContext.class);
		}
		public BasicContext basic(int i) {
			return getRuleContext(BasicContext.class,i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(CatalogParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(CatalogParser.PERIOD, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			basic();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(133);
				match(PERIOD);
				setState(134);
				basic();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CatalogParser.ID, 0); }
		public TerminalNode VAR() { return getToken(CatalogParser.VAR, 0); }
		public TerminalNode NUMBER() { return getToken(CatalogParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(CatalogParser.STRING, 0); }
		public TerminalNode MINUS() { return getToken(CatalogParser.MINUS, 0); }
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CatalogParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CatalogParser.FALSE, 0); }
		public TerminalNode LPAREN() { return getToken(CatalogParser.LPAREN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CatalogParser.RPAREN, 0); }
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basic);
		int _la;
		try {
			setState(148);
			switch (_input.LA(1)) {
			case NUMBER:
			case ID:
			case VAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << ID) | (1L << VAR) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(MINUS);
				setState(142);
				basic();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(LPAREN);
				setState(145);
				stmt();
				setState(146);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CatalogParser.FOREACH, 0); }
		public TerminalNode VAR() { return getToken(CatalogParser.VAR, 0); }
		public FilelistContext filelist() {
			return getRuleContext(FilelistContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CatalogParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CatalogParser.RBRACE, 0); }
		public TerminalNode IN() { return getToken(CatalogParser.IN, 0); }
		public TerminalNode INSIDE() { return getToken(CatalogParser.INSIDE, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CatalogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CatalogParser.SEMI, i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FOREACH);
			setState(151);
			match(VAR);
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==INSIDE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(153);
			filelist();
			setState(155);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(154);
				sort();
				}
			}

			setState(157);
			match(LBRACE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOREACH) | (1L << NUMBER) | (1L << ID) | (1L << VAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(158);
				stmt();
				setState(159);
				match(SEMI);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortContext extends ParserRuleContext {
		public TerminalNode SORT() { return getToken(CatalogParser.SORT, 0); }
		public TerminalNode ID() { return getToken(CatalogParser.ID, 0); }
		public TerminalNode PLUS() { return getToken(CatalogParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CatalogParser.MINUS, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(SORT);
			setState(169);
			match(ID);
			setState(171);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilelistContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CatalogParser.STRING, 0); }
		public List<TerminalNode> PERIOD() { return getTokens(CatalogParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(CatalogParser.PERIOD, i);
		}
		public List<TerminalNode> ID() { return getTokens(CatalogParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CatalogParser.ID, i);
		}
		public FilelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filelist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CatalogVisitor ) return ((CatalogVisitor<? extends T>)visitor).visitFilelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilelistContext filelist() throws RecognitionException {
		FilelistContext _localctx = new FilelistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(STRING);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(174);
				match(PERIOD);
				setState(175);
				match(ID);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65"+
		"\n\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\5\3"+
		"\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7"+
		"\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3"+
		"\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f"+
		"\n\16\n\u0085\13\n\3\13\3\13\3\13\7\13\u008a\n\13\f\13\16\13\u008d\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u009e\n\r\3\r\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\3\17\7\17\u00b3\n\17\f\17"+
		"\16\17\u00b6\13\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\t"+
		"\3\2\16\17\3\2\20\23\3\2\3\4\3\2\5\6\4\2\37\37$&\3\2\26\27\3\2!\"\u00c3"+
		"\2#\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\n\\\3\2\2\2\fd\3\2\2\2\16"+
		"l\3\2\2\2\20t\3\2\2\2\22|\3\2\2\2\24\u0086\3\2\2\2\26\u0096\3\2\2\2\30"+
		"\u0098\3\2\2\2\32\u00aa\3\2\2\2\34\u00af\3\2\2\2\36\37\5\4\3\2\37 \7\b"+
		"\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%"+
		"#\3\2\2\2&\'\7\2\2\3\'\3\3\2\2\2(,\7\30\2\2)-\5\4\3\2*-\7&\2\2+-\7\37"+
		"\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-K\3\2\2\2./\7\31\2\2/\60\5\6\4\2\60"+
		"\66\7\13\2\2\61\62\5\4\3\2\62\63\7\b\2\2\63\65\3\2\2\2\64\61\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\f\2"+
		"\2:K\3\2\2\2;<\7\32\2\2<=\5\4\3\2=>\7&\2\2>K\3\2\2\2?@\7\33\2\2@A\5\4"+
		"\3\2AB\7&\2\2BK\3\2\2\2CD\7\34\2\2DK\5\4\3\2EK\5\30\r\2FG\7%\2\2GH\7\7"+
		"\2\2HK\5\4\3\2IK\5\6\4\2J(\3\2\2\2J.\3\2\2\2J;\3\2\2\2J?\3\2\2\2JC\3\2"+
		"\2\2JE\3\2\2\2JF\3\2\2\2JI\3\2\2\2K\5\3\2\2\2LQ\5\b\5\2MN\7\25\2\2NP\5"+
		"\b\5\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2SQ\3\2\2\2TY"+
		"\5\n\6\2UV\7\24\2\2VX\5\n\6\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\t\3\2\2\2[Y\3\2\2\2\\a\5\f\7\2]^\t\2\2\2^`\5\f\7\2_]\3\2\2\2`c\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2ca\3\2\2\2di\5\16\b\2ef\t\3\2\2fh\5"+
		"\16\b\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2l"+
		"q\5\20\t\2mn\t\4\2\2np\5\20\t\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\17\3\2\2\2sq\3\2\2\2ty\5\22\n\2uv\t\5\2\2vx\5\22\n\2wu\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z\21\3\2\2\2{y\3\2\2\2|\u0083\5\24\13\2}~\7"+
		"\t\2\2~\177\5\24\13\2\177\u0080\7\n\2\2\u0080\u0082\3\2\2\2\u0081}\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\23\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5\26\f\2\u0087\u0088\7\r\2"+
		"\2\u0088\u008a\5\26\f\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0097\t\6\2\2\u008f\u0090\7\4\2\2\u0090\u0097\5\26\f\2\u0091"+
		"\u0097\t\7\2\2\u0092\u0093\7\t\2\2\u0093\u0094\5\4\3\2\u0094\u0095\7\n"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097\27\3\2\2\2\u0098\u0099\7\35\2"+
		"\2\u0099\u009a\7%\2\2\u009a\u009b\t\b\2\2\u009b\u009d\5\34\17\2\u009c"+
		"\u009e\5\32\16\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a5\7\13\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\b\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ad\7$\2\2"+
		"\u00ac\u00ae\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33"+
		"\3\2\2\2\u00af\u00b4\7&\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b3\7$\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\35\3\2\2\2\u00b6\u00b4\3\2\2\2\23#,\66JQYaiqy\u0083\u008b\u0096"+
		"\u009d\u00a5\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}