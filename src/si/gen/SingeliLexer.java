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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, NAME=33, SYMB=34, STR=35, INT=36, HEX=37, TINT=38, THEX=39, 
		DEC=40, F32=41, F64=42, REL=43, WS=44, COMMENT=45, LINE_COMMENT=46;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "NAME", 
			"SYMB", "STR", "INT", "HEX", "TINT", "THEX", "DEC", "F32", "F64", "REL", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "','", "'}'", "'true'", "'false'", "'('", "')'", 
			"'*'", "'$'", "'['", "']'", "'/'", "'+'", "'-'", "'emit'", "'.'", "';'", 
			"'='", "'if'", "'else'", "'return'", "'while'", "'def'", "'exec'", "'@'", 
			"'over'", "'from'", "'to'", "'::'", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NAME", "SYMB", 
			"STR", "INT", "HEX", "TINT", "THEX", "DEC", "F32", "F64", "REL", "WS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3!\3\"\3\"\7\"\u00c7\n\"\f\"\16\"\u00ca\13\"\3#\3#\3#\7#\u00cf\n#\f"+
		"#\16#\u00d2\13#\3#\3#\3$\3$\7$\u00d8\n$\f$\16$\u00db\13$\3$\3$\3%\3%\7"+
		"%\u00e1\n%\f%\16%\u00e4\13%\3%\5%\u00e7\n%\3&\3&\3&\6&\u00ec\n&\r&\16"+
		"&\u00ed\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\6)\u00fb\n)\r)\16)\u00fc"+
		"\3)\3)\6)\u0101\n)\r)\16)\u0102\3)\5)\u0106\n)\3*\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3,\3,\5,\u0113\n,\3-\6-\u0116\n-\r-\16-\u0117\3-\3-\3.\3.\3.\3.\7"+
		".\u0120\n.\f.\16.\u0123\13.\3.\3.\3.\3.\3.\3/\3/\3/\5/\u012d\n/\3/\7/"+
		"\u0130\n/\f/\16/\u0133\13/\3/\3/\3\u0121\2\60\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60\3\2\16\5\2C\\aac|\6\2\62;C\\aac|\6\2&&C\\aac|\7\2&&\62;"+
		"C\\aac|\3\2$$\3\2\63;\3\2\62;\5\2\62;CHch\4\2kkww\4\2>>@@\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\2\u0145\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2"+
		"\rl\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27z\3\2\2"+
		"\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2\2!\u0084\3"+
		"\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0092"+
		"\3\2\2\2-\u0097\3\2\2\2/\u009e\3\2\2\2\61\u00a4\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b4\3\2\2\2;\u00b9\3\2\2\2=\u00bc"+
		"\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C\u00c4\3\2\2\2E\u00cb\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00ef\3\2\2\2O\u00f3\3\2"+
		"\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u010a\3\2\2\2W\u0112\3\2\2\2Y\u0115"+
		"\3\2\2\2[\u011b\3\2\2\2]\u012c\3\2\2\2_`\7<\2\2`\4\3\2\2\2ab\7}\2\2b\6"+
		"\3\2\2\2cd\7.\2\2d\b\3\2\2\2ef\7\177\2\2f\n\3\2\2\2gh\7v\2\2hi\7t\2\2"+
		"ij\7w\2\2jk\7g\2\2k\f\3\2\2\2lm\7h\2\2mn\7c\2\2no\7n\2\2op\7u\2\2pq\7"+
		"g\2\2q\16\3\2\2\2rs\7*\2\2s\20\3\2\2\2tu\7+\2\2u\22\3\2\2\2vw\7,\2\2w"+
		"\24\3\2\2\2xy\7&\2\2y\26\3\2\2\2z{\7]\2\2{\30\3\2\2\2|}\7_\2\2}\32\3\2"+
		"\2\2~\177\7\61\2\2\177\34\3\2\2\2\u0080\u0081\7-\2\2\u0081\36\3\2\2\2"+
		"\u0082\u0083\7/\2\2\u0083 \3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7o\2"+
		"\2\u0086\u0087\7k\2\2\u0087\u0088\7v\2\2\u0088\"\3\2\2\2\u0089\u008a\7"+
		"\60\2\2\u008a$\3\2\2\2\u008b\u008c\7=\2\2\u008c&\3\2\2\2\u008d\u008e\7"+
		"?\2\2\u008e(\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091*\3\2"+
		"\2\2\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7g\2\2\u0096,\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c\u009d\7p\2\2\u009d"+
		".\3\2\2\2\u009e\u009f\7y\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7h\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7z\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7e\2\2\u00ac\64\3\2\2\2\u00ad"+
		"\u00ae\7B\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7x\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b38\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7o\2\2\u00b8:\3\2\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\u00bb\7q\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd"+
		"\u00be\7<\2\2\u00be>\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0@\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\u00c3\7@\2\2\u00c3B\3\2\2\2\u00c4\u00c8\t\2\2\2\u00c5\u00c7"+
		"\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9D\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00d0\t\4\2\2\u00cd\u00cf\t\5\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7)\2\2\u00d4F\3\2\2\2\u00d5\u00d9\7$\2\2\u00d6"+
		"\u00d8\n\6\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7$\2\2\u00ddH\3\2\2\2\u00de\u00e2\t\7\2\2\u00df\u00e1\t\b\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7\62\2\2\u00e6"+
		"\u00de\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\62\2\2"+
		"\u00e9\u00eb\7z\2\2\u00ea\u00ec\t\t\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeL\3\2\2\2\u00ef"+
		"\u00f0\5I%\2\u00f0\u00f1\t\n\2\2\u00f1\u00f2\5I%\2\u00f2N\3\2\2\2\u00f3"+
		"\u00f4\5K&\2\u00f4\u00f5\t\n\2\2\u00f5\u00f6\5I%\2\u00f6P\3\2\2\2\u00f7"+
		"\u00f8\5I%\2\u00f8\u00fa\7\60\2\2\u00f9\u00fb\t\b\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0106\3\2\2\2\u00fe\u0100\7\60\2\2\u00ff\u0101\t\b\2\2\u0100\u00ff\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0106\5I%\2\u0105\u00f7\3\2\2\2\u0105\u00fe\3\2\2"+
		"\2\u0105\u0104\3\2\2\2\u0106R\3\2\2\2\u0107\u0108\5Q)\2\u0108\u0109\7"+
		"h\2\2\u0109T\3\2\2\2\u010a\u010b\5Q)\2\u010b\u010c\7f\2\2\u010cV\3\2\2"+
		"\2\u010d\u0113\t\13\2\2\u010e\u010f\7>\2\2\u010f\u0113\7?\2\2\u0110\u0111"+
		"\7@\2\2\u0111\u0113\7?\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113X\3\2\2\2\u0114\u0116\t\f\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\b-\2\2\u011aZ\3\2\2\2\u011b\u011c\7\61\2\2\u011c"+
		"\u011d\7,\2\2\u011d\u0121\3\2\2\2\u011e\u0120\13\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7,\2\2\u0125\u0126\7\61"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b.\3\2\u0128\\\3\2\2\2\u0129\u012a"+
		"\7\61\2\2\u012a\u012d\7\61\2\2\u012b\u012d\7%\2\2\u012c\u0129\3\2\2\2"+
		"\u012c\u012b\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\n\r\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\b/\3\2\u0135^\3\2\2\2\21"+
		"\2\u00c8\u00d0\u00d9\u00e2\u00e6\u00ed\u00fc\u0102\u0105\u0112\u0117\u0121"+
		"\u012c\u0131\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}