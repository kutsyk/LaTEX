// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/BibTEX\plosBIB.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class plosBIBParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_bibItem = 1, RULE_authorList = 2, RULE_author = 3, 
		RULE_bibLabel = 4, RULE_bibYear = 5, RULE_title = 6, RULE_address = 7, 
		RULE_publishing = 8;
	public static final String[] ruleNames = {
		"compilationUnit", "bibItem", "authorList", "author", "bibLabel", "bibYear", 
		"title", "address", "publishing"
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

	@Override
	public String getGrammarFileName() { return "plosBIB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public plosBIBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(plosBIBParser.Text, 0); }
		public List<BibItemContext> bibItem() {
			return getRuleContexts(BibItemContext.class);
		}
		public BibItemContext bibItem(int i) {
			return getRuleContext(BibItemContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			match(T__0);
			setState(19); 
			match(Text);
			setState(20); 
			match(RBRACE);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21); 
				bibItem();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(26); 
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BibItemContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(plosBIBParser.LBRACE, 0); }
		public BibLabelContext bibLabel() {
			return getRuleContext(BibLabelContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(plosBIBParser.RBRACE, 0); }
		public AuthorListContext authorList() {
			return getRuleContext(AuthorListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(plosBIBParser.LPAREN, 0); }
		public BibYearContext bibYear() {
			return getRuleContext(BibYearContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(plosBIBParser.RPAREN, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public PublishingContext publishing() {
			return getRuleContext(PublishingContext.class,0);
		}
		public BibItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterBibItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitBibItem(this);
		}
	}

	public final BibItemContext bibItem() throws RecognitionException {
		BibItemContext _localctx = new BibItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bibItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			match(T__2);
			setState(29); 
			match(LBRACE);
			setState(30); 
			bibLabel();
			setState(31); 
			match(RBRACE);
			setState(32); 
			authorList();
			setState(33); 
			match(LPAREN);
			setState(34); 
			bibYear();
			setState(35); 
			match(RPAREN);
			setState(36); 
			title();
			setState(37); 
			address();
			setState(38); 
			publishing();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorListContext extends ParserRuleContext {
		public List<AuthorContext> author() {
			return getRuleContexts(AuthorContext.class);
		}
		public AuthorContext author(int i) {
			return getRuleContext(AuthorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(plosBIBParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(plosBIBParser.COMMA, i);
		}
		public AuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterAuthorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitAuthorList(this);
		}
	}

	public final AuthorListContext authorList() throws RecognitionException {
		AuthorListContext _localctx = new AuthorListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			author();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(41); 
				match(COMMA);
				setState(42); 
				author();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(plosBIBParser.Text, 0); }
		public List<TerminalNode> NameStartChar() { return getTokens(plosBIBParser.NameStartChar); }
		public TerminalNode NameStartChar(int i) {
			return getToken(plosBIBParser.NameStartChar, i);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitAuthor(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			match(Text);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NameStartChar) {
				{
				{
				setState(49); 
				match(NameStartChar);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BibLabelContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(plosBIBParser.Text, 0); }
		public BibLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterBibLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitBibLabel(this);
		}
	}

	public final BibLabelContext bibLabel() throws RecognitionException {
		BibLabelContext _localctx = new BibLabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bibLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			match(Text);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BibYearContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(plosBIBParser.Text, 0); }
		public BibYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterBibYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitBibYear(this);
		}
	}

	public final BibYearContext bibYear() throws RecognitionException {
		BibYearContext _localctx = new BibYearContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bibYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			match(Text);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(plosBIBParser.DOT, 0); }
		public List<TerminalNode> Text() { return getTokens(plosBIBParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(plosBIBParser.Text, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(59); 
				match(Text);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); 
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(plosBIBParser.COMMA, 0); }
		public List<TerminalNode> Text() { return getTokens(plosBIBParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(plosBIBParser.Text, i);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67); 
					match(Text);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(73); 
				match(Text);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); 
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PublishingContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(plosBIBParser.DOT, 0); }
		public List<TerminalNode> Text() { return getTokens(plosBIBParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(plosBIBParser.Text, i);
		}
		public PublishingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publishing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterPublishing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitPublishing(this);
		}
	}

	public final PublishingContext publishing() throws RecognitionException {
		PublishingContext _localctx = new PublishingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_publishing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(81); 
				match(Text);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87); 
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\7\5\65\n"+
		"\5\f\5\16\58\13\5\3\6\3\6\3\7\3\7\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3\b"+
		"\3\t\7\tG\n\t\f\t\16\tJ\13\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3\t\3\n\7"+
		"\nU\n\n\f\n\16\nX\13\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2Y\2"+
		"\24\3\2\2\2\4\36\3\2\2\2\6*\3\2\2\2\b\62\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2"+
		"\16@\3\2\2\2\20H\3\2\2\2\22V\3\2\2\2\24\25\7\3\2\2\25\26\7\6\2\2\26\30"+
		"\7%\2\2\27\31\5\4\3\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33"+
		"\3\2\2\2\33\34\3\2\2\2\34\35\7\4\2\2\35\3\3\2\2\2\36\37\7\5\2\2\37 \7"+
		"$\2\2 !\5\n\6\2!\"\7%\2\2\"#\5\6\4\2#$\7\"\2\2$%\5\f\7\2%&\7#\2\2&\'\5"+
		"\16\b\2\'(\5\20\t\2()\5\22\n\2)\5\3\2\2\2*/\5\b\5\2+,\7)\2\2,.\5\b\5\2"+
		"-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2"+
		"\62\66\7\6\2\2\63\65\7\f\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\t\3\2\2\28\66\3\2\2\29:\7\6\2\2:\13\3\2\2\2;<\7\6\2\2<"+
		"\r\3\2\2\2=?\7\6\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"B@\3\2\2\2CD\7*\2\2D\17\3\2\2\2EG\7\6\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\7\6\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7)\2\2R\21\3\2\2\2SU\7\6\2\2TS\3\2"+
		"\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7*\2\2Z\23\3"+
		"\2\2\2\t\32/\66@HNV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}