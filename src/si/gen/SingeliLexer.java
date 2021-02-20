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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, NAME=15, SYMB=16, INT=17, 
		HEX=18, DEC=19, WS=20, COMMENT=21, LINE_COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "NAME", "SYMB", "INT", "HEX", 
			"DEC", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'$'", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", 
			"'+'", "';'", "':'", "'='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NAME", "SYMB", "INT", "HEX", "DEC", "WS", "COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\7\20O\n\20\f\20\16\20"+
		"R\13\20\3\21\3\21\3\21\3\21\7\21X\n\21\f\21\16\21[\13\21\3\21\3\21\3\22"+
		"\3\22\7\22a\n\22\f\22\16\22d\13\22\3\22\5\22g\n\22\3\23\3\23\3\23\6\23"+
		"l\n\23\r\23\16\23m\3\24\3\24\3\24\6\24s\n\24\r\24\16\24t\3\24\3\24\6\24"+
		"y\n\24\r\24\16\24z\3\24\5\24~\n\24\3\25\6\25\u0081\n\25\r\25\16\25\u0082"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u008b\n\26\f\26\16\26\u008e\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0099\n\27\f\27\16"+
		"\27\u009c\13\27\3\27\3\27\3\u008c\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\3\2))\7\2$$))ppttvv\3\2\63;\3\2\62;"+
		"\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ab\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7"+
		"\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2"+
		"\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35I\3"+
		"\2\2\2\37L\3\2\2\2!S\3\2\2\2#f\3\2\2\2%h\3\2\2\2\'}\3\2\2\2)\u0080\3\2"+
		"\2\2+\u0086\3\2\2\2-\u0094\3\2\2\2/\60\7,\2\2\60\4\3\2\2\2\61\62\7&\2"+
		"\2\62\6\3\2\2\2\63\64\7]\2\2\64\b\3\2\2\2\65\66\7_\2\2\66\n\3\2\2\2\67"+
		"8\7}\2\28\f\3\2\2\29:\7.\2\2:\16\3\2\2\2;<\7\177\2\2<\20\3\2\2\2=>\7*"+
		"\2\2>\22\3\2\2\2?@\7+\2\2@\24\3\2\2\2AB\7-\2\2B\26\3\2\2\2CD\7=\2\2D\30"+
		"\3\2\2\2EF\7<\2\2F\32\3\2\2\2GH\7?\2\2H\34\3\2\2\2IJ\7?\2\2JK\7@\2\2K"+
		"\36\3\2\2\2LP\t\2\2\2MO\t\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2Q \3\2\2\2RP\3\2\2\2SY\7)\2\2TX\n\4\2\2UV\7^\2\2VX\t\5\2\2WT\3\2\2\2"+
		"WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7)\2"+
		"\2]\"\3\2\2\2^b\t\6\2\2_a\t\7\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2cg\3\2\2\2db\3\2\2\2eg\7\62\2\2f^\3\2\2\2fe\3\2\2\2g$\3\2\2\2hi\7"+
		"\62\2\2ik\7z\2\2jl\t\b\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n&\3"+
		"\2\2\2op\5#\22\2pr\7\60\2\2qs\t\7\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu"+
		"\3\2\2\2u~\3\2\2\2vx\7\60\2\2wy\t\7\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{~\3\2\2\2|~\5#\22\2}o\3\2\2\2}v\3\2\2\2}|\3\2\2\2~(\3\2\2\2"+
		"\177\u0081\t\t\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\25\2\2\u0085"+
		"*\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7,\2\2\u0088\u008c\3\2\2\2"+
		"\u0089\u008b\13\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7,\2\2\u0090\u0091\7\61\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\26"+
		"\3\2\u0093,\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096\7\61\2\2\u0096\u009a"+
		"\3\2\2\2\u0097\u0099\n\n\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\b\27\3\2\u009e.\3\2\2\2\17\2PWYbfmtz}\u0082\u008c\u009a"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}