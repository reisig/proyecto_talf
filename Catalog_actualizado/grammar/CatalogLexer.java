// Generated from Catalog.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIV=4, ASSIGN=5, SEMI=6, LPAREN=7, RPAREN=8, 
		LBRACE=9, RBRACE=10, PERIOD=11, EQ=12, NOTEQ=13, GREAT=14, LESS=15, GREATEQ=16, 
		LESSEQ=17, AND=18, OR=19, TRUE=20, FALSE=21, PRINT=22, IF=23, COPY=24, 
		MOVE=25, DELETE=26, FOREACH=27, LETTER=28, NUMBER=29, UNDERSC=30, IN=31, 
		INSIDE=32, SORT=33, ID=34, VAR=35, STRING=36, WS=37, COMMENTS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "DIV", "ASSIGN", "SEMI", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "PERIOD", "EQ", "NOTEQ", "GREAT", "LESS", "GREATEQ", 
		"LESSEQ", "AND", "OR", "TRUE", "FALSE", "PRINT", "IF", "COPY", "MOVE", 
		"DELETE", "FOREACH", "LETTER", "NUMBER", "UNDERSC", "IN", "INSIDE", "SORT", 
		"ID", "VAR", "STRING", "WS", "COMMENTS"
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
		"ID", "VAR", "STRING", "WS", "COMMENTS"
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


	    CatalogTable ctlTable = new CatalogTable(); // stores variables
	    CatalogFiles ctlFiles = new CatalogFiles(); // essential file operations


	public CatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Catalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\6\36\u00a5\n\36\r\36\16\36\u00a6\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u00be"+
		"\n#\3#\3#\3#\7#\u00c3\n#\f#\16#\u00c6\13#\3$\3$\3$\3%\3%\3%\3%\7%\u00cf"+
		"\n%\f%\16%\u00d2\13%\3%\3%\3&\3&\3&\3&\3\'\3\'\7\'\u00dc\n\'\f\'\16\'"+
		"\u00df\13\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\4\2C\\c|\3\2\62;\3\2"+
		"$$\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3"+
		"\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31"+
		"e\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#r\3\2\2\2%u\3"+
		"\2\2\2\'x\3\2\2\2){\3\2\2\2+\u0080\3\2\2\2-\u0086\3\2\2\2/\u008c\3\2\2"+
		"\2\61\u008f\3\2\2\2\63\u0092\3\2\2\2\65\u0095\3\2\2\2\67\u0099\3\2\2\2"+
		"9\u00a1\3\2\2\2;\u00a4\3\2\2\2=\u00a8\3\2\2\2?\u00aa\3\2\2\2A\u00ad\3"+
		"\2\2\2C\u00b4\3\2\2\2E\u00bd\3\2\2\2G\u00c7\3\2\2\2I\u00ca\3\2\2\2K\u00d5"+
		"\3\2\2\2M\u00d9\3\2\2\2OP\7-\2\2P\4\3\2\2\2QR\7/\2\2R\6\3\2\2\2ST\7,\2"+
		"\2T\b\3\2\2\2UV\7\61\2\2V\n\3\2\2\2WX\7?\2\2X\f\3\2\2\2YZ\7=\2\2Z\16\3"+
		"\2\2\2[\\\7*\2\2\\\20\3\2\2\2]^\7+\2\2^\22\3\2\2\2_`\7}\2\2`\24\3\2\2"+
		"\2ab\7\177\2\2b\26\3\2\2\2cd\7\60\2\2d\30\3\2\2\2ef\7?\2\2fg\7?\2\2g\32"+
		"\3\2\2\2hi\7#\2\2ij\7?\2\2j\34\3\2\2\2kl\7@\2\2l\36\3\2\2\2mn\7>\2\2n"+
		" \3\2\2\2op\7@\2\2pq\7?\2\2q\"\3\2\2\2rs\7>\2\2st\7?\2\2t$\3\2\2\2uv\7"+
		"(\2\2vw\7(\2\2w&\3\2\2\2xy\7~\2\2yz\7~\2\2z(\3\2\2\2{|\7v\2\2|}\7t\2\2"+
		"}~\7w\2\2~\177\7g\2\2\177*\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7c\2"+
		"\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085,\3\2"+
		"\2\2\u0086\u0087\7r\2\2\u0087\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7p\2\2\u008a\u008b\7v\2\2\u008b.\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7h\2\2\u008e\60\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7r\2\2\u0091\62"+
		"\3\2\2\2\u0092\u0093\7o\2\2\u0093\u0094\7x\2\2\u0094\64\3\2\2\2\u0095"+
		"\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\66\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7c\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a08\3\2\2"+
		"\2\u00a1\u00a2\t\2\2\2\u00a2:\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"<\3\2\2\2\u00a8\u00a9\7a\2\2\u00a9>\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac@\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"B\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7{\2\2\u00baD\3\2\2\2\u00bb"+
		"\u00be\5=\37\2\u00bc\u00be\59\35\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c4\3\2\2\2\u00bf\u00c3\5=\37\2\u00c0\u00c3\59\35\2\u00c1"+
		"\u00c3\5;\36\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"F\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7&\2\2\u00c8\u00c9\5E#\2\u00c9"+
		"H\3\2\2\2\u00ca\u00d0\7$\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cf\7$\2\2\u00cd"+
		"\u00cf\n\4\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7$\2\2\u00d4J\3\2\2\2\u00d5\u00d6\t\5\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\b&\2\2\u00d8L\3\2\2\2\u00d9\u00dd\7%\2\2\u00da"+
		"\u00dc\n\6\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\b\'\2\2\u00e1N\3\2\2\2\n\2\u00a6\u00bd\u00c2\u00c4\u00ce\u00d0"+
		"\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}