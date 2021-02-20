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
		T__9=10, T__10=11, T__11=12, T__12=13, NAME=14, SYMB=15, INT=16, HEX=17, 
		DEC=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "NAME", "SYMB", "INT", "HEX", "DEC", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "'*'", "'['", "']'", "'('", "')'", "'+'", 
			"';'", "':'", "'='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NAME", "SYMB", "INT", "HEX", "DEC", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\7\17K\n\17\f\17\16\17N\13\17\3\20\3\20\3"+
		"\20\7\20S\n\20\f\20\16\20V\13\20\3\20\3\20\3\21\3\21\7\21\\\n\21\f\21"+
		"\16\21_\13\21\3\21\5\21b\n\21\3\22\3\22\3\22\6\22g\n\22\r\22\16\22h\3"+
		"\23\3\23\3\23\6\23n\n\23\r\23\16\23o\3\23\3\23\6\23t\n\23\r\23\16\23u"+
		"\3\23\5\23y\n\23\3\24\6\24|\n\24\r\24\16\24}\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u0086\n\25\f\25\16\25\u0089\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u0094\n\26\f\26\16\26\u0097\13\26\3\26\3\26"+
		"\3\u0087\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\13\5\2C\\aac|\6\2\62;"+
		"C\\aac|\6\2&&C\\aac|\7\2\'\'\62;C\\aac|\3\2\63;\3\2\62;\5\2\62;CHch\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13"+
		"\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2"+
		"\2\27A\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35H\3\2\2\2\37O\3\2\2\2!a\3\2\2"+
		"\2#c\3\2\2\2%x\3\2\2\2\'{\3\2\2\2)\u0081\3\2\2\2+\u008f\3\2\2\2-.\7}\2"+
		"\2.\4\3\2\2\2/\60\7.\2\2\60\6\3\2\2\2\61\62\7\177\2\2\62\b\3\2\2\2\63"+
		"\64\7,\2\2\64\n\3\2\2\2\65\66\7]\2\2\66\f\3\2\2\2\678\7_\2\28\16\3\2\2"+
		"\29:\7*\2\2:\20\3\2\2\2;<\7+\2\2<\22\3\2\2\2=>\7-\2\2>\24\3\2\2\2?@\7"+
		"=\2\2@\26\3\2\2\2AB\7<\2\2B\30\3\2\2\2CD\7?\2\2D\32\3\2\2\2EF\7?\2\2F"+
		"G\7@\2\2G\34\3\2\2\2HL\t\2\2\2IK\t\3\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2M\36\3\2\2\2NL\3\2\2\2OP\7)\2\2PT\t\4\2\2QS\t\5\2\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7)\2\2X \3\2\2"+
		"\2Y]\t\6\2\2Z\\\t\7\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2"+
		"\2\2_]\3\2\2\2`b\7\62\2\2aY\3\2\2\2a`\3\2\2\2b\"\3\2\2\2cd\7\62\2\2df"+
		"\7z\2\2eg\t\b\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i$\3\2\2\2jk"+
		"\5!\21\2km\7\60\2\2ln\t\7\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"py\3\2\2\2qs\7\60\2\2rt\t\7\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vy\3\2\2\2wy\5!\21\2xj\3\2\2\2xq\3\2\2\2xw\3\2\2\2y&\3\2\2\2z|\t\t\2"+
		"\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\24"+
		"\2\2\u0080(\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2\u0083\u0087"+
		"\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7\61\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\25\3\2\u008e*\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2"+
		"\2\u0091\u0095\3\2\2\2\u0092\u0094\n\n\2\2\u0093\u0092\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\b\26\3\2\u0099,\3\2\2\2\16\2LT]ahoux}\u0087"+
		"\u0095\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}