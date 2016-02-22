// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RAGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, LIKE=4, WS=5, LEFT_PAREN=6, RIGHT_PAREN=7, STATEMENT_TERMINATOR=8, 
		COMMA=9, TABLE_NAME=10, SELECT=11, PROJECT=12, JOIN=13, CROSS=14, UNION=15, 
		DIFF=16, INTERSECT=17, RENAME=18, LEFT_BRACE=19, RIGHT_BRACE=20, EQUALS=21, 
		LT=22, LTE=23, GT=24, GTE=25, NOT_EQUALS=26, STRING_LITERAL=27, INT=28, 
		FLOAT=29, COMMENT=30, SINGLELINE_COMMENT=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "LIKE", "DIGIT", "ALPHA", "WS", "LEFT_PAREN", "RIGHT_PAREN", 
		"STATEMENT_TERMINATOR", "COMMA", "TABLE_NAME", "SELECT", "PROJECT", "JOIN", 
		"CROSS", "UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_BRACE", "RIGHT_BRACE", 
		"EQUALS", "LT", "LTE", "GT", "GTE", "NOT_EQUALS", "STRING_LITERAL", "INT", 
		"FLOAT", "COMMENT", "SINGLELINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' and '", "' or '", "'not '", "' like '", null, "'('", "')'", "';'", 
		"','", null, "'\\select'", "'\\project'", "'\\join'", "'\\cross'", "'\\union'", 
		"'\\diff'", "'\\intersect'", "'\\rename'", "'_{'", "'}'", "'='", "'<'", 
		"'<='", "'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "WS", "LEFT_PAREN", "RIGHT_PAREN", "STATEMENT_TERMINATOR", 
		"COMMA", "TABLE_NAME", "SELECT", "PROJECT", "JOIN", "CROSS", "UNION", 
		"DIFF", "INTERSECT", "RENAME", "LEFT_BRACE", "RIGHT_BRACE", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "NOT_EQUALS", "STRING_LITERAL", "INT", "FLOAT", 
		"COMMENT", "SINGLELINE_COMMENT"
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


	public RAGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RAGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\6\7`\n\7\r\7\16\7a\3\b"+
		"\6\be\n\b\r\b\16\bf\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00d1\n\36\f\36\16\36\u00d4"+
		"\13\36\3\36\3\36\3\37\6\37\u00d9\n\37\r\37\16\37\u00da\3 \6 \u00de\n "+
		"\r \16 \u00df\3 \3 \6 \u00e4\n \r \16 \u00e5\3!\3!\3!\3!\7!\u00ec\n!\f"+
		"!\16!\u00ef\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00fa\n\"\f\"\16\""+
		"\u00fd\13\"\3\"\3\"\4\u00d2\u00ed\2#\3\3\5\4\7\5\t\6\13\2\r\2\17\7\21"+
		"\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26"+
		"/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!\3\2\7\3\2\62;\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\4\2))``\4\2\f\f\17\17\u0109\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\3E\3\2\2\2\5K\3\2\2\2\7P\3\2\2\2\tU\3\2\2\2\13\\\3\2\2\2\r_\3\2\2"+
		"\2\17d\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2"+
		"\2\2\33{\3\2\2\2\35\u0083\3\2\2\2\37\u008c\3\2\2\2!\u0092\3\2\2\2#\u0099"+
		"\3\2\2\2%\u00a0\3\2\2\2\'\u00a6\3\2\2\2)\u00b1\3\2\2\2+\u00b9\3\2\2\2"+
		"-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2\2\65\u00c5"+
		"\3\2\2\2\67\u00c7\3\2\2\29\u00ca\3\2\2\2;\u00cd\3\2\2\2=\u00d8\3\2\2\2"+
		"?\u00dd\3\2\2\2A\u00e7\3\2\2\2C\u00f5\3\2\2\2EF\7\"\2\2FG\7c\2\2GH\7p"+
		"\2\2HI\7f\2\2IJ\7\"\2\2J\4\3\2\2\2KL\7\"\2\2LM\7q\2\2MN\7t\2\2NO\7\"\2"+
		"\2O\6\3\2\2\2PQ\7p\2\2QR\7q\2\2RS\7v\2\2ST\7\"\2\2T\b\3\2\2\2UV\7\"\2"+
		"\2VW\7n\2\2WX\7k\2\2XY\7m\2\2YZ\7g\2\2Z[\7\"\2\2[\n\3\2\2\2\\]\t\2\2\2"+
		"]\f\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\16\3\2"+
		"\2\2ce\t\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\b"+
		"\2\2i\20\3\2\2\2jk\7*\2\2k\22\3\2\2\2lm\7+\2\2m\24\3\2\2\2no\7=\2\2o\26"+
		"\3\2\2\2pq\7.\2\2q\30\3\2\2\2rx\5\r\7\2sw\5\r\7\2tw\5\13\6\2uw\7a\2\2"+
		"vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\32\3\2\2"+
		"\2zx\3\2\2\2{|\7^\2\2|}\7u\2\2}~\7g\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7v\2\2\u0082\34\3\2\2\2\u0083\u0084\7^\2\2\u0084"+
		"\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7l\2\2"+
		"\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\36\3\2"+
		"\2\2\u008c\u008d\7^\2\2\u008d\u008e\7l\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091 \3\2\2\2\u0092\u0093\7^\2\2\u0093\u0094"+
		"\7e\2\2\u0094\u0095\7t\2\2\u0095\u0096\7q\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7u\2\2\u0098\"\3\2\2\2\u0099\u009a\7^\2\2\u009a\u009b\7w\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7k\2\2\u009d\u009e\7q\2\2\u009e\u009f\7p\2\2"+
		"\u009f$\3\2\2\2\u00a0\u00a1\7^\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7k\2"+
		"\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7h\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7"+
		"^\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7e\2\2\u00af\u00b0\7v\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7c\2\2"+
		"\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7a\2"+
		"\2\u00ba\u00bb\7}\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd.\3\2"+
		"\2\2\u00be\u00bf\7?\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\62\3"+
		"\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4\64\3\2\2\2\u00c5\u00c6"+
		"\7@\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\7?\2\2\u00c98"+
		"\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7@\2\2\u00cc:\3\2\2\2\u00cd\u00d2"+
		"\7)\2\2\u00ce\u00d1\13\2\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6"+
		"<\3\2\2\2\u00d7\u00d9\5\13\6\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db>\3\2\2\2\u00dc\u00de\5"+
		"\13\6\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\60\2\2\u00e2\u00e4\5"+
		"\13\6\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7,\2\2"+
		"\u00e9\u00ed\3\2\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\b!\3\2\u00f4B\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7"+
		"\7\61\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\n\6\2\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\b\"\3\2\u00ffD\3\2\2\2\16\2a"+
		"fvx\u00d0\u00d2\u00da\u00df\u00e5\u00ed\u00fb\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}