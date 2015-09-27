// Generated from Catalog2.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Catalog2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PLUS=4, MINUS=5, MULT=6, DIV=7, ASSIGN=8, MOD=9, 
		SEMICOLON=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, PERIOD=15, COMMA=16, 
		COLON=17, EQUALS=18, NOTEQ=19, GT=20, LT=21, GTE=22, LTE=23, AND=24, OR=25, 
		TRUE=26, FALSE=27, EXCL=28, PRINT=29, IF=30, COPY=31, MOVE=32, DELETE=33, 
		FOR=34, ELSE=35, ELSEIF=36, IN=37, INSIDE=38, LETTER=39, DIGIT=40, NUMBER=41, 
		ID=42, STRING=43, WS=44, COMMENT=45;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_assignment = 2, RULE_control_flow = 3, 
		RULE_expresion = 4;
	public static final String[] ruleNames = {
		"prog", "statement", "assignment", "control_flow", "expresion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sort'", "'1'", "'-1'", "'+'", "'-'", "'*'", "'/'", "'='", "'%'", 
		"';'", "'('", "')'", "'{'", "'}'", "'.'", "','", "':'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", 
		"'print'", "'if'", "'cp'", "'mv'", "'del'", "'foreach'", "'else'", "'elseif'", 
		"'in'", "'inside'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "MOD", 
		"SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PERIOD", "COMMA", 
		"COLON", "EQUALS", "NOTEQ", "GT", "LT", "GTE", "LTE", "AND", "OR", "TRUE", 
		"FALSE", "EXCL", "PRINT", "IF", "COPY", "MOVE", "DELETE", "FOR", "ELSE", 
		"ELSEIF", "IN", "INSIDE", "LETTER", "DIGIT", "NUMBER", "ID", "STRING", 
		"WS", "COMMENT"
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
	public String getGrammarFileName() { return "Catalog2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Catalog2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Catalog2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Catalog2Parser.SEMICOLON, i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<Control_flowContext> control_flow() {
			return getRuleContexts(Control_flowContext.class);
		}
		public Control_flowContext control_flow(int i) {
			return getRuleContext(Control_flowContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << COPY) | (1L << MOVE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(10);
					statement();
					setState(11);
					match(SEMICOLON);
					}
					}
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(18);
					assignment();
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF || _la==FOR) {
					{
					{
					setState(24);
					control_flow();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(Catalog2Parser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode COPY() { return getToken(Catalog2Parser.COPY, 0); }
		public TerminalNode COMMA() { return getToken(Catalog2Parser.COMMA, 0); }
		public TerminalNode MOVE() { return getToken(Catalog2Parser.MOVE, 0); }
		public TerminalNode DELETE() { return getToken(Catalog2Parser.DELETE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(PRINT);
				setState(33);
				match(LPAREN);
				setState(34);
				expresion(0);
				setState(35);
				match(RPAREN);
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(COPY);
				setState(38);
				match(LPAREN);
				setState(39);
				expresion(0);
				setState(40);
				match(COMMA);
				setState(41);
				expresion(0);
				setState(42);
				match(RPAREN);
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(MOVE);
				setState(45);
				match(LPAREN);
				setState(46);
				expresion(0);
				setState(47);
				match(COMMA);
				setState(48);
				expresion(0);
				setState(49);
				match(RPAREN);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(DELETE);
				setState(52);
				match(LPAREN);
				setState(53);
				expresion(0);
				setState(54);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Catalog2Parser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(ASSIGN);
			setState(60);
			expresion(0);
			setState(61);
			match(SEMICOLON);
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

	public static class Control_flowContext extends ParserRuleContext {
		public Control_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_flow; }
	 
		public Control_flowContext() { }
		public void copyFrom(Control_flowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCycleContext extends Control_flowContext {
		public TerminalNode FOR() { return getToken(Catalog2Parser.FOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Catalog2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Catalog2Parser.LPAREN, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Catalog2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Catalog2Parser.RPAREN, i);
		}
		public TerminalNode LBRACE() { return getToken(Catalog2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Catalog2Parser.RBRACE, 0); }
		public TerminalNode IN() { return getToken(Catalog2Parser.IN, 0); }
		public TerminalNode INSIDE() { return getToken(Catalog2Parser.INSIDE, 0); }
		public TerminalNode COLON() { return getToken(Catalog2Parser.COLON, 0); }
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public TerminalNode COMMA() { return getToken(Catalog2Parser.COMMA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForCycleContext(Control_flowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfConditionContext extends Control_flowContext {
		public TerminalNode IF() { return getToken(Catalog2Parser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Catalog2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Catalog2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Catalog2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Catalog2Parser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(Catalog2Parser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(Catalog2Parser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(Catalog2Parser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(Catalog2Parser.RBRACE, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Catalog2Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Catalog2Parser.ELSE, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(Catalog2Parser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(Catalog2Parser.ELSEIF, i);
		}
		public IfConditionContext(Control_flowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_flowContext control_flow() throws RecognitionException {
		Control_flowContext _localctx = new Control_flowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_flow);
		int _la;
		try {
			setState(131);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(IF);
				setState(64);
				match(LPAREN);
				{
				setState(65);
				expresion(0);
				}
				setState(66);
				match(RPAREN);
				setState(67);
				match(LBRACE);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << COPY) | (1L << MOVE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(68);
					statement();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(RBRACE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(75);
					match(ELSE);
					setState(76);
					match(LBRACE);
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << COPY) | (1L << MOVE) | (1L << DELETE))) != 0)) {
						{
						{
						setState(77);
						statement();
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(83);
					match(RBRACE);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(89);
					match(ELSEIF);
					setState(90);
					match(LPAREN);
					{
					setState(91);
					expresion(0);
					}
					setState(92);
					match(RPAREN);
					setState(93);
					match(LBRACE);
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << COPY) | (1L << MOVE) | (1L << DELETE))) != 0)) {
						{
						{
						setState(94);
						statement();
						}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(100);
					match(RBRACE);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FOR:
				_localctx = new ForCycleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(FOR);
				setState(108);
				match(LPAREN);
				setState(109);
				expresion(0);
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==INSIDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(111);
				expresion(0);
				setState(119);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(112);
					match(COLON);
					setState(113);
					match(T__0);
					setState(114);
					match(LPAREN);
					setState(115);
					match(ID);
					setState(116);
					match(COMMA);
					setState(117);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(118);
					match(RPAREN);
					}
				}

				setState(121);
				match(RPAREN);
				setState(122);
				match(LBRACE);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << COPY) | (1L << MOVE) | (1L << DELETE))) != 0)) {
					{
					{
					setState(123);
					statement();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(RBRACE);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Token tf;
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EXCL() { return getToken(Catalog2Parser.EXCL, 0); }
		public TerminalNode MINUS() { return getToken(Catalog2Parser.MINUS, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(Catalog2Parser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(Catalog2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Catalog2Parser.FALSE, 0); }
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Catalog2Parser.STRING, 0); }
		public TerminalNode PERIOD() { return getToken(Catalog2Parser.PERIOD, 0); }
		public TerminalNode MULT() { return getToken(Catalog2Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(Catalog2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Catalog2Parser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(Catalog2Parser.PLUS, 0); }
		public TerminalNode AND() { return getToken(Catalog2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Catalog2Parser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(Catalog2Parser.EQUALS, 0); }
		public TerminalNode NOTEQ() { return getToken(Catalog2Parser.NOTEQ, 0); }
		public TerminalNode GT() { return getToken(Catalog2Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Catalog2Parser.LT, 0); }
		public TerminalNode GTE() { return getToken(Catalog2Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(Catalog2Parser.LTE, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==EXCL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(135);
				expresion(11);
				}
				break;
			case 2:
				{
				setState(136);
				match(LPAREN);
				setState(137);
				expresion(0);
				setState(138);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(140);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(141);
				((ExpresionContext)_localctx).tf = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((ExpresionContext)_localctx).tf = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				{
				setState(142);
				match(ID);
				}
				break;
			case 6:
				{
				setState(143);
				match(STRING);
				setState(144);
				match(PERIOD);
				setState(145);
				match(ID);
				}
				break;
			case 7:
				{
				setState(146);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(151);
						expresion(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(154);
						expresion(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(AND);
						setState(157);
						expresion(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						match(OR);
						setState(160);
						expresion(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOTEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(163);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2"+
		"\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\5\2!"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5\16"+
		"\5T\13\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5b\n\5"+
		"\f\5\16\5e\13\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082"+
		"\13\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\2\3\n\7\2\4\6"+
		"\b\n\2\t\3\2\'(\3\2\4\5\4\2\7\7\36\36\3\2\34\35\4\2\b\t\13\13\3\2\6\7"+
		"\3\2\24\31\u00c1\2 \3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b\u0085\3\2\2\2\n\u0095"+
		"\3\2\2\2\f\r\5\4\3\2\r\16\7\f\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\23\3\2"+
		"\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22!\3\2\2\2\23\21\3\2\2\2\24\26\5\6\4"+
		"\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30!\3\2\2\2"+
		"\31\27\3\2\2\2\32\34\5\b\5\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 \21\3\2\2\2 \27\3\2\2\2 \35\3"+
		"\2\2\2!\3\3\2\2\2\"#\7\37\2\2#$\7\r\2\2$%\5\n\6\2%&\7\16\2\2&;\3\2\2\2"+
		"\'(\7!\2\2()\7\r\2\2)*\5\n\6\2*+\7\22\2\2+,\5\n\6\2,-\7\16\2\2-;\3\2\2"+
		"\2./\7\"\2\2/\60\7\r\2\2\60\61\5\n\6\2\61\62\7\22\2\2\62\63\5\n\6\2\63"+
		"\64\7\16\2\2\64;\3\2\2\2\65\66\7#\2\2\66\67\7\r\2\2\678\5\n\6\289\7\16"+
		"\2\29;\3\2\2\2:\"\3\2\2\2:\'\3\2\2\2:.\3\2\2\2:\65\3\2\2\2;\5\3\2\2\2"+
		"<=\7,\2\2=>\7\n\2\2>?\5\n\6\2?@\7\f\2\2@\7\3\2\2\2AB\7 \2\2BC\7\r\2\2"+
		"CD\5\n\6\2DE\7\16\2\2EI\7\17\2\2FH\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LX\7\20\2\2MN\7%\2\2NR\7\17\2\2OQ\5\4"+
		"\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UW\7\20"+
		"\2\2VM\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yj\3\2\2\2ZX\3\2\2\2[\\\7"+
		"&\2\2\\]\7\r\2\2]^\5\n\6\2^_\7\16\2\2_c\7\17\2\2`b\5\4\3\2a`\3\2\2\2b"+
		"e\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\20\2\2gi\3\2\2\2"+
		"h[\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\u0086\3\2\2\2lj\3\2\2\2mn\7"+
		"$\2\2no\7\r\2\2op\5\n\6\2pq\t\2\2\2qy\5\n\6\2rs\7\23\2\2st\7\3\2\2tu\7"+
		"\r\2\2uv\7,\2\2vw\7\22\2\2wx\t\3\2\2xz\7\16\2\2yr\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\7\16\2\2|\u0080\7\17\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0086\3\2\2\2\u0085A\3\2\2\2\u0085"+
		"m\3\2\2\2\u0086\t\3\2\2\2\u0087\u0088\b\6\1\2\u0088\u0089\t\4\2\2\u0089"+
		"\u0096\5\n\6\r\u008a\u008b\7\r\2\2\u008b\u008c\5\n\6\2\u008c\u008d\7\16"+
		"\2\2\u008d\u0096\3\2\2\2\u008e\u0096\7+\2\2\u008f\u0096\t\5\2\2\u0090"+
		"\u0096\7,\2\2\u0091\u0092\7-\2\2\u0092\u0093\7\21\2\2\u0093\u0096\7,\2"+
		"\2\u0094\u0096\7-\2\2\u0095\u0087\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008e"+
		"\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u00a8\3\2\2\2\u0097\u0098\f\f\2\2\u0098\u0099\t\6"+
		"\2\2\u0099\u00a7\5\n\6\r\u009a\u009b\f\13\2\2\u009b\u009c\t\7\2\2\u009c"+
		"\u00a7\5\n\6\f\u009d\u009e\f\n\2\2\u009e\u009f\7\32\2\2\u009f\u00a7\5"+
		"\n\6\13\u00a0\u00a1\f\t\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a7\5\n\6\n\u00a3"+
		"\u00a4\f\b\2\2\u00a4\u00a5\t\b\2\2\u00a5\u00a7\5\n\6\t\u00a6\u0097\3\2"+
		"\2\2\u00a6\u009a\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\13\3\2\2\2\u00aa\u00a8\3\2\2\2\22\21\27\35 :IRXcjy\u0080\u0085"+
		"\u0095\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}