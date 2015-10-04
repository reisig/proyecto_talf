package grammar;
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
		WORD=42, ID=43, STRING=44, WS=45, COMMENT=46;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_assignment = 2, RULE_control_flow = 3, 
		RULE_expression = 4;
	public static final String[] ruleNames = {
		"prog", "statement", "assignment", "control_flow", "expression"
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
		"ELSEIF", "IN", "INSIDE", "LETTER", "DIGIT", "NUMBER", "WORD", "ID", "STRING", 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(13);
				switch (_input.LA(1)) {
				case PRINT:
				case COPY:
				case MOVE:
				case DELETE:
					{
					setState(10);
					statement();
					}
					break;
				case ID:
					{
					setState(11);
					assignment();
					}
					break;
				case IF:
				case FOR:
					{
					setState(12);
					control_flow();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(17);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public ExpressionContext VAR;
		public TerminalNode PRINT() { return getToken(Catalog2Parser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteStatementContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(Catalog2Parser.DELETE, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public DeleteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveStatementContext extends StatementContext {
		public TerminalNode MOVE() { return getToken(Catalog2Parser.MOVE, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(Catalog2Parser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public MoveStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitMoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CopyStatementContext extends StatementContext {
		public TerminalNode COPY() { return getToken(Catalog2Parser.COPY, 0); }
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(Catalog2Parser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public CopyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitCopyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(PRINT);
				setState(19);
				match(LPAREN);
				setState(20);
				((PrintStatementContext)_localctx).VAR = expression(0);
				setState(21);
				match(RPAREN);
				setState(22);
				match(SEMICOLON);
				}
				break;
			case COPY:
				_localctx = new CopyStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(COPY);
				setState(25);
				match(LPAREN);
				setState(26);
				expression(0);
				setState(27);
				match(COMMA);
				setState(28);
				expression(0);
				setState(29);
				match(RPAREN);
				setState(30);
				match(SEMICOLON);
				}
				break;
			case MOVE:
				_localctx = new MoveStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(MOVE);
				setState(33);
				match(LPAREN);
				setState(34);
				expression(0);
				setState(35);
				match(COMMA);
				setState(36);
				expression(0);
				setState(37);
				match(RPAREN);
				setState(38);
				match(SEMICOLON);
				}
				break;
			case DELETE:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(DELETE);
				setState(41);
				match(LPAREN);
				setState(42);
				expression(0);
				setState(43);
				match(RPAREN);
				setState(44);
				match(SEMICOLON);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Catalog2Parser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Catalog2Parser.SEMICOLON, 0); }
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(ASSIGN);
			setState(50);
			expression(0);
			setState(51);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public List<Control_flowContext> control_flow() {
			return getRuleContexts(Control_flowContext.class);
		}
		public Control_flowContext control_flow(int i) {
			return getRuleContext(Control_flowContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Control_flowContext> control_flow() {
			return getRuleContexts(Control_flowContext.class);
		}
		public Control_flowContext control_flow(int i) {
			return getRuleContext(Control_flowContext.class,i);
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
			setState(125);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(IF);
				setState(54);
				match(LPAREN);
				{
				setState(55);
				expression(0);
				}
				setState(56);
				match(RPAREN);
				setState(57);
				match(LBRACE);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOR))) != 0)) {
					{
					setState(60);
					switch (_input.LA(1)) {
					case PRINT:
					case COPY:
					case MOVE:
					case DELETE:
						{
						setState(58);
						statement();
						}
						break;
					case IF:
					case FOR:
						{
						setState(59);
						control_flow();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(RBRACE);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(66);
					match(ELSE);
					setState(67);
					match(LBRACE);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOR))) != 0)) {
						{
						setState(70);
						switch (_input.LA(1)) {
						case PRINT:
						case COPY:
						case MOVE:
						case DELETE:
							{
							setState(68);
							statement();
							}
							break;
						case IF:
						case FOR:
							{
							setState(69);
							control_flow();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(75);
					match(RBRACE);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(81);
					match(ELSEIF);
					setState(82);
					match(LPAREN);
					{
					setState(83);
					expression(0);
					}
					setState(84);
					match(RPAREN);
					setState(85);
					match(LBRACE);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOR))) != 0)) {
						{
						setState(88);
						switch (_input.LA(1)) {
						case PRINT:
						case COPY:
						case MOVE:
						case DELETE:
							{
							setState(86);
							statement();
							}
							break;
						case IF:
						case FOR:
							{
							setState(87);
							control_flow();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(93);
					match(RBRACE);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FOR:
				_localctx = new ForCycleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(FOR);
				setState(101);
				match(LPAREN);
				setState(102);
				expression(0);
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==IN || _la==INSIDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(104);
				expression(0);
				setState(112);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(105);
					match(COLON);
					setState(106);
					match(T__0);
					setState(107);
					match(LPAREN);
					setState(108);
					match(ID);
					setState(109);
					match(COMMA);
					setState(110);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(111);
					match(RPAREN);
					}
				}

				setState(114);
				match(RPAREN);
				setState(115);
				match(LBRACE);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << COPY) | (1L << MOVE) | (1L << DELETE) | (1L << FOR))) != 0)) {
					{
					setState(118);
					switch (_input.LA(1)) {
					case PRINT:
					case COPY:
					case MOVE:
					case DELETE:
						{
						setState(116);
						statement();
						}
						break;
					case IF:
					case FOR:
						{
						setState(117);
						control_flow();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXCL() { return getToken(Catalog2Parser.EXCL, 0); }
		public NegationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpressionContext {
		public Token VAR;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Catalog2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Catalog2Parser.MINUS, 0); }
		public PlusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ExpressionContext {
		public Token VAR;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(Catalog2Parser.EQUALS, 0); }
		public TerminalNode NOTEQ() { return getToken(Catalog2Parser.NOTEQ, 0); }
		public TerminalNode GT() { return getToken(Catalog2Parser.GT, 0); }
		public TerminalNode LT() { return getToken(Catalog2Parser.LT, 0); }
		public TerminalNode GTE() { return getToken(Catalog2Parser.GTE, 0); }
		public TerminalNode LTE() { return getToken(Catalog2Parser.LTE, 0); }
		public ComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivModContext extends ExpressionContext {
		public Token VAR;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(Catalog2Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(Catalog2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Catalog2Parser.MOD, 0); }
		public MultDivModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDotIdContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Catalog2Parser.STRING, 0); }
		public TerminalNode PERIOD() { return getToken(Catalog2Parser.PERIOD, 0); }
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public StringDotIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitStringDotId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(Catalog2Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Catalog2Parser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOperatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Catalog2Parser.AND, 0); }
		public AndOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitAndOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrOperatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Catalog2Parser.OR, 0); }
		public OrOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public Token VAR;
		public TerminalNode STRING() { return getToken(Catalog2Parser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertNumberContext extends ExpressionContext {
		public Token VAR;
		public TerminalNode NUMBER() { return getToken(Catalog2Parser.NUMBER, 0); }
		public TerminalNode DIGIT() { return getToken(Catalog2Parser.DIGIT, 0); }
		public InsertNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitInsertNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueFalseContext extends ExpressionContext {
		public Token VAR;
		public TerminalNode TRUE() { return getToken(Catalog2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Catalog2Parser.FALSE, 0); }
		public TrueFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitTrueFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertVariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public InsertVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitInsertVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdDotWordContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(Catalog2Parser.ID, 0); }
		public TerminalNode PERIOD() { return getToken(Catalog2Parser.PERIOD, 0); }
		public TerminalNode WORD() { return getToken(Catalog2Parser.WORD, 0); }
		public IdDotWordContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Catalog2Visitor ) return ((Catalog2Visitor<? extends T>)visitor).visitIdDotWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				{
				setState(128);
				match(EXCL);
				}
				setState(129);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LPAREN);
				setState(131);
				expression(0);
				setState(132);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new InsertNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				((InsertNumberContext)_localctx).VAR = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==NUMBER) ) {
					((InsertNumberContext)_localctx).VAR = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new TrueFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				((TrueFalseContext)_localctx).VAR = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((TrueFalseContext)_localctx).VAR = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new InsertVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new StringDotIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(STRING);
				setState(138);
				match(PERIOD);
				setState(139);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IdDotWordContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(ID);
				setState(141);
				match(PERIOD);
				setState(142);
				match(WORD);
				}
				break;
			case 8:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				((StringExpressionContext)_localctx).VAR = match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(147);
						((MultDivModContext)_localctx).VAR = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultDivModContext)_localctx).VAR = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(148);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(150);
						((PlusMinusContext)_localctx).VAR = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).VAR = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(151);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AndOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(153);
						match(AND);
						setState(154);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new OrOperatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						match(OR);
						setState(157);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						((ComparisonContext)_localctx).VAR = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOTEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((ComparisonContext)_localctx).VAR = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(160);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\7\5b\n\5\f\5\16\5e"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\5\3\5"+
		"\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a4\n\6"+
		"\f\6\16\6\u00a7\13\6\3\6\2\3\n\7\2\4\6\b\n\2\t\3\2\'(\3\2\4\5\3\2*+\3"+
		"\2\34\35\4\2\b\t\13\13\3\2\6\7\3\2\24\31\u00c1\2\21\3\2\2\2\4\60\3\2\2"+
		"\2\6\62\3\2\2\2\b\177\3\2\2\2\n\u0092\3\2\2\2\f\20\5\4\3\2\r\20\5\6\4"+
		"\2\16\20\5\b\5\2\17\f\3\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\23\3\2\2\2"+
		"\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\7\37\2\2"+
		"\25\26\7\r\2\2\26\27\5\n\6\2\27\30\7\16\2\2\30\31\7\f\2\2\31\61\3\2\2"+
		"\2\32\33\7!\2\2\33\34\7\r\2\2\34\35\5\n\6\2\35\36\7\22\2\2\36\37\5\n\6"+
		"\2\37 \7\16\2\2 !\7\f\2\2!\61\3\2\2\2\"#\7\"\2\2#$\7\r\2\2$%\5\n\6\2%"+
		"&\7\22\2\2&\'\5\n\6\2\'(\7\16\2\2()\7\f\2\2)\61\3\2\2\2*+\7#\2\2+,\7\r"+
		"\2\2,-\5\n\6\2-.\7\16\2\2./\7\f\2\2/\61\3\2\2\2\60\24\3\2\2\2\60\32\3"+
		"\2\2\2\60\"\3\2\2\2\60*\3\2\2\2\61\5\3\2\2\2\62\63\7-\2\2\63\64\7\n\2"+
		"\2\64\65\5\n\6\2\65\66\7\f\2\2\66\7\3\2\2\2\678\7 \2\289\7\r\2\29:\5\n"+
		"\6\2:;\7\16\2\2;@\7\17\2\2<?\5\4\3\2=?\5\b\5\2><\3\2\2\2>=\3\2\2\2?B\3"+
		"\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CP\7\20\2\2DE\7%\2\2EJ\7"+
		"\17\2\2FI\5\4\3\2GI\5\b\5\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK"+
		"\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MO\7\20\2\2ND\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2Qc\3\2\2\2RP\3\2\2\2ST\7&\2\2TU\7\r\2\2UV\5\n\6\2VW\7\16\2\2"+
		"W\\\7\17\2\2X[\5\4\3\2Y[\5\b\5\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\20\2\2`b\3\2\2\2aS\3\2\2\2be"+
		"\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\u0080\3\2\2\2ec\3\2\2\2fg\7$\2\2gh\7\r\2"+
		"\2hi\5\n\6\2ij\t\2\2\2jr\5\n\6\2kl\7\23\2\2lm\7\3\2\2mn\7\r\2\2no\7-\2"+
		"\2op\7\22\2\2pq\t\3\2\2qs\7\16\2\2rk\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\16"+
		"\2\2uz\7\17\2\2vy\5\4\3\2wy\5\b\5\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\20\2\2~\u0080\3\2\2\2\177\67"+
		"\3\2\2\2\177f\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082\b\6\1\2\u0082\u0083"+
		"\7\36\2\2\u0083\u0093\5\n\6\16\u0084\u0085\7\r\2\2\u0085\u0086\5\n\6\2"+
		"\u0086\u0087\7\16\2\2\u0087\u0093\3\2\2\2\u0088\u0093\t\4\2\2\u0089\u0093"+
		"\t\5\2\2\u008a\u0093\7-\2\2\u008b\u008c\7.\2\2\u008c\u008d\7\21\2\2\u008d"+
		"\u0093\7-\2\2\u008e\u008f\7-\2\2\u008f\u0090\7\21\2\2\u0090\u0093\7,\2"+
		"\2\u0091\u0093\7.\2\2\u0092\u0081\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0088"+
		"\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u00a5\3\2\2\2\u0094\u0095\f\r"+
		"\2\2\u0095\u0096\t\6\2\2\u0096\u00a4\5\n\6\16\u0097\u0098\f\f\2\2\u0098"+
		"\u0099\t\7\2\2\u0099\u00a4\5\n\6\r\u009a\u009b\f\13\2\2\u009b\u009c\7"+
		"\32\2\2\u009c\u00a4\5\n\6\f\u009d\u009e\f\n\2\2\u009e\u009f\7\33\2\2\u009f"+
		"\u00a4\5\n\6\13\u00a0\u00a1\f\t\2\2\u00a1\u00a2\t\b\2\2\u00a2\u00a4\5"+
		"\n\6\n\u00a3\u0094\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a5\3\2\2\2\24\17\21"+
		"\60>@HJPZ\\crxz\177\u0092\u00a3\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}