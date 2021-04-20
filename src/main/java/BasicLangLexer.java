// Generated from /home/akshay/IdeaProjects/BasicLang/BasicLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, NOT=14, SCOL=15, ASSIGN=16, OPAR=17, CPAR=18, 
		OBRACE=19, CBRACE=20, TRUE=21, FALSE=22, NIL=23, AANENKIL=24, ATHAVA=25, 
		ALLENKIL=26, AAYIRIKKUMPOL=27, LOG=28, ID=29, INT=30, FLOAT=31, STRING=32, 
		COMMENT=33, SPACE=34, OTHER=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "TRUE", "FALSE", "NIL", "AANENKIL", "ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", 
			"LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "';'", "'='", "'('", "')'", "'{'", 
			"'}'", "'true'", "'false'", "'nil'", "'\u0D06\u0D23\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D05\u0D25\u0D35\u0D3E'", "'\u0D05\u0D32\u0D4D\u0D32\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D06\u0D2F\u0D3F\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D2E\u0D4D\u0D2A\u0D4B\u0D33\u0D4D\u200D'", 
			"'\u0D2A\u0D24\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
			"CBRACE", "TRUE", "FALSE", "NIL", "AANENKIL", "ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", 
			"LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BasicLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BasicLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\6\36\u00bf\n\36\r\36\16\36\u00c0\3\37\6\37\u00c4"+
		"\n\37\r\37\16\37\u00c5\3 \6 \u00c9\n \r \16 \u00ca\3 \3 \7 \u00cf\n \f"+
		" \16 \u00d2\13 \3 \3 \6 \u00d6\n \r \16 \u00d7\5 \u00da\n \3!\3!\3!\3"+
		"!\7!\u00e0\n!\f!\16!\u00e3\13!\3!\3!\3\"\3\"\7\"\u00e9\n\"\f\"\16\"\u00ec"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\5\2C\\c|\u0d02"+
		"\u0d81\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00fd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3I\3\2\2\2\5L\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2"+
		"\17Y\3\2\2\2\21\\\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2"+
		"\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2"+
		"\'s\3\2\2\2)u\3\2\2\2+w\3\2\2\2-|\3\2\2\2/\u0082\3\2\2\2\61\u0086\3\2"+
		"\2\2\63\u0091\3\2\2\2\65\u0096\3\2\2\2\67\u00a3\3\2\2\29\u00b4\3\2\2\2"+
		";\u00be\3\2\2\2=\u00c3\3\2\2\2?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00e6\3"+
		"\2\2\2E\u00ef\3\2\2\2G\u00f3\3\2\2\2IJ\7~\2\2JK\7~\2\2K\4\3\2\2\2LM\7"+
		"(\2\2MN\7(\2\2N\6\3\2\2\2OP\7?\2\2PQ\7?\2\2Q\b\3\2\2\2RS\7#\2\2ST\7?\2"+
		"\2T\n\3\2\2\2UV\7@\2\2V\f\3\2\2\2WX\7>\2\2X\16\3\2\2\2YZ\7@\2\2Z[\7?\2"+
		"\2[\20\3\2\2\2\\]\7>\2\2]^\7?\2\2^\22\3\2\2\2_`\7-\2\2`\24\3\2\2\2ab\7"+
		"/\2\2b\26\3\2\2\2cd\7,\2\2d\30\3\2\2\2ef\7\61\2\2f\32\3\2\2\2gh\7\'\2"+
		"\2h\34\3\2\2\2ij\7#\2\2j\36\3\2\2\2kl\7=\2\2l \3\2\2\2mn\7?\2\2n\"\3\2"+
		"\2\2op\7*\2\2p$\3\2\2\2qr\7+\2\2r&\3\2\2\2st\7}\2\2t(\3\2\2\2uv\7\177"+
		"\2\2v*\3\2\2\2wx\7v\2\2xy\7t\2\2yz\7w\2\2z{\7g\2\2{,\3\2\2\2|}\7h\2\2"+
		"}~\7c\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081.\3\2\2"+
		"\2\u0082\u0083\7p\2\2\u0083\u0084\7k\2\2\u0084\u0085\7n\2\2\u0085\60\3"+
		"\2\2\2\u0086\u0087\7\u0d08\2\2\u0087\u0088\7\u0d25\2\2\u0088\u0089\7\u0d48"+
		"\2\2\u0089\u008a\7\u0d1b\2\2\u008a\u008b\7\u0d4f\2\2\u008b\u008c\7\u0d17"+
		"\2\2\u008c\u008d\7\u0d41\2\2\u008d\u008e\7\u0d34\2\2\u008e\u008f\7\u0d4f"+
		"\2\2\u008f\u0090\7\u200f\2\2\u0090\62\3\2\2\2\u0091\u0092\7\u0d07\2\2"+
		"\u0092\u0093\7\u0d27\2\2\u0093\u0094\7\u0d37\2\2\u0094\u0095\7\u0d40\2"+
		"\2\u0095\64\3\2\2\2\u0096\u0097\7\u0d07\2\2\u0097\u0098\7\u0d34\2\2\u0098"+
		"\u0099\7\u0d4f\2\2\u0099\u009a\7\u0d34\2\2\u009a\u009b\7\u0d48\2\2\u009b"+
		"\u009c\7\u0d1b\2\2\u009c\u009d\7\u0d4f\2\2\u009d\u009e\7\u0d17\2\2\u009e"+
		"\u009f\7\u0d41\2\2\u009f\u00a0\7\u0d34\2\2\u00a0\u00a1\7\u0d4f\2\2\u00a1"+
		"\u00a2\7\u200f\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7\u0d08\2\2\u00a4\u00a5"+
		"\7\u0d31\2\2\u00a5\u00a6\7\u0d41\2\2\u00a6\u00a7\7\u0d32\2\2\u00a7\u00a8"+
		"\7\u0d41\2\2\u00a8\u00a9\7\u0d17\2\2\u00a9\u00aa\7\u0d4f\2\2\u00aa\u00ab"+
		"\7\u0d17\2\2\u00ab\u00ac\7\u0d43\2\2\u00ac\u00ad\7\u0d30\2\2\u00ad\u00ae"+
		"\7\u0d4f\2\2\u00ae\u00af\7\u0d2c\2\2\u00af\u00b0\7\u0d4d\2\2\u00b0\u00b1"+
		"\7\u0d35\2\2\u00b1\u00b2\7\u0d4f\2\2\u00b2\u00b3\7\u200f\2\2\u00b38\3"+
		"\2\2\2\u00b4\u00b5\7\u0d2c\2\2\u00b5\u00b6\7\u0d26\2\2\u00b6\u00b7\7\u0d41"+
		"\2\2\u00b7\u00b8\7\u0d17\2\2\u00b8\u00b9\7\u0d4f\2\2\u00b9\u00ba\7\u0d17"+
		"\2\2\u00ba\u00bb\7\u0d43\2\2\u00bb\u00bc\7\u0d17\2\2\u00bc:\3\2\2\2\u00bd"+
		"\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1<\3\2\2\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		">\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0"+
		"\7\60\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00da\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d5\7\60\2\2\u00d4\u00d6\t\3\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da@\3\2\2\2\u00db"+
		"\u00e1\7$\2\2\u00dc\u00e0\n\4\2\2\u00dd\u00de\7$\2\2\u00de\u00e0\7$\2"+
		"\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\7$\2\2\u00e5B\3\2\2\2\u00e6\u00ea\7%\2\2\u00e7\u00e9\n\5\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\"\2\2\u00ee"+
		"D\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b#\2\2\u00f2"+
		"F\3\2\2\2\u00f3\u00f4\13\2\2\2\u00f4H\3\2\2\2\f\2\u00c0\u00c5\u00ca\u00d0"+
		"\u00d7\u00d9\u00df\u00e1\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}