// Generated from /Users/jordanly/Documents/workspace/ra-interpreter/src/main/java/ra/grammar/RAGrammar.g4 by ANTLR 4.5.1
package ra.grammar;
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
		LT=22, LTE=23, GT=24, GTE=25, NOT_EQUALS=26, STRING_LITERAL=27, VALUE=28, 
		COMMENT=29, SINGLELINE_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "NOT", "LIKE", "DIGIT", "ALPHA", "WS", "LEFT_PAREN", "RIGHT_PAREN", 
		"STATEMENT_TERMINATOR", "COMMA", "TABLE_NAME", "SELECT", "PROJECT", "JOIN", 
		"CROSS", "UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_BRACE", "RIGHT_BRACE", 
		"EQUALS", "LT", "LTE", "GT", "GTE", "NOT_EQUALS", "STRING_LITERAL", "VALUE", 
		"COMMENT", "SINGLELINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", null, "'('", "')'", "';'", "','", 
		null, "'\\select'", "'\\project'", "'\\join'", "'\\cross'", "'\\union'", 
		"'\\diff'", "'\\intersect'", "'\\rename'", "'_{'", "'}'", "'='", "'<'", 
		"'<='", "'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "WS", "LEFT_PAREN", "RIGHT_PAREN", "STATEMENT_TERMINATOR", 
		"COMMA", "TABLE_NAME", "SELECT", "PROJECT", "JOIN", "CROSS", "UNION", 
		"DIFF", "INTERSECT", "RENAME", "LEFT_BRACE", "RIGHT_BRACE", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "NOT_EQUALS", "STRING_LITERAL", "VALUE", "COMMENT", 
		"SINGLELINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\6\7W\n\7\r\7\16\7X\3\b\6\b\\\n\b\r\b\16\b]\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\rn\n\r\f\r\16\rq\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u00c8\n\36\f\36\16\36\u00cb\13\36\3\36\3\36\3\37\6\37\u00d0\n\37"+
		"\r\37\16\37\u00d1\3 \3 \3 \3 \7 \u00d8\n \f \16 \u00db\13 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\7!\u00e6\n!\f!\16!\u00e9\13!\3!\3!\4\u00c9\u00d9\2\""+
		"\3\3\5\4\7\5\t\6\13\2\r\2\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37"+
		"\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35="+
		"\36?\37A \3\2\7\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\4\2))``\4\2\f\f\17"+
		"\17\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tN\3\2\2\2\13"+
		"S\3\2\2\2\rV\3\2\2\2\17[\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27"+
		"g\3\2\2\2\31i\3\2\2\2\33r\3\2\2\2\35z\3\2\2\2\37\u0083\3\2\2\2!\u0089"+
		"\3\2\2\2#\u0090\3\2\2\2%\u0097\3\2\2\2\'\u009d\3\2\2\2)\u00a8\3\2\2\2"+
		"+\u00b0\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9"+
		"\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c4\3\2\2"+
		"\2=\u00cf\3\2\2\2?\u00d3\3\2\2\2A\u00e1\3\2\2\2CD\7c\2\2DE\7p\2\2EF\7"+
		"f\2\2F\4\3\2\2\2GH\7q\2\2HI\7t\2\2I\6\3\2\2\2JK\7p\2\2KL\7q\2\2LM\7v\2"+
		"\2M\b\3\2\2\2NO\7n\2\2OP\7k\2\2PQ\7m\2\2QR\7g\2\2R\n\3\2\2\2ST\t\2\2\2"+
		"T\f\3\2\2\2UW\t\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\16\3\2"+
		"\2\2Z\\\t\4\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b"+
		"\b\2\2`\20\3\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7+\2\2d\24\3\2\2\2ef\7=\2\2"+
		"f\26\3\2\2\2gh\7.\2\2h\30\3\2\2\2io\5\r\7\2jn\5\r\7\2kn\5\13\6\2ln\7a"+
		"\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\32\3"+
		"\2\2\2qo\3\2\2\2rs\7^\2\2st\7u\2\2tu\7g\2\2uv\7n\2\2vw\7g\2\2wx\7e\2\2"+
		"xy\7v\2\2y\34\3\2\2\2z{\7^\2\2{|\7r\2\2|}\7t\2\2}~\7q\2\2~\177\7l\2\2"+
		"\177\u0080\7g\2\2\u0080\u0081\7e\2\2\u0081\u0082\7v\2\2\u0082\36\3\2\2"+
		"\2\u0083\u0084\7^\2\2\u0084\u0085\7l\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7p\2\2\u0088 \3\2\2\2\u0089\u008a\7^\2\2\u008a\u008b"+
		"\7e\2\2\u008b\u008c\7t\2\2\u008c\u008d\7q\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7u\2\2\u008f\"\3\2\2\2\u0090\u0091\7^\2\2\u0091\u0092\7w\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2"+
		"\u0096$\3\2\2\2\u0097\u0098\7^\2\2\u0098\u0099\7f\2\2\u0099\u009a\7k\2"+
		"\2\u009a\u009b\7h\2\2\u009b\u009c\7h\2\2\u009c&\3\2\2\2\u009d\u009e\7"+
		"^\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7^\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00ae\7o\2\2\u00ae\u00af\7g\2\2\u00af*\3\2\2\2\u00b0\u00b1\7a\2"+
		"\2\u00b1\u00b2\7}\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4.\3\2"+
		"\2\2\u00b5\u00b6\7?\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\62\3"+
		"\2\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bb\7?\2\2\u00bb\64\3\2\2\2\u00bc\u00bd"+
		"\7@\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c08"+
		"\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7@\2\2\u00c3:\3\2\2\2\u00c4\u00c9"+
		"\7)\2\2\u00c5\u00c8\13\2\2\2\u00c6\u00c8\t\5\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7)\2\2\u00cd"+
		"<\3\2\2\2\u00ce\u00d0\5\13\6\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7"+
		"\61\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\13\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd"+
		"\u00de\7\61\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b \3\2\u00e0@\3\2\2\2"+
		"\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6"+
		"\n\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b!"+
		"\3\2\u00ebB\3\2\2\2\f\2X]mo\u00c7\u00c9\u00d1\u00d9\u00e7\4\b\2\2\2\3"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}