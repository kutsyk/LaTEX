// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/BibTEX\plosBIB.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class plosBIBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Text=4, String=5, Number=6, INT=7, DOUBLE=8, NameChar=9, 
		NameStartChar=10, ASSIGN=11, GT=12, LT=13, BANG=14, TILDE=15, QUESTION=16, 
		COLON=17, EQUAL=18, LE=19, GE=20, NOTEQUAL=21, AND=22, OR=23, INC=24, 
		DEC=25, ADD=26, SUB=27, MUL=28, BITAND=29, BITOR=30, CARET=31, LPAREN=32, 
		RPAREN=33, LBRACE=34, RBRACE=35, LBRACK=36, RBRACK=37, SEMI=38, COMMA=39, 
		DOT=40, WS=41, LINE_COMMENT=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Text", "String", "Number", "INT", "DOUBLE", "NameChar", 
		"NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
		"MUL", "BITAND", "BITOR", "CARET", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\begin{thebibliography}{'", "'\\end{thebibliography}'", "'\\bibitem'", 
		null, null, null, null, null, null, null, "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'&'", "'|'", "'^'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Text", "String", "Number", "INT", "DOUBLE", "NameChar", 
		"NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
		"MUL", "BITAND", "BITOR", "CARET", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public plosBIBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "plosBIB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\6\5\u0092\n\5\r\5\16\5\u0093\3\6\3\6\7\6\u0098\n"+
		"\6\f\6\16\6\u009b\13\6\3\7\3\7\5\7\u009f\n\7\3\b\6\b\u00a2\n\b\r\b\16"+
		"\b\u00a3\3\t\6\t\u00a7\n\t\r\t\16\t\u00a8\3\t\3\t\6\t\u00ad\n\t\r\t\16"+
		"\t\u00ae\3\n\3\n\3\n\3\n\5\n\u00b5\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\6*\u00fe\n*\r*\16*\u00ff\3*\3*\3+\3+\7+\u0106\n+\f+\16+\u0109\13+"+
		"\3+\3+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\4\2\62;aa\5\2\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0119"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5p\3\2\2\2\7\u0086\3\2\2\2\t\u0091\3\2\2\2\13\u0095"+
		"\3\2\2\2\r\u009e\3\2\2\2\17\u00a1\3\2\2\2\21\u00a6\3\2\2\2\23\u00b4\3"+
		"\2\2\2\25\u00b6\3\2\2\2\27\u00b8\3\2\2\2\31\u00ba\3\2\2\2\33\u00bc\3\2"+
		"\2\2\35\u00be\3\2\2\2\37\u00c0\3\2\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2\2%"+
		"\u00c6\3\2\2\2\'\u00c9\3\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00d5\3\2\2\2\61\u00d8\3\2\2\2\63\u00db\3\2\2\2\65\u00de\3\2\2"+
		"\2\67\u00e0\3\2\2\29\u00e2\3\2\2\2;\u00e4\3\2\2\2=\u00e6\3\2\2\2?\u00e8"+
		"\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3\2\2\2I"+
		"\u00f2\3\2\2\2K\u00f4\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fa\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0103\3\2\2\2WX\7^\2\2XY\7d\2\2YZ\7g\2\2Z[\7i\2\2"+
		"[\\\7k\2\2\\]\7p\2\2]^\7}\2\2^_\7v\2\2_`\7j\2\2`a\7g\2\2ab\7d\2\2bc\7"+
		"k\2\2cd\7d\2\2de\7n\2\2ef\7k\2\2fg\7q\2\2gh\7i\2\2hi\7t\2\2ij\7c\2\2j"+
		"k\7r\2\2kl\7j\2\2lm\7{\2\2mn\7\177\2\2no\7}\2\2o\4\3\2\2\2pq\7^\2\2qr"+
		"\7g\2\2rs\7p\2\2st\7f\2\2tu\7}\2\2uv\7v\2\2vw\7j\2\2wx\7g\2\2xy\7d\2\2"+
		"yz\7k\2\2z{\7d\2\2{|\7n\2\2|}\7k\2\2}~\7q\2\2~\177\7i\2\2\177\u0080\7"+
		"t\2\2\u0080\u0081\7c\2\2\u0081\u0082\7r\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7{\2\2\u0084\u0085\7\177\2\2\u0085\6\3\2\2\2\u0086\u0087\7^\2\2\u0087"+
		"\u0088\7d\2\2\u0088\u0089\7k\2\2\u0089\u008a\7d\2\2\u008a\u008b\7k\2\2"+
		"\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d\u008e\7o\2\2\u008e\b\3\2"+
		"\2\2\u008f\u0092\5\13\6\2\u0090\u0092\5\r\7\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\n\3\2\2\2\u0095\u0099\5\25\13\2\u0096\u0098\5\23\n\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\f\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009f\5\17\b\2\u009d\u009f"+
		"\5\21\t\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\16\3\2\2\2\u00a0"+
		"\u00a2\4\62;\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\20\3\2\2\2\u00a5\u00a7\4\62;\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\4\62;\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\22\3\2\2\2\u00b0\u00b5\5\25\13\2\u00b1\u00b5\t\2\2\2\u00b2\u00b5\5#\22"+
		"\2\u00b3\u00b5\t\3\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7"+
		"\26\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb"+
		"\32\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7#\2\2\u00bf"+
		"\36\3\2\2\2\u00c0\u00c1\7\u0080\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7A\2\2"+
		"\u00c3\"\3\2\2\2\u00c4\u00c5\7<\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7?\2\2"+
		"\u00c7\u00c8\7?\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\7?\2"+
		"\2\u00cb(\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7?\2\2\u00ce*\3\2\2\2"+
		"\u00cf\u00d0\7#\2\2\u00d0\u00d1\7?\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7(\2"+
		"\2\u00d3\u00d4\7(\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7~\2\2\u00d6\u00d7\7"+
		"~\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\u00da\7-\2\2\u00da\62"+
		"\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd\7/\2\2\u00dd\64\3\2\2\2\u00de"+
		"\u00df\7-\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7/\2\2\u00e18\3\2\2\2\u00e2"+
		"\u00e3\7,\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5<\3\2\2\2\u00e6\u00e7"+
		"\7~\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7`\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7"+
		"*\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7+\2\2\u00edD\3\2\2\2\u00ee\u00ef\7}"+
		"\2\2\u00efF\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7"+
		"]\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7="+
		"\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7\60"+
		"\2\2\u00fbR\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\b*\2\2\u0102T\3\2\2\2\u0103\u0107\7\'\2\2\u0104\u0106\n\6\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\t\6\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b+\2\2\u010dV\3\2\2\2\r\2\u0091\u0093\u0099"+
		"\u009e\u00a3\u00a8\u00ae\u00b4\u00ff\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}