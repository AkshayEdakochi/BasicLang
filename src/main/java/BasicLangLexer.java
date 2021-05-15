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
		T__0=1, T__1=2, T__2=3, OR=4, AND=5, EQ=6, NEQ=7, GT=8, LT=9, GTEQ=10, 
		LTEQ=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, NOT=17, SCOL=18, 
		ASSIGN=19, OPAR=20, CPAR=21, OBRACE=22, CBRACE=23, TRUE=24, FALSE=25, 
		NIL=26, AANENKIL=27, ATHAVA=28, ALLENKIL=29, AAYIRIKKUMPOL=30, LOG=31, 
		ID=32, INT=33, FLOAT=34, STRING=35, COMMENT=36, SPACE=37, OTHER=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", 
			"LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "AANENKIL", 
			"ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", "LOG", "ID", "LETTER", "DIGIT", 
			"INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0D38\u0D02\u0D16\u0D4D\u0D2F'", "','", "'\u0D38\u0D4D\u0D35\u0D40\u0D15\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
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
			null, null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", 
			"LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "AANENKIL", 
			"ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", "LOG", "ID", "INT", "FLOAT", "STRING", 
			"COMMENT", "SPACE", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\7!\u00e0"+
		"\n!\f!\16!\u00e3\13!\3\"\3\"\3#\3#\3$\6$\u00ea\n$\r$\16$\u00eb\3%\6%\u00ef"+
		"\n%\r%\16%\u00f0\3%\3%\7%\u00f5\n%\f%\16%\u00f8\13%\3%\3%\6%\u00fc\n%"+
		"\r%\16%\u00fd\5%\u0100\n%\3&\3&\3&\3&\7&\u0106\n&\f&\16&\u0109\13&\3&"+
		"\3&\3\'\3\'\3\'\3\'\7\'\u0111\n\'\f\'\16\'\u0114\13\'\3\'\3\'\3(\3(\3"+
		"(\3(\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C\2E\2G#I$K%M&O\'Q(\3\2\b\17\2&&C\\aac|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u2001\u200e\u200f\u3042\u3191\u3302\u3381\u3402"+
		"\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968"+
		"\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68"+
		"\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\3\2"+
		"\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0124\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\th\3\2\2"+
		"\2\13k\3\2\2\2\rn\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2"+
		"\2\2\27{\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2"+
		")\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61\u0096"+
		"\3\2\2\2\63\u009b\3\2\2\2\65\u00a1\3\2\2\2\67\u00a5\3\2\2\29\u00b0\3\2"+
		"\2\2;\u00b5\3\2\2\2=\u00c2\3\2\2\2?\u00d3\3\2\2\2A\u00dc\3\2\2\2C\u00e4"+
		"\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3\2\2\2I\u00ff\3\2\2\2K\u0101\3\2\2\2M"+
		"\u010c\3\2\2\2O\u0117\3\2\2\2Q\u011b\3\2\2\2ST\7\u0d3a\2\2TU\7\u0d04\2"+
		"\2UV\7\u0d18\2\2VW\7\u0d4f\2\2WX\7\u0d31\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3"+
		"\2\2\2[\\\7\u0d3a\2\2\\]\7\u0d4f\2\2]^\7\u0d37\2\2^_\7\u0d42\2\2_`\7\u0d17"+
		"\2\2`a\7\u0d32\2\2ab\7\u0d41\2\2bc\7\u0d17\2\2cd\7\u0d4f\2\2de\7\u0d17"+
		"\2\2ef\7\u0d43\2\2fg\7\u0d17\2\2g\b\3\2\2\2hi\7~\2\2ij\7~\2\2j\n\3\2\2"+
		"\2kl\7(\2\2lm\7(\2\2m\f\3\2\2\2no\7?\2\2op\7?\2\2p\16\3\2\2\2qr\7#\2\2"+
		"rs\7?\2\2s\20\3\2\2\2tu\7@\2\2u\22\3\2\2\2vw\7>\2\2w\24\3\2\2\2xy\7@\2"+
		"\2yz\7?\2\2z\26\3\2\2\2{|\7>\2\2|}\7?\2\2}\30\3\2\2\2~\177\7-\2\2\177"+
		"\32\3\2\2\2\u0080\u0081\7/\2\2\u0081\34\3\2\2\2\u0082\u0083\7,\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\7\61\2\2\u0085 \3\2\2\2\u0086\u0087\7\'\2\2\u0087"+
		"\"\3\2\2\2\u0088\u0089\7#\2\2\u0089$\3\2\2\2\u008a\u008b\7=\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7*\2\2\u008f*"+
		"\3\2\2\2\u0090\u0091\7+\2\2\u0091,\3\2\2\2\u0092\u0093\7}\2\2\u0093.\3"+
		"\2\2\2\u0094\u0095\7\177\2\2\u0095\60\3\2\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u009a\7g\2\2\u009a\62\3\2\2\2\u009b"+
		"\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7"+
		"k\2\2\u00a3\u00a4\7n\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7\u0d08\2\2\u00a6"+
		"\u00a7\7\u0d25\2\2\u00a7\u00a8\7\u0d48\2\2\u00a8\u00a9\7\u0d1b\2\2\u00a9"+
		"\u00aa\7\u0d4f\2\2\u00aa\u00ab\7\u0d17\2\2\u00ab\u00ac\7\u0d41\2\2\u00ac"+
		"\u00ad\7\u0d34\2\2\u00ad\u00ae\7\u0d4f\2\2\u00ae\u00af\7\u200f\2\2\u00af"+
		"8\3\2\2\2\u00b0\u00b1\7\u0d07\2\2\u00b1\u00b2\7\u0d27\2\2\u00b2\u00b3"+
		"\7\u0d37\2\2\u00b3\u00b4\7\u0d40\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7\u0d07"+
		"\2\2\u00b6\u00b7\7\u0d34\2\2\u00b7\u00b8\7\u0d4f\2\2\u00b8\u00b9\7\u0d34"+
		"\2\2\u00b9\u00ba\7\u0d48\2\2\u00ba\u00bb\7\u0d1b\2\2\u00bb\u00bc\7\u0d4f"+
		"\2\2\u00bc\u00bd\7\u0d17\2\2\u00bd\u00be\7\u0d41\2\2\u00be\u00bf\7\u0d34"+
		"\2\2\u00bf\u00c0\7\u0d4f\2\2\u00c0\u00c1\7\u200f\2\2\u00c1<\3\2\2\2\u00c2"+
		"\u00c3\7\u0d08\2\2\u00c3\u00c4\7\u0d31\2\2\u00c4\u00c5\7\u0d41\2\2\u00c5"+
		"\u00c6\7\u0d32\2\2\u00c6\u00c7\7\u0d41\2\2\u00c7\u00c8\7\u0d17\2\2\u00c8"+
		"\u00c9\7\u0d4f\2\2\u00c9\u00ca\7\u0d17\2\2\u00ca\u00cb\7\u0d43\2\2\u00cb"+
		"\u00cc\7\u0d30\2\2\u00cc\u00cd\7\u0d4f\2\2\u00cd\u00ce\7\u0d2c\2\2\u00ce"+
		"\u00cf\7\u0d4d\2\2\u00cf\u00d0\7\u0d35\2\2\u00d0\u00d1\7\u0d4f\2\2\u00d1"+
		"\u00d2\7\u200f\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7\u0d2c\2\2\u00d4\u00d5"+
		"\7\u0d26\2\2\u00d5\u00d6\7\u0d41\2\2\u00d6\u00d7\7\u0d17\2\2\u00d7\u00d8"+
		"\7\u0d4f\2\2\u00d8\u00d9\7\u0d17\2\2\u00d9\u00da\7\u0d43\2\2\u00da\u00db"+
		"\7\u0d17\2\2\u00db@\3\2\2\2\u00dc\u00e1\5C\"\2\u00dd\u00e0\5C\"\2\u00de"+
		"\u00e0\5E#\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2B\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5D\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7"+
		"F\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecH\3\2\2\2\u00ed\u00ef\t"+
		"\4\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\7\60\2\2\u00f3\u00f5\t"+
		"\4\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u0100\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\60"+
		"\2\2\u00fa\u00fc\t\4\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00ee\3\2"+
		"\2\2\u00ff\u00f9\3\2\2\2\u0100J\3\2\2\2\u0101\u0107\7$\2\2\u0102\u0106"+
		"\n\5\2\2\u0103\u0104\7$\2\2\u0104\u0106\7$\2\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010b"+
		"L\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7\61\2\2\u010e\u0112\3\2\2"+
		"\2\u010f\u0111\n\6\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\b\'\2\2\u0116N\3\2\2\2\u0117\u0118\t\7\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\b(\2\2\u011aP\3\2\2\2\u011b\u011c\13\2\2\2\u011cR\3\2\2\2"+
		"\r\2\u00df\u00e1\u00eb\u00f0\u00f6\u00fd\u00ff\u0105\u0107\u0112\3\b\2"+
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