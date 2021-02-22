// Generated from Singeli.g4 by ANTLR 4.9.1
package si.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SingeliLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, NAME=26, SYMB=27, STR=28, INT=29, HEX=30, TINT=31, DEC=32, REL=33, 
		WS=34, COMMENT=35, LINE_COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"NAME", "SYMB", "STR", "INT", "HEX", "TINT", "DEC", "REL", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'true'", "'false'", "'*'", "'$'", "'['", 
			"']'", "'('", "')'", "'/'", "'+'", "'-'", "'emit'", "'.'", "';'", "':'", 
			"'='", "'if'", "'else'", "'return'", "'::'", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NAME", "SYMB", "STR", "INT", "HEX", "TINT", "DEC", "REL", 
			"WS", "COMMENT", "LINE_COMMENT"
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


	public SingeliLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Singeli.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\7\33\u0095\n\33\f\33\16\33\u0098\13\33\3\34\3\34\3\34"+
		"\7\34\u009d\n\34\f\34\16\34\u00a0\13\34\3\34\3\34\3\35\3\35\7\35\u00a6"+
		"\n\35\f\35\16\35\u00a9\13\35\3\35\3\35\3\36\3\36\7\36\u00af\n\36\f\36"+
		"\16\36\u00b2\13\36\3\36\5\36\u00b5\n\36\3\37\3\37\3\37\6\37\u00ba\n\37"+
		"\r\37\16\37\u00bb\3 \3 \3 \3 \3!\3!\3!\6!\u00c5\n!\r!\16!\u00c6\3!\3!"+
		"\6!\u00cb\n!\r!\16!\u00cc\3!\5!\u00d0\n!\3\"\3\"\3\"\3\"\3\"\5\"\u00d7"+
		"\n\"\3#\6#\u00da\n#\r#\16#\u00db\3#\3#\3$\3$\3$\3$\7$\u00e4\n$\f$\16$"+
		"\u00e7\13$\3$\3$\3$\3$\3$\3%\3%\3%\5%\u00f1\n%\3%\7%\u00f4\n%\f%\16%\u00f7"+
		"\13%\3%\3%\3\u00e5\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\16\5\2C\\aac|\6\2\62;C\\aac|\6"+
		"\2&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63;\3\2\62;\5\2\62;CHch\4\2kkw"+
		"w\4\2>>@@\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0109\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2"+
		"\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13V\3\2\2\2\r\\\3\2\2\2\17^\3\2\2"+
		"\2\21`\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33j\3\2"+
		"\2\2\35l\3\2\2\2\37n\3\2\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2"+
		"){\3\2\2\2+~\3\2\2\2-\u0083\3\2\2\2/\u008a\3\2\2\2\61\u008d\3\2\2\2\63"+
		"\u008f\3\2\2\2\65\u0092\3\2\2\2\67\u0099\3\2\2\29\u00a3\3\2\2\2;\u00b4"+
		"\3\2\2\2=\u00b6\3\2\2\2?\u00bd\3\2\2\2A\u00cf\3\2\2\2C\u00d6\3\2\2\2E"+
		"\u00d9\3\2\2\2G\u00df\3\2\2\2I\u00f0\3\2\2\2KL\7}\2\2L\4\3\2\2\2MN\7."+
		"\2\2N\6\3\2\2\2OP\7\177\2\2P\b\3\2\2\2QR\7v\2\2RS\7t\2\2ST\7w\2\2TU\7"+
		"g\2\2U\n\3\2\2\2VW\7h\2\2WX\7c\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\f\3\2\2"+
		"\2\\]\7,\2\2]\16\3\2\2\2^_\7&\2\2_\20\3\2\2\2`a\7]\2\2a\22\3\2\2\2bc\7"+
		"_\2\2c\24\3\2\2\2de\7*\2\2e\26\3\2\2\2fg\7+\2\2g\30\3\2\2\2hi\7\61\2\2"+
		"i\32\3\2\2\2jk\7-\2\2k\34\3\2\2\2lm\7/\2\2m\36\3\2\2\2no\7g\2\2op\7o\2"+
		"\2pq\7k\2\2qr\7v\2\2r \3\2\2\2st\7\60\2\2t\"\3\2\2\2uv\7=\2\2v$\3\2\2"+
		"\2wx\7<\2\2x&\3\2\2\2yz\7?\2\2z(\3\2\2\2{|\7k\2\2|}\7h\2\2}*\3\2\2\2~"+
		"\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082"+
		",\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089.\3\2\2\2\u008a"+
		"\u008b\7<\2\2\u008b\u008c\7<\2\2\u008c\60\3\2\2\2\u008d\u008e\7(\2\2\u008e"+
		"\62\3\2\2\2\u008f\u0090\7?\2\2\u0090\u0091\7@\2\2\u0091\64\3\2\2\2\u0092"+
		"\u0096\t\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\66\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\7)\2\2\u009a\u009e\t\4\2\2\u009b\u009d\t\5\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2"+
		"8\3\2\2\2\u00a3\u00a7\7$\2\2\u00a4\u00a6\n\6\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab:\3\2\2\2\u00ac\u00b0"+
		"\t\7\2\2\u00ad\u00af\t\b\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b5\7\62\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"<\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00b9\7z\2\2\u00b8\u00ba\t\t\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc>\3\2\2\2\u00bd\u00be\5;\36\2\u00be\u00bf\t\n\2\2\u00bf"+
		"\u00c0\5;\36\2\u00c0@\3\2\2\2\u00c1\u00c2\5;\36\2\u00c2\u00c4\7\60\2\2"+
		"\u00c3\u00c5\t\b\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00d0\3\2\2\2\u00c8\u00ca\7\60\2\2"+
		"\u00c9\u00cb\t\b\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5;\36\2\u00cf"+
		"\u00c1\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0B\3\2\2\2"+
		"\u00d1\u00d7\t\13\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d7\7?\2\2\u00d4\u00d5"+
		"\7@\2\2\u00d5\u00d7\7?\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7D\3\2\2\2\u00d8\u00da\t\f\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\b#\2\2\u00deF\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0"+
		"\u00e1\7,\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\13\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\7\61"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b$\3\2\u00ecH\3\2\2\2\u00ed\u00ee"+
		"\7\61\2\2\u00ee\u00f1\7\61\2\2\u00ef\u00f1\7%\2\2\u00f0\u00ed\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\n\r\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\b%\3\2\u00f9J\3\2\2\2\21"+
		"\2\u0096\u009e\u00a7\u00b0\u00b4\u00bb\u00c6\u00cc\u00cf\u00d6\u00db\u00e5"+
		"\u00f0\u00f5\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}