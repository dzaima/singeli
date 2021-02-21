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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NAME=16, SYMB=17, 
		STR=18, INT=19, HEX=20, DEC=21, WS=22, COMMENT=23, LINE_COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NAME", "SYMB", 
			"STR", "INT", "HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'+'", 
			"'emit'", "';'", "':'", "'='", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "NAME", "SYMB", "STR", "INT", "HEX", "DEC", "WS", 
			"COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\7\21X\n\21\f\21\16\21[\13\21\3\22\3\22\3\22"+
		"\7\22`\n\22\f\22\16\22c\13\22\3\22\3\22\3\23\3\23\7\23i\n\23\f\23\16\23"+
		"l\13\23\3\23\3\23\3\24\3\24\7\24r\n\24\f\24\16\24u\13\24\3\24\5\24x\n"+
		"\24\3\25\3\25\3\25\6\25}\n\25\r\25\16\25~\3\26\3\26\3\26\6\26\u0084\n"+
		"\26\r\26\16\26\u0085\3\26\3\26\6\26\u008a\n\26\r\26\16\26\u008b\3\26\5"+
		"\26\u008f\n\26\3\27\6\27\u0092\n\27\r\27\16\27\u0093\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\7\30\u009c\n\30\f\30\16\30\u009f\13\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\7\31\u00aa\n\31\f\31\16\31\u00ad\13\31\3"+
		"\31\3\31\3\u009d\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2"+
		"\f\5\2C\\aac|\6\2\62;C\\aac|\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63"+
		";\3\2\62;\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00bc\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r"+
		"=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27J\3\2\2\2"+
		"\31L\3\2\2\2\33N\3\2\2\2\35P\3\2\2\2\37R\3\2\2\2!U\3\2\2\2#\\\3\2\2\2"+
		"%f\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0097\3"+
		"\2\2\2\61\u00a5\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7.\2\2\66\6\3"+
		"\2\2\2\678\7\177\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7]\2\2<\f\3\2\2"+
		"\2=>\7_\2\2>\16\3\2\2\2?@\7*\2\2@\20\3\2\2\2AB\7+\2\2B\22\3\2\2\2CD\7"+
		"-\2\2D\24\3\2\2\2EF\7g\2\2FG\7o\2\2GH\7k\2\2HI\7v\2\2I\26\3\2\2\2JK\7"+
		"=\2\2K\30\3\2\2\2LM\7<\2\2M\32\3\2\2\2NO\7?\2\2O\34\3\2\2\2PQ\7(\2\2Q"+
		"\36\3\2\2\2RS\7?\2\2ST\7@\2\2T \3\2\2\2UY\t\2\2\2VX\t\3\2\2WV\3\2\2\2"+
		"X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\"\3\2\2\2[Y\3\2\2\2\\]\7)\2\2]a\t\4\2"+
		"\2^`\t\5\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2"+
		"\2de\7)\2\2e$\3\2\2\2fj\7$\2\2gi\n\6\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7$\2\2n&\3\2\2\2os\t\7\2\2pr\t\b\2\2"+
		"qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tx\3\2\2\2us\3\2\2\2vx\7\62\2"+
		"\2wo\3\2\2\2wv\3\2\2\2x(\3\2\2\2yz\7\62\2\2z|\7z\2\2{}\t\t\2\2|{\3\2\2"+
		"\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080\u0081\5\'\24\2"+
		"\u0081\u0083\7\60\2\2\u0082\u0084\t\b\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\3\2\2\2\u0087"+
		"\u0089\7\60\2\2\u0088\u008a\t\b\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\5\'\24\2\u008e\u0080\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u008d\3"+
		"\2\2\2\u008f,\3\2\2\2\u0090\u0092\t\n\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\b\27\2\2\u0096.\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7,\2\2"+
		"\u0099\u009d\3\2\2\2\u009a\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\b\30\3\2\u00a4\60\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6"+
		"\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\13\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\b\31\3\2\u00af\62\3\2\2"+
		"\2\17\2Yajsw~\u0085\u008b\u008e\u0093\u009d\u00ab\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}