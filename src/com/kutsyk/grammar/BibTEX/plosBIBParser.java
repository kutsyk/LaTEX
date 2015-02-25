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
		T__0=1, T__1=2, T__2=3, T__3=4, Text=5, String=6, Number=7, INT=8, DOUBLE=9, 
		NameChar=10, NameStartChar=11, ASSIGN=12, GT=13, LT=14, BANG=15, TILDE=16, 
		QUESTION=17, COLON=18, EQUAL=19, LE=20, GE=21, NOTEQUAL=22, AND=23, OR=24, 
		INC=25, DEC=26, ADD=27, SUB=28, MUL=29, BITAND=30, BITOR=31, CARET=32, 
		LPAREN=33, RPAREN=34, LBRACE=35, RBRACE=36, LBRACK=37, RBRACK=38, SEMI=39, 
		COMMA=40, DOT=41, WS=42, LINE_COMMENT=43;
	public static final int
		RULE_compilationUnit = 0, RULE_acknowledgment = 1, RULE_refs = 2, RULE_bibItem = 3, 
		RULE_authorList = 4, RULE_author = 5, RULE_bibLabel = 6, RULE_bibYear = 7, 
		RULE_title = 8, RULE_address = 9, RULE_publishing = 10;
	public static final String[] ruleNames = {
		"compilationUnit", "acknowledgment", "refs", "bibItem", "authorList", 
		"author", "bibLabel", "bibYear", "title", "address", "publishing"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\section*{Acknowledgments}'", "'\\begin{thebibliography}{'", 
		"'\\end{thebibliography}'", "'\\bibitem'", null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'&'", 
		"'|'", "'^'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "Text", "String", "Number", "INT", "DOUBLE", 
		"NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT"
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
		public AcknowledgmentContext acknowledgment() {
			return getRuleContext(AcknowledgmentContext.class,0);
		}
		public RefsContext refs() {
			return getRuleContext(RefsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			acknowledgment();
			setState(23); 
			refs();
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

	public static class AcknowledgmentContext extends ParserRuleContext {
		public AcknowledgmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acknowledgment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterAcknowledgment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitAcknowledgment(this);
		}
	}

	public final AcknowledgmentContext acknowledgment() throws RecognitionException {
		AcknowledgmentContext _localctx = new AcknowledgmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_acknowledgment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			match(T__0);
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

	public static class RefsContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(plosBIBParser.Text, 0); }
		public List<BibItemContext> bibItem() {
			return getRuleContexts(BibItemContext.class);
		}
		public BibItemContext bibItem(int i) {
			return getRuleContext(BibItemContext.class,i);
		}
		public RefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).enterRefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof plosBIBListener ) ((plosBIBListener)listener).exitRefs(this);
		}
	}

	public final RefsContext refs() throws RecognitionException {
		RefsContext _localctx = new RefsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_refs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			match(T__1);
			setState(28); 
			match(Text);
			setState(29); 
			match(RBRACE);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); 
				bibItem();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(35); 
			match(T__2);
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
		enterRule(_localctx, 6, RULE_bibItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			match(T__3);
			setState(38); 
			match(LBRACE);
			setState(39); 
			bibLabel();
			setState(40); 
			match(RBRACE);
			setState(41); 
			authorList();
			setState(42); 
			match(LPAREN);
			setState(43); 
			bibYear();
			setState(44); 
			match(RPAREN);
			setState(45); 
			title();
			setState(46); 
			address();
			setState(47); 
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
		enterRule(_localctx, 8, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			author();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50); 
				match(COMMA);
				setState(51); 
				author();
				}
				}
				setState(56);
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
		public List<TerminalNode> Text() { return getTokens(plosBIBParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(plosBIBParser.Text, i);
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
		enterRule(_localctx, 10, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57); 
				match(Text);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Text );
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
		enterRule(_localctx, 12, RULE_bibLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
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
		enterRule(_localctx, 14, RULE_bibYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
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
		enterRule(_localctx, 16, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(66); 
				match(Text);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); 
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
		enterRule(_localctx, 18, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74); 
					match(Text);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(80); 
				match(Text);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); 
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
		enterRule(_localctx, 20, RULE_publishing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(88); 
				match(Text);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-c\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\6\4\"\n\4\r\4\16\4#\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\67\n\6"+
		"\f\6\16\6:\13\6\3\7\6\7=\n\7\r\7\16\7>\3\b\3\b\3\t\3\t\3\n\7\nF\n\n\f"+
		"\n\16\nI\13\n\3\n\3\n\3\13\7\13N\n\13\f\13\16\13Q\13\13\3\13\7\13T\n\13"+
		"\f\13\16\13W\13\13\3\13\3\13\3\f\7\f\\\n\f\f\f\16\f_\13\f\3\f\3\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2^\2\30\3\2\2\2\4\33\3\2\2\2\6\35"+
		"\3\2\2\2\b\'\3\2\2\2\n\63\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22"+
		"G\3\2\2\2\24O\3\2\2\2\26]\3\2\2\2\30\31\5\4\3\2\31\32\5\6\4\2\32\3\3\2"+
		"\2\2\33\34\7\3\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\37\7\7\2\2\37!\7&\2\2"+
		" \"\5\b\5\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\5\2"+
		"\2&\7\3\2\2\2\'(\7\6\2\2()\7%\2\2)*\5\16\b\2*+\7&\2\2+,\5\n\6\2,-\7#\2"+
		"\2-.\5\20\t\2./\7$\2\2/\60\5\22\n\2\60\61\5\24\13\2\61\62\5\26\f\2\62"+
		"\t\3\2\2\2\638\5\f\7\2\64\65\7*\2\2\65\67\5\f\7\2\66\64\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:8\3\2\2\2;=\7\7\2\2<;\3\2\2\2"+
		"=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@A\7\7\2\2A\17\3\2\2\2BC\7\7"+
		"\2\2C\21\3\2\2\2DF\7\7\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3"+
		"\2\2\2IG\3\2\2\2JK\7+\2\2K\23\3\2\2\2LN\7\7\2\2ML\3\2\2\2NQ\3\2\2\2OM"+
		"\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2\2RT\7\7\2\2SR\3\2\2\2TW\3\2\2\2U"+
		"S\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7*\2\2Y\25\3\2\2\2Z\\\7\7\2"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7+\2"+
		"\2a\27\3\2\2\2\t#8>GOU]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}