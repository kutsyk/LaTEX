// Generated from BibPlos.g4 by ANTLR 4.5
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
public class BibPlosParser extends Parser {
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
		COMMA=40, DOT=41, WS=42, LINE_COMMENT=43, SkipString=44;
	public static final int
		RULE_compilationUnit = 0, RULE_acknowledgment = 1, RULE_refs = 2, RULE_bibItem = 3, 
		RULE_authorList = 4, RULE_author = 5, RULE_bibLabel = 6, RULE_bibYear = 7, 
		RULE_title = 8, RULE_address = 9, RULE_publishing = 10, RULE_simpleText = 11;
	public static final String[] ruleNames = {
		"compilationUnit", "acknowledgment", "refs", "bibItem", "authorList", 
		"author", "bibLabel", "bibYear", "title", "address", "publishing", "simpleText"
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
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "WS", "LINE_COMMENT", 
		"SkipString"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BibPlos.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BibPlosParser(TokenStream input) {
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
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			acknowledgment();
			setState(25);
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
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BibPlosParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BibPlosParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BibPlosParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BibPlosParser.DOT, i);
		}
		public AcknowledgmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acknowledgment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterAcknowledgment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitAcknowledgment(this);
		}
	}

	public final AcknowledgmentContext acknowledgment() throws RecognitionException {
		AcknowledgmentContext _localctx = new AcknowledgmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_acknowledgment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(31);
				switch (_input.LA(1)) {
				case Text:
					{
					setState(28);
					simpleText();
					}
					break;
				case COMMA:
					{
					setState(29);
					match(COMMA);
					}
					break;
				case DOT:
					{
					setState(30);
					match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Text) | (1L << COMMA) | (1L << DOT))) != 0) );
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
		public TerminalNode Text() { return getToken(BibPlosParser.Text, 0); }
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
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterRefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitRefs(this);
		}
	}

	public final RefsContext refs() throws RecognitionException {
		RefsContext _localctx = new RefsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_refs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__1);
			setState(36);
			match(Text);
			setState(37);
			match(RBRACE);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				bibItem();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(43);
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
		public TerminalNode LBRACE() { return getToken(BibPlosParser.LBRACE, 0); }
		public BibLabelContext bibLabel() {
			return getRuleContext(BibLabelContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BibPlosParser.RBRACE, 0); }
		public AuthorListContext authorList() {
			return getRuleContext(AuthorListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BibPlosParser.LPAREN, 0); }
		public BibYearContext bibYear() {
			return getRuleContext(BibYearContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BibPlosParser.RPAREN, 0); }
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
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterBibItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitBibItem(this);
		}
	}

	public final BibItemContext bibItem() throws RecognitionException {
		BibItemContext _localctx = new BibItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bibItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(46);
			match(LBRACE);
			setState(47);
			bibLabel();
			setState(48);
			match(RBRACE);
			setState(49);
			authorList();
			setState(50);
			match(LPAREN);
			setState(51);
			bibYear();
			setState(52);
			match(RPAREN);
			setState(53);
			title();
			setState(54);
			address();
			setState(55);
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
		public List<TerminalNode> COMMA() { return getTokens(BibPlosParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BibPlosParser.COMMA, i);
		}
		public AuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterAuthorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitAuthorList(this);
		}
	}

	public final AuthorListContext authorList() throws RecognitionException {
		AuthorListContext _localctx = new AuthorListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			author();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(58);
				match(COMMA);
				setState(59);
				author();
				}
				}
				setState(64);
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
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitAuthor(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				simpleText();
				}
				}
				setState(68); 
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
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public BibLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterBibLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitBibLabel(this);
		}
	}

	public final BibLabelContext bibLabel() throws RecognitionException {
		BibLabelContext _localctx = new BibLabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bibLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			simpleText();
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
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public BibYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bibYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterBibYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitBibYear(this);
		}
	}

	public final BibYearContext bibYear() throws RecognitionException {
		BibYearContext _localctx = new BibYearContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bibYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			simpleText();
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
		public TerminalNode DOT() { return getToken(BibPlosParser.DOT, 0); }
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(74);
				simpleText();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		public TerminalNode COMMA() { return getToken(BibPlosParser.COMMA, 0); }
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<TerminalNode> Text() { return getTokens(BibPlosParser.Text); }
		public TerminalNode Text(int i) {
			return getToken(BibPlosParser.Text, i);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitAddress(this);
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
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					simpleText();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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
		public TerminalNode DOT() { return getToken(BibPlosParser.DOT, 0); }
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public PublishingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publishing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterPublishing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitPublishing(this);
		}
	}

	public final PublishingContext publishing() throws RecognitionException {
		PublishingContext _localctx = new PublishingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_publishing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(96);
				simpleText();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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

	public static class SimpleTextContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(BibPlosParser.Text, 0); }
		public SimpleTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterSimpleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitSimpleText(this);
		}
	}

	public final SimpleTextContext simpleText() throws RecognitionException {
		SimpleTextContext _localctx = new SimpleTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.m\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\"\n\3\r\3\16\3#\3\4\3\4\3"+
		"\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\7\6\7E\n\7\r\7\16\7"+
		"F\3\b\3\b\3\t\3\t\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\n\3\n\3\13\7\13V\n\13"+
		"\f\13\16\13Y\13\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\13\3\13\3\f\7"+
		"\fd\n\f\f\f\16\fg\13\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\2j\2\32\3\2\2\2\4\35\3\2\2\2\6%\3\2\2\2\b/\3\2\2\2\n;\3\2"+
		"\2\2\fD\3\2\2\2\16H\3\2\2\2\20J\3\2\2\2\22O\3\2\2\2\24W\3\2\2\2\26e\3"+
		"\2\2\2\30j\3\2\2\2\32\33\5\4\3\2\33\34\5\6\4\2\34\3\3\2\2\2\35!\7\3\2"+
		"\2\36\"\5\30\r\2\37\"\7*\2\2 \"\7+\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2"+
		"\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%&\7\4\2\2&\'\7\7\2\2\')\7"+
		"&\2\2(*\5\b\5\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7"+
		"\5\2\2.\7\3\2\2\2/\60\7\6\2\2\60\61\7%\2\2\61\62\5\16\b\2\62\63\7&\2\2"+
		"\63\64\5\n\6\2\64\65\7#\2\2\65\66\5\20\t\2\66\67\7$\2\2\678\5\22\n\28"+
		"9\5\24\13\29:\5\26\f\2:\t\3\2\2\2;@\5\f\7\2<=\7*\2\2=?\5\f\7\2><\3\2\2"+
		"\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2B@\3\2\2\2CE\5\30\r\2DC\3"+
		"\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\r\3\2\2\2HI\5\30\r\2I\17\3\2\2\2"+
		"JK\5\30\r\2K\21\3\2\2\2LN\5\30\r\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2PR\3\2\2\2QO\3\2\2\2RS\7+\2\2S\23\3\2\2\2TV\5\30\r\2UT\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\7\7\2\2[Z\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7*\2\2a\25\3\2\2\2"+
		"bd\5\30\r\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2"+
		"\2hi\7+\2\2i\27\3\2\2\2jk\7\7\2\2k\31\3\2\2\2\13!#+@FOW]e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}