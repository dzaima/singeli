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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, SYMB=16, STR=17, 
		INT=18, HEX=19, DEC=20, WS=21, COMMENT=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "NAME", "SYMB", "STR", "INT", 
			"HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'+'", 
			"'emit'", "';'", "':'", "'='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "SYMB", "STR", "INT", "HEX", "DEC", "WS", "COMMENT", 
			"LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\7\20T\n\20\f\20\16\20W\13\20\3\21\3\21\3\21\7\21\\\n\21\f\21\16"+
		"\21_\13\21\3\21\3\21\3\22\3\22\7\22e\n\22\f\22\16\22h\13\22\3\22\3\22"+
		"\3\23\3\23\7\23n\n\23\f\23\16\23q\13\23\3\23\5\23t\n\23\3\24\3\24\3\24"+
		"\6\24y\n\24\r\24\16\24z\3\25\3\25\3\25\6\25\u0080\n\25\r\25\16\25\u0081"+
		"\3\25\3\25\6\25\u0086\n\25\r\25\16\25\u0087\3\25\5\25\u008b\n\25\3\26"+
		"\6\26\u008e\n\26\r\26\16\26\u008f\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0098"+
		"\n\27\f\27\16\27\u009b\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\7\30\u00a6\n\30\f\30\16\30\u00a9\13\30\3\30\3\30\3\u0099\2\31\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\6\2"+
		"&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63;\3\2\62;\5\2\62;CHch\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2"+
		"\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2"+
		"\2\2\25C\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37Q\3"+
		"\2\2\2!X\3\2\2\2#b\3\2\2\2%s\3\2\2\2\'u\3\2\2\2)\u008a\3\2\2\2+\u008d"+
		"\3\2\2\2-\u0093\3\2\2\2/\u00a1\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64"+
		"\7.\2\2\64\6\3\2\2\2\65\66\7\177\2\2\66\b\3\2\2\2\678\7,\2\28\n\3\2\2"+
		"\29:\7]\2\2:\f\3\2\2\2;<\7_\2\2<\16\3\2\2\2=>\7*\2\2>\20\3\2\2\2?@\7+"+
		"\2\2@\22\3\2\2\2AB\7-\2\2B\24\3\2\2\2CD\7g\2\2DE\7o\2\2EF\7k\2\2FG\7v"+
		"\2\2G\26\3\2\2\2HI\7=\2\2I\30\3\2\2\2JK\7<\2\2K\32\3\2\2\2LM\7?\2\2M\34"+
		"\3\2\2\2NO\7?\2\2OP\7@\2\2P\36\3\2\2\2QU\t\2\2\2RT\t\3\2\2SR\3\2\2\2T"+
		"W\3\2\2\2US\3\2\2\2UV\3\2\2\2V \3\2\2\2WU\3\2\2\2XY\7)\2\2Y]\t\4\2\2Z"+
		"\\\t\5\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2"+
		"\2`a\7)\2\2a\"\3\2\2\2bf\7$\2\2ce\n\6\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7$\2\2j$\3\2\2\2ko\t\7\2\2ln\t\b\2"+
		"\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2\2qo\3\2\2\2rt\7\62"+
		"\2\2sk\3\2\2\2sr\3\2\2\2t&\3\2\2\2uv\7\62\2\2vx\7z\2\2wy\t\t\2\2xw\3\2"+
		"\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{(\3\2\2\2|}\5%\23\2}\177\7\60\2\2~"+
		"\u0080\t\b\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0085\7\60\2\2\u0084\u0086\t"+
		"\b\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008b\5%\23\2\u008a|\3\2\2\2"+
		"\u008a\u0083\3\2\2\2\u008a\u0089\3\2\2\2\u008b*\3\2\2\2\u008c\u008e\t"+
		"\n\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\26\2\2\u0092,\3\2\2\2"+
		"\u0093\u0094\7\61\2\2\u0094\u0095\7,\2\2\u0095\u0099\3\2\2\2\u0096\u0098"+
		"\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\7,\2\2\u009d\u009e\7\61\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\27\3\2"+
		"\u00a0.\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a7"+
		"\3\2\2\2\u00a4\u00a6\n\13\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ab\b\30\3\2\u00ab\60\3\2\2\2\17\2U]fosz\u0081\u0087"+
		"\u008a\u008f\u0099\u00a7\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}