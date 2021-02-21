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
		T__17=18, NAME=19, SYMB=20, STR=21, INT=22, HEX=23, DEC=24, WS=25, COMMENT=26, 
		LINE_COMMENT=27;
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
			"T__17", "NAME", "SYMB", "STR", "INT", "HEX", "DEC", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'/'", 
			"'+'", "'-'", "'emit'", "';'", "':'", "'='", "'if'", "'&'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NAME", "SYMB", "STR", "INT", 
			"HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\7\24e\n\24\f\24\16\24h\13\24\3\25\3\25\3\25\7\25m\n\25"+
		"\f\25\16\25p\13\25\3\25\3\25\3\26\3\26\7\26v\n\26\f\26\16\26y\13\26\3"+
		"\26\3\26\3\27\3\27\7\27\177\n\27\f\27\16\27\u0082\13\27\3\27\5\27\u0085"+
		"\n\27\3\30\3\30\3\30\6\30\u008a\n\30\r\30\16\30\u008b\3\31\3\31\3\31\6"+
		"\31\u0091\n\31\r\31\16\31\u0092\3\31\3\31\6\31\u0097\n\31\r\31\16\31\u0098"+
		"\3\31\5\31\u009c\n\31\3\32\6\32\u009f\n\32\r\32\16\32\u00a0\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\7\33\u00a9\n\33\f\33\16\33\u00ac\13\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u00b6\n\34\3\34\7\34\u00b9\n\34\f"+
		"\34\16\34\u00bc\13\34\3\34\3\34\3\u00aa\2\35\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\6"+
		"\2&&C\\aac|\7\2&&\62;C\\aac|\3\2$$\3\2\63;\3\2\62;\5\2\62;CHch\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2"+
		"\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3"+
		"\2\2\2\31O\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#]\3\2"+
		"\2\2%_\3\2\2\2\'b\3\2\2\2)i\3\2\2\2+s\3\2\2\2-\u0084\3\2\2\2/\u0086\3"+
		"\2\2\2\61\u009b\3\2\2\2\63\u009e\3\2\2\2\65\u00a4\3\2\2\2\67\u00b5\3\2"+
		"\2\29:\7}\2\2:\4\3\2\2\2;<\7.\2\2<\6\3\2\2\2=>\7\177\2\2>\b\3\2\2\2?@"+
		"\7,\2\2@\n\3\2\2\2AB\7]\2\2B\f\3\2\2\2CD\7_\2\2D\16\3\2\2\2EF\7*\2\2F"+
		"\20\3\2\2\2GH\7+\2\2H\22\3\2\2\2IJ\7\61\2\2J\24\3\2\2\2KL\7-\2\2L\26\3"+
		"\2\2\2MN\7/\2\2N\30\3\2\2\2OP\7g\2\2PQ\7o\2\2QR\7k\2\2RS\7v\2\2S\32\3"+
		"\2\2\2TU\7=\2\2U\34\3\2\2\2VW\7<\2\2W\36\3\2\2\2XY\7?\2\2Y \3\2\2\2Z["+
		"\7k\2\2[\\\7h\2\2\\\"\3\2\2\2]^\7(\2\2^$\3\2\2\2_`\7?\2\2`a\7@\2\2a&\3"+
		"\2\2\2bf\t\2\2\2ce\t\3\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g(\3"+
		"\2\2\2hf\3\2\2\2ij\7)\2\2jn\t\4\2\2km\t\5\2\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7)\2\2r*\3\2\2\2sw\7$\2\2tv\n\6"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7$"+
		"\2\2{,\3\2\2\2|\u0080\t\7\2\2}\177\t\b\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0085\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0085\7\62\2\2\u0084|\3\2\2\2\u0084\u0083\3\2\2\2\u0085."+
		"\3\2\2\2\u0086\u0087\7\62\2\2\u0087\u0089\7z\2\2\u0088\u008a\t\t\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\60\3\2\2\2\u008d\u008e\5-\27\2\u008e\u0090\7\60\2\2\u008f\u0091"+
		"\t\b\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009c\3\2\2\2\u0094\u0096\7\60\2\2\u0095\u0097\t"+
		"\b\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009c\5-\27\2\u009b\u008d\3\2"+
		"\2\2\u009b\u0094\3\2\2\2\u009b\u009a\3\2\2\2\u009c\62\3\2\2\2\u009d\u009f"+
		"\t\n\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\32\2\2\u00a3\64\3\2\2"+
		"\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7,\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9"+
		"\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7,\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\33\3\2"+
		"\u00b1\66\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b6\7\61\2\2\u00b4\u00b6"+
		"\7%\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7"+
		"\u00b9\n\13\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\b\34\3\2\u00be8\3\2\2\2\20\2fnw\u0080\u0084\u008b\u0092\u0098\u009b"+
		"\u00a0\u00aa\u00b5\u00ba\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}