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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, EQ=8, NEQ=9, GT=10, 
		LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, DIV=17, MOD=18, NOT=19, 
		SCOL=20, ASSIGN=21, OPAR=22, CPAR=23, OBRACE=24, CBRACE=25, OBRACKET=26, 
		CBRACKET=27, TRUE=28, FALSE=29, NIL=30, AANENKIL=31, ATHAVA=32, ALLENKIL=33, 
		AAYIRIKKUMPOL=34, LOG=35, ID=36, INT=37, FLOAT=38, STRING=39, COMMENT=40, 
		SPACE=41, OTHER=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", 
			"ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", 
			"TRUE", "FALSE", "NIL", "AANENKIL", "ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", 
			"LOG", "ID", "LETTER", "DIGIT", "INT", "FLOAT", "STRING", "COMMENT", 
			"SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u0D15\u0D1F\u0D15\u0D4D\u0D15\u0D42\u0D2A\u0D41\u0D31\u0D24\u0D4D\u0D24\u0D4D'", 
			"'\u0D15\u0D1F\u0D15\u0D4D\u0D15\u0D42 \u0D2A\u0D41\u0D31\u0D24\u0D4D\u0D24\u0D4D'", 
			"'\u0D38\u0D02\u0D16\u0D4D\u0D2F'", "','", "'\u0D38\u0D4D\u0D35\u0D40\u0D15\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "';'", "'='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'true'", "'false'", "'nil'", "'\u0D06\u0D23\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D05\u0D25\u0D35\u0D3E'", "'\u0D05\u0D32\u0D4D\u0D32\u0D46\u0D19\u0D4D\u0D15\u0D3F\u0D32\u0D4D\u200D'", 
			"'\u0D06\u0D2F\u0D3F\u0D30\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D2E\u0D4D\u0D2A\u0D4B\u0D33\u0D4D\u200D'", 
			"'\u0D2A\u0D24\u0D3F\u0D15\u0D4D\u0D15\u0D41\u0D15'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", "SCOL", 
			"ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", 
			"TRUE", "FALSE", "NIL", "AANENKIL", "ATHAVA", "ALLENKIL", "AAYIRIKKUMPOL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0146\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\7%\u0109\n%\f%\16%\u010c\13%\3&\3&\3\'\3\'\3(\6(\u0113\n(\r(\16"+
		"(\u0114\3)\6)\u0118\n)\r)\16)\u0119\3)\3)\7)\u011e\n)\f)\16)\u0121\13"+
		")\3)\3)\6)\u0125\n)\r)\16)\u0126\5)\u0129\n)\3*\3*\3*\3*\7*\u012f\n*\f"+
		"*\16*\u0132\13*\3*\3*\3+\3+\3+\3+\7+\u013a\n+\f+\16+\u013d\13+\3+\3+\3"+
		",\3,\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q(S)U*W+Y,\3\2\b\17\2&&C\\"+
		"aac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u200e\u200f\u3042\u3191\u3302"+
		"\u3381\u3402\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2"+
		"\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9"+
		"\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042"+
		"\u104b\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\3[\3\2\2\2\5i\3\2\2\2\7x\3\2\2\2\t~\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u008d\3\2\2\2\17\u0090\3\2\2\2\21\u0093\3\2\2\2\23\u0096\3\2\2\2\25"+
		"\u0099\3\2\2\2\27\u009b\3\2\2\2\31\u009d\3\2\2\2\33\u00a0\3\2\2\2\35\u00a3"+
		"\3\2\2\2\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2"+
		"\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3"+
		"\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2"+
		"\2\29\u00bf\3\2\2\2;\u00c4\3\2\2\2=\u00ca\3\2\2\2?\u00ce\3\2\2\2A\u00d9"+
		"\3\2\2\2C\u00de\3\2\2\2E\u00eb\3\2\2\2G\u00fc\3\2\2\2I\u0105\3\2\2\2K"+
		"\u010d\3\2\2\2M\u010f\3\2\2\2O\u0112\3\2\2\2Q\u0128\3\2\2\2S\u012a\3\2"+
		"\2\2U\u0135\3\2\2\2W\u0140\3\2\2\2Y\u0144\3\2\2\2[\\\7\u0d17\2\2\\]\7"+
		"\u0d21\2\2]^\7\u0d17\2\2^_\7\u0d4f\2\2_`\7\u0d17\2\2`a\7\u0d44\2\2ab\7"+
		"\u0d2c\2\2bc\7\u0d43\2\2cd\7\u0d33\2\2de\7\u0d26\2\2ef\7\u0d4f\2\2fg\7"+
		"\u0d26\2\2gh\7\u0d4f\2\2h\4\3\2\2\2ij\7\u0d17\2\2jk\7\u0d21\2\2kl\7\u0d17"+
		"\2\2lm\7\u0d4f\2\2mn\7\u0d17\2\2no\7\u0d44\2\2op\7\"\2\2pq\7\u0d2c\2\2"+
		"qr\7\u0d43\2\2rs\7\u0d33\2\2st\7\u0d26\2\2tu\7\u0d4f\2\2uv\7\u0d26\2\2"+
		"vw\7\u0d4f\2\2w\6\3\2\2\2xy\7\u0d3a\2\2yz\7\u0d04\2\2z{\7\u0d18\2\2{|"+
		"\7\u0d4f\2\2|}\7\u0d31\2\2}\b\3\2\2\2~\177\7.\2\2\177\n\3\2\2\2\u0080"+
		"\u0081\7\u0d3a\2\2\u0081\u0082\7\u0d4f\2\2\u0082\u0083\7\u0d37\2\2\u0083"+
		"\u0084\7\u0d42\2\2\u0084\u0085\7\u0d17\2\2\u0085\u0086\7\u0d32\2\2\u0086"+
		"\u0087\7\u0d41\2\2\u0087\u0088\7\u0d17\2\2\u0088\u0089\7\u0d4f\2\2\u0089"+
		"\u008a\7\u0d17\2\2\u008a\u008b\7\u0d43\2\2\u008b\u008c\7\u0d17\2\2\u008c"+
		"\f\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f\16\3\2\2\2\u0090"+
		"\u0091\7(\2\2\u0091\u0092\7(\2\2\u0092\20\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\u0095\7?\2\2\u0095\22\3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\7?\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\7@\2\2\u009a\26\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\30\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f\7?\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7,\2\2\u00a8"+
		"\"\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac"+
		"&\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae(\3\2\2\2\u00af\u00b0\7=\2\2\u00b0*"+
		"\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4.\3"+
		"\2\2\2\u00b5\u00b6\7+\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8\62"+
		"\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7]\2\2\u00bc"+
		"\66\3\2\2\2\u00bd\u00be\7_\2\2\u00be8\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3:\3\2\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9<\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7k\2"+
		"\2\u00cc\u00cd\7n\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7\u0d08\2\2\u00cf\u00d0"+
		"\7\u0d25\2\2\u00d0\u00d1\7\u0d48\2\2\u00d1\u00d2\7\u0d1b\2\2\u00d2\u00d3"+
		"\7\u0d4f\2\2\u00d3\u00d4\7\u0d17\2\2\u00d4\u00d5\7\u0d41\2\2\u00d5\u00d6"+
		"\7\u0d34\2\2\u00d6\u00d7\7\u0d4f\2\2\u00d7\u00d8\7\u200f\2\2\u00d8@\3"+
		"\2\2\2\u00d9\u00da\7\u0d07\2\2\u00da\u00db\7\u0d27\2\2\u00db\u00dc\7\u0d37"+
		"\2\2\u00dc\u00dd\7\u0d40\2\2\u00ddB\3\2\2\2\u00de\u00df\7\u0d07\2\2\u00df"+
		"\u00e0\7\u0d34\2\2\u00e0\u00e1\7\u0d4f\2\2\u00e1\u00e2\7\u0d34\2\2\u00e2"+
		"\u00e3\7\u0d48\2\2\u00e3\u00e4\7\u0d1b\2\2\u00e4\u00e5\7\u0d4f\2\2\u00e5"+
		"\u00e6\7\u0d17\2\2\u00e6\u00e7\7\u0d41\2\2\u00e7\u00e8\7\u0d34\2\2\u00e8"+
		"\u00e9\7\u0d4f\2\2\u00e9\u00ea\7\u200f\2\2\u00eaD\3\2\2\2\u00eb\u00ec"+
		"\7\u0d08\2\2\u00ec\u00ed\7\u0d31\2\2\u00ed\u00ee\7\u0d41\2\2\u00ee\u00ef"+
		"\7\u0d32\2\2\u00ef\u00f0\7\u0d41\2\2\u00f0\u00f1\7\u0d17\2\2\u00f1\u00f2"+
		"\7\u0d4f\2\2\u00f2\u00f3\7\u0d17\2\2\u00f3\u00f4\7\u0d43\2\2\u00f4\u00f5"+
		"\7\u0d30\2\2\u00f5\u00f6\7\u0d4f\2\2\u00f6\u00f7\7\u0d2c\2\2\u00f7\u00f8"+
		"\7\u0d4d\2\2\u00f8\u00f9\7\u0d35\2\2\u00f9\u00fa\7\u0d4f\2\2\u00fa\u00fb"+
		"\7\u200f\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7\u0d2c\2\2\u00fd\u00fe\7\u0d26"+
		"\2\2\u00fe\u00ff\7\u0d41\2\2\u00ff\u0100\7\u0d17\2\2\u0100\u0101\7\u0d4f"+
		"\2\2\u0101\u0102\7\u0d17\2\2\u0102\u0103\7\u0d43\2\2\u0103\u0104\7\u0d17"+
		"\2\2\u0104H\3\2\2\2\u0105\u010a\5K&\2\u0106\u0109\5K&\2\u0107\u0109\5"+
		"M\'\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bJ\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010e\t\2\2\2\u010eL\3\2\2\2\u010f\u0110\t\3\2\2\u0110N\3\2\2\2"+
		"\u0111\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115P\3\2\2\2\u0116\u0118\t\4\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011f\7\60\2\2\u011c\u011e\t\4\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0129\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\60\2\2\u0123"+
		"\u0125\t\4\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0117\3\2\2\2\u0128"+
		"\u0122\3\2\2\2\u0129R\3\2\2\2\u012a\u0130\7$\2\2\u012b\u012f\n\5\2\2\u012c"+
		"\u012d\7$\2\2\u012d\u012f\7$\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2"+
		"\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7$\2\2\u0134T\3\2\2\2\u0135\u0136"+
		"\7\61\2\2\u0136\u0137\7\61\2\2\u0137\u013b\3\2\2\2\u0138\u013a\n\6\2\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b+\2\2\u013f"+
		"V\3\2\2\2\u0140\u0141\t\7\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b,\2\2\u0143"+
		"X\3\2\2\2\u0144\u0145\13\2\2\2\u0145Z\3\2\2\2\r\2\u0108\u010a\u0114\u0119"+
		"\u011f\u0126\u0128\u012e\u0130\u013b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}