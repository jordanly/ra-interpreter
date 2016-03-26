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
		AND=1, OR=2, NOT=3, LIKE=4, SELECT=5, PROJECT=6, JOIN=7, CROSS=8, UNION=9, 
		DIFF=10, INTERSECT=11, RENAME=12, LEFT_PAREN=13, RIGHT_PAREN=14, LEFT_BRACE=15, 
		RIGHT_BRACE=16, COMMA=17, DOT=18, STATEMENT_TERMINATOR=19, EQUALS=20, 
		LT=21, LTE=22, GT=23, GTE=24, NOT_EQUALS=25, INT=26, FLOAT=27, STRING_LITERAL=28, 
		ID=29, WHITESPACE=30, COMMENT=31, SINGLELINE_COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "ALPHA", "AND", "OR", "NOT", "LIKE", "SELECT", "PROJECT", "JOIN", 
		"CROSS", "UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACE", "RIGHT_BRACE", "COMMA", "DOT", "STATEMENT_TERMINATOR", "EQUALS", 
		"LT", "LTE", "GT", "GTE", "NOT_EQUALS", "INT", "FLOAT", "STRING_LITERAL", 
		"ID", "WHITESPACE", "COMMENT", "SINGLELINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'not'", "'like'", "'\\select'", "'\\project'", 
		"'\\join'", "'\\cross'", "'\\union'", "'\\diff'", "'\\intersect'", "'\\rename'", 
		"'('", "')'", "'_{'", "'}'", "','", "'.'", "';'", "'='", "'<'", "'<='", 
		"'>'", "'>='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "LIKE", "SELECT", "PROJECT", "JOIN", "CROSS", 
		"UNION", "DIFF", "INTERSECT", "RENAME", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "COMMA", "DOT", "STATEMENT_TERMINATOR", "EQUALS", "LT", 
		"LTE", "GT", "GTE", "NOT_EQUALS", "INT", "FLOAT", "STRING_LITERAL", "ID", 
		"WHITESPACE", "COMMENT", "SINGLELINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\6\3K\n\3\r\3\16\3L\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u00bc\n\35"+
		"\r\35\16\35\u00bd\3\36\3\36\3\36\6\36\u00c3\n\36\r\36\16\36\u00c4\3\37"+
		"\3\37\3\37\7\37\u00ca\n\37\f\37\16\37\u00cd\13\37\3\37\3\37\3 \3 \3 \3"+
		" \7 \u00d5\n \f \16 \u00d8\13 \3!\6!\u00db\n!\r!\16!\u00dc\3!\3!\3\"\3"+
		"\"\3\"\3\"\7\"\u00e5\n\"\f\"\16\"\u00e8\13\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\7#\u00f3\n#\f#\16#\u00f6\13#\3#\3#\4\u00cb\u00e6\2$\3\2\5\2\7"+
		"\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"\3\2\7\3\2\62;\4\2C\\c|\4\2))``\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u0101"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5J\3\2\2\2\7N\3\2\2\2"+
		"\tR\3\2\2\2\13U\3\2\2\2\rY\3\2\2\2\17^\3\2\2\2\21f\3\2\2\2\23o\3\2\2\2"+
		"\25u\3\2\2\2\27|\3\2\2\2\31\u0083\3\2\2\2\33\u0089\3\2\2\2\35\u0094\3"+
		"\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2"+
		"\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b7\3\2\2"+
		"\29\u00bb\3\2\2\2;\u00bf\3\2\2\2=\u00c6\3\2\2\2?\u00d0\3\2\2\2A\u00da"+
		"\3\2\2\2C\u00e0\3\2\2\2E\u00ee\3\2\2\2GH\t\2\2\2H\4\3\2\2\2IK\t\3\2\2"+
		"JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\6\3\2\2\2NO\7c\2\2OP\7p\2\2"+
		"PQ\7f\2\2Q\b\3\2\2\2RS\7q\2\2ST\7t\2\2T\n\3\2\2\2UV\7p\2\2VW\7q\2\2WX"+
		"\7v\2\2X\f\3\2\2\2YZ\7n\2\2Z[\7k\2\2[\\\7m\2\2\\]\7g\2\2]\16\3\2\2\2^"+
		"_\7^\2\2_`\7u\2\2`a\7g\2\2ab\7n\2\2bc\7g\2\2cd\7e\2\2de\7v\2\2e\20\3\2"+
		"\2\2fg\7^\2\2gh\7r\2\2hi\7t\2\2ij\7q\2\2jk\7l\2\2kl\7g\2\2lm\7e\2\2mn"+
		"\7v\2\2n\22\3\2\2\2op\7^\2\2pq\7l\2\2qr\7q\2\2rs\7k\2\2st\7p\2\2t\24\3"+
		"\2\2\2uv\7^\2\2vw\7e\2\2wx\7t\2\2xy\7q\2\2yz\7u\2\2z{\7u\2\2{\26\3\2\2"+
		"\2|}\7^\2\2}~\7w\2\2~\177\7p\2\2\177\u0080\7k\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7p\2\2\u0082\30\3\2\2\2\u0083\u0084\7^\2\2\u0084\u0085\7f\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\u0088\7h\2\2\u0088\32\3\2\2\2\u0089"+
		"\u008a\7^\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2"+
		"\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7u\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\34\3\2\2\2\u0094\u0095"+
		"\7^\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7o\2\2\u009a\u009b\7g\2\2\u009b\36\3\2\2\2\u009c"+
		"\u009d\7*\2\2\u009d \3\2\2\2\u009e\u009f\7+\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\7a\2\2\u00a1\u00a2\7}\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7\177\2\2"+
		"\u00a4&\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7\60\2\2"+
		"\u00a8*\3\2\2\2\u00a9\u00aa\7=\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7>\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\64\3\2\2\2\u00b4"+
		"\u00b5\7@\2\2\u00b5\u00b6\7?\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8"+
		"\u00b9\7@\2\2\u00b98\3\2\2\2\u00ba\u00bc\5\3\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be:\3\2\2\2"+
		"\u00bf\u00c0\5\3\2\2\u00c0\u00c2\5)\25\2\u00c1\u00c3\5\3\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"<\3\2\2\2\u00c6\u00cb\7)\2\2\u00c7\u00ca\13\2\2\2\u00c8\u00ca\t\4\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\7)\2\2\u00cf>\3\2\2\2\u00d0\u00d6\5\5\3\2\u00d1\u00d5\5\5\3\2\u00d2"+
		"\u00d5\5\3\2\2\u00d3\u00d5\7a\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7@\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\t\5\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b!\2\2\u00dfB\3\2\2\2\u00e0\u00e1"+
		"\7\61\2\2\u00e1\u00e2\7,\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea"+
		"\u00eb\7\61\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\"\3\2\u00edD\3\2\2\2"+
		"\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3"+
		"\n\6\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b#"+
		"\3\2\u00f8F\3\2\2\2\r\2L\u00bd\u00c4\u00c9\u00cb\u00d4\u00d6\u00dc\u00e6"+
		"\u00f4\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}