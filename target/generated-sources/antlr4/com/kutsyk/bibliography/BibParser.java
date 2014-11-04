// Generated from Bib.g4 by ANTLR 4.2.2
package com.kutsyk.bibliography;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BibParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, String=38, RightBrace=39, 
		LeftBrace=40, Character=41, Initials=42, Numbers=43, Double=44, Misc=45, 
		InProceedings=46, Month=47, Url=48, Number=49, Doi=50, Issn=51, Keywords=52, 
		Abstract=53, Edition=54, Note=55, Int=56, WS=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'Title'", "'@Book'", "'Pages'", "'title'", "'\\'", 
		"';'", "'pages'", "'AND'", "'booktitle'", "'Journal ='", "'='", "'author'", 
		"'?'", "'Volume ='", "'@Article'", "'Author'", "'@book'", "'''", "'@article'", 
		"'Publisher'", "'journal ='", "','", "'.'", "'\\it'", "'volume ='", "'Year ='", 
		"'publisher'", "':'", "'~'", "'al'", "'and'", "'+'", "'year ='", "'et'", 
		"'-'", "'Booktitle'", "String", "'{'", "'}'", "Character", "Initials", 
		"Numbers", "Double", "Misc", "InProceedings", "Month", "Url", "Number", 
		"Doi", "Issn", "Keywords", "Abstract", "Edition", "Note", "Int", "WS"
	};
	public static final int
		RULE_compile = 0, RULE_referenceDeclaration = 1, RULE_articleDeclaration = 2, 
		RULE_bookDeclaration = 3, RULE_block = 4, RULE_label = 5, RULE_memberList = 6, 
		RULE_member = 7, RULE_author = 8, RULE_authorBlockDeclaration = 9, RULE_etAl = 10, 
		RULE_and = 11, RULE_authorName = 12, RULE_initialList = 13, RULE_surname = 14, 
		RULE_symbolBlock = 15, RULE_title = 16, RULE_journal = 17, RULE_volume = 18, 
		RULE_pages = 19, RULE_year = 20, RULE_publisher = 21, RULE_booktitle = 22, 
		RULE_pagesBlock = 23, RULE_pageBlockDeclaration = 24, RULE_eNumbers = 25, 
		RULE_interval = 26, RULE_numbers = 27, RULE_hyphen = 28, RULE_colon = 29, 
		RULE_simpleBlock = 30, RULE_simpleText = 31, RULE_plainText = 32, RULE_text = 33, 
		RULE_semi = 34, RULE_comma = 35, RULE_apostrophe = 36, RULE_sol = 37, 
		RULE_dot = 38, RULE_symbol = 39, RULE_initial = 40, RULE_italicBlock = 41;
	public static final String[] ruleNames = {
		"compile", "referenceDeclaration", "articleDeclaration", "bookDeclaration", 
		"block", "label", "memberList", "member", "author", "authorBlockDeclaration", 
		"etAl", "and", "authorName", "initialList", "surname", "symbolBlock", 
		"title", "journal", "volume", "pages", "year", "publisher", "booktitle", 
		"pagesBlock", "pageBlockDeclaration", "eNumbers", "interval", "numbers", 
		"hyphen", "colon", "simpleBlock", "simpleText", "plainText", "text", "semi", 
		"comma", "apostrophe", "sol", "dot", "symbol", "initial", "italicBlock"
	};

	@Override
	public String getGrammarFileName() { return "Bib.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BibParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BibParser.EOF, 0); }
		public List<ReferenceDeclarationContext> referenceDeclaration() {
			return getRuleContexts(ReferenceDeclarationContext.class);
		}
		public ReferenceDeclarationContext referenceDeclaration(int i) {
			return getRuleContext(ReferenceDeclarationContext.class,i);
		}
		public CompileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterCompile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitCompile(this);
		}
	}

	public final CompileContext compile() throws RecognitionException {
		CompileContext _localctx = new CompileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 16) | (1L << 18) | (1L << 20))) != 0)) {
				{
				{
				setState(84); referenceDeclaration();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(EOF);
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

	public static class ReferenceDeclarationContext extends ParserRuleContext {
		public BookDeclarationContext bookDeclaration() {
			return getRuleContext(BookDeclarationContext.class,0);
		}
		public ArticleDeclarationContext articleDeclaration() {
			return getRuleContext(ArticleDeclarationContext.class,0);
		}
		public ReferenceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterReferenceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitReferenceDeclaration(this);
		}
	}

	public final ReferenceDeclarationContext referenceDeclaration() throws RecognitionException {
		ReferenceDeclarationContext _localctx = new ReferenceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_referenceDeclaration);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case 16:
			case 20:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); articleDeclaration();
				}
				break;
			case 3:
			case 18:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); bookDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArticleDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArticleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterArticleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitArticleDeclaration(this);
		}
	}

	public final ArticleDeclarationContext articleDeclaration() throws RecognitionException {
		ArticleDeclarationContext _localctx = new ArticleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_articleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==16 || _la==20) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(97); block();
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

	public static class BookDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BookDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterBookDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitBookDeclaration(this);
		}
	}

	public final BookDeclarationContext bookDeclaration() throws RecognitionException {
		BookDeclarationContext _localctx = new BookDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bookDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(100); block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public MemberListContext memberList() {
			return getRuleContext(MemberListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(RightBrace);
			setState(103); label();
			setState(104); memberList();
			setState(105); match(LeftBrace);
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

	public static class LabelContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107); text();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class MemberListContext extends ParserRuleContext {
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitMemberList(this);
		}
	}

	public final MemberListContext memberList() throws RecognitionException {
		MemberListContext _localctx = new MemberListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); member();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 5) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 34) | (1L << 37) | (1L << RightBrace))) != 0)) {
				{
				{
				setState(114); member();
				}
				}
				setState(119);
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

	public static class MemberContext extends ParserRuleContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PagesContext pages() {
			return getRuleContext(PagesContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public PublisherContext publisher() {
			return getRuleContext(PublisherContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SolContext sol() {
			return getRuleContext(SolContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public BooktitleContext booktitle() {
			return getRuleContext(BooktitleContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VolumeContext volume() {
			return getRuleContext(VolumeContext.class,0);
		}
		public JournalContext journal() {
			return getRuleContext(JournalContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case 13:
			case 17:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); author();
				}
				break;
			case 2:
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); title();
				}
				break;
			case 11:
			case 22:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); journal();
				}
				break;
			case 15:
			case 26:
				enterOuterAlt(_localctx, 4);
				{
				setState(123); volume();
				}
				break;
			case 4:
			case 8:
				enterOuterAlt(_localctx, 5);
				{
				setState(124); pages();
				}
				break;
			case 27:
			case 34:
				enterOuterAlt(_localctx, 6);
				{
				setState(125); year();
				}
				break;
			case 21:
			case 28:
				enterOuterAlt(_localctx, 7);
				{
				setState(126); publisher();
				}
				break;
			case 10:
			case 37:
				enterOuterAlt(_localctx, 8);
				{
				setState(127); booktitle();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 9);
				{
				setState(128); colon();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 10);
				{
				setState(129); comma();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 11);
				{
				setState(130); sol();
				}
				break;
			case RightBrace:
				enterOuterAlt(_localctx, 12);
				{
				setState(131); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public AuthorBlockDeclarationContext authorBlockDeclaration() {
			return getRuleContext(AuthorBlockDeclarationContext.class,0);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterAuthor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitAuthor(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==13 || _la==17) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(135); match(12);
			setState(136); authorBlockDeclaration();
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

	public static class AuthorBlockDeclarationContext extends ParserRuleContext {
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public EtAlContext etAl() {
			return getRuleContext(EtAlContext.class,0);
		}
		public List<AuthorNameContext> authorName() {
			return getRuleContexts(AuthorNameContext.class);
		}
		public AuthorNameContext authorName(int i) {
			return getRuleContext(AuthorNameContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AuthorBlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorBlockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterAuthorBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitAuthorBlockDeclaration(this);
		}
	}

	public final AuthorBlockDeclarationContext authorBlockDeclaration() throws RecognitionException {
		AuthorBlockDeclarationContext _localctx = new AuthorBlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorBlockDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(RightBrace);
			setState(139); authorName();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140); and();
					setState(141); authorName();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 23) | (1L << 32) | (1L << 35))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9 || _la==32) {
					{
					{
					setState(148); and();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==23) {
					{
					{
					setState(154); match(23);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160); etAl();
				}
			}

			setState(163); match(LeftBrace);
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

	public static class EtAlContext extends ParserRuleContext {
		public EtAlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etAl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterEtAl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitEtAl(this);
		}
	}

	public final EtAlContext etAl() throws RecognitionException {
		EtAlContext _localctx = new EtAlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_etAl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(35);
			setState(166); match(31);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(167); match(24);
				}
				}
				setState(172);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==9 || _la==32) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AuthorNameContext extends ParserRuleContext {
		public InitialListContext initialList(int i) {
			return getRuleContext(InitialListContext.class,i);
		}
		public SurnameContext surname() {
			return getRuleContext(SurnameContext.class,0);
		}
		public List<InitialListContext> initialList() {
			return getRuleContexts(InitialListContext.class);
		}
		public AuthorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterAuthorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitAuthorName(this);
		}
	}

	public final AuthorNameContext authorName() throws RecognitionException {
		AuthorNameContext _localctx = new AuthorNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_authorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); surname();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Initials) {
				{
				{
				setState(176); initialList();
				}
				}
				setState(181);
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

	public static class InitialListContext extends ParserRuleContext {
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public InitialListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterInitialList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitInitialList(this);
		}
	}

	public final InitialListContext initialList() throws RecognitionException {
		InitialListContext _localctx = new InitialListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initialList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182); initial();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(183); match(24);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189); match(23);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class SurnameContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public SurnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSurname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSurname(this);
		}
	}

	public final SurnameContext surname() throws RecognitionException {
		SurnameContext _localctx = new SurnameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_surname);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195); text();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201); match(23);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207); text();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class SymbolBlockContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(BibParser.String, 0); }
		public SymbolBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSymbolBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSymbolBlock(this);
		}
	}

	public final SymbolBlockContext symbolBlock() throws RecognitionException {
		SymbolBlockContext _localctx = new SymbolBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_symbolBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(RightBrace);
			setState(214); match(String);
			setState(215); match(LeftBrace);
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
		public SimpleBlockContext simpleBlock() {
			return getRuleContext(SimpleBlockContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(218); match(12);
			setState(219); simpleBlock();
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

	public static class JournalContext extends ParserRuleContext {
		public SimpleBlockContext simpleBlock() {
			return getRuleContext(SimpleBlockContext.class,0);
		}
		public JournalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_journal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterJournal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitJournal(this);
		}
	}

	public final JournalContext journal() throws RecognitionException {
		JournalContext _localctx = new JournalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_journal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==11 || _la==22) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(222); simpleBlock();
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

	public static class VolumeContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public VolumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volume; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterVolume(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitVolume(this);
		}
	}

	public final VolumeContext volume() throws RecognitionException {
		VolumeContext _localctx = new VolumeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_volume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==26) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(225); match(RightBrace);
				}
				break;
			}
			setState(228); simpleText();
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(229); match(LeftBrace);
				}
				break;
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

	public static class PagesContext extends ParserRuleContext {
		public PagesBlockContext pagesBlock() {
			return getRuleContext(PagesBlockContext.class,0);
		}
		public PagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterPages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitPages(this);
		}
	}

	public final PagesContext pages() throws RecognitionException {
		PagesContext _localctx = new PagesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(233); match(12);
			setState(234); pagesBlock();
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

	public static class YearContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==27 || _la==34) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(237); match(RightBrace);
				}
				break;
			}
			setState(240); simpleText();
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(241); match(LeftBrace);
				}
				break;
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

	public static class PublisherContext extends ParserRuleContext {
		public SimpleBlockContext simpleBlock() {
			return getRuleContext(SimpleBlockContext.class,0);
		}
		public PublisherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publisher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterPublisher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitPublisher(this);
		}
	}

	public final PublisherContext publisher() throws RecognitionException {
		PublisherContext _localctx = new PublisherContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_publisher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==21 || _la==28) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(245); match(12);
			setState(246); simpleBlock();
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

	public static class BooktitleContext extends ParserRuleContext {
		public SimpleBlockContext simpleBlock() {
			return getRuleContext(SimpleBlockContext.class,0);
		}
		public BooktitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booktitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterBooktitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitBooktitle(this);
		}
	}

	public final BooktitleContext booktitle() throws RecognitionException {
		BooktitleContext _localctx = new BooktitleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booktitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==10 || _la==37) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(249); match(12);
			setState(250); simpleBlock();
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

	public static class PagesBlockContext extends ParserRuleContext {
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public PageBlockDeclarationContext pageBlockDeclaration() {
			return getRuleContext(PageBlockDeclarationContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public PagesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pagesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterPagesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitPagesBlock(this);
		}
	}

	public final PagesBlockContext pagesBlock() throws RecognitionException {
		PagesBlockContext _localctx = new PagesBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pagesBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(RightBrace);
			setState(253); pageBlockDeclaration();
			setState(254); match(LeftBrace);
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

	public static class PageBlockDeclarationContext extends ParserRuleContext {
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public ENumbersContext eNumbers() {
			return getRuleContext(ENumbersContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public PageBlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageBlockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterPageBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitPageBlockDeclaration(this);
		}
	}

	public final PageBlockDeclarationContext pageBlockDeclaration() throws RecognitionException {
		PageBlockDeclarationContext _localctx = new PageBlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pageBlockDeclaration);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(256); eNumbers();
				setState(257); simpleText();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); interval();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); numbers();
				}
				break;
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

	public static class ENumbersContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(BibParser.String, 0); }
		public ENumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eNumbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterENumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitENumbers(this);
		}
	}

	public final ENumbersContext eNumbers() throws RecognitionException {
		ENumbersContext _localctx = new ENumbersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eNumbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(String);
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

	public static class IntervalContext extends ParserRuleContext {
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); numbers();
			setState(266); match(36);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==36) {
				{
				{
				setState(267); match(36);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273); numbers();
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

	public static class NumbersContext extends ParserRuleContext {
		public TerminalNode Numbers() { return getToken(BibParser.Numbers, 0); }
		public NumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitNumbers(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(Numbers);
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

	public static class HyphenContext extends ParserRuleContext {
		public HyphenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterHyphen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitHyphen(this);
		}
	}

	public final HyphenContext hyphen() throws RecognitionException {
		HyphenContext _localctx = new HyphenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(36);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitColon(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(29);
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

	public static class SimpleBlockContext extends ParserRuleContext {
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public SimpleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSimpleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSimpleBlock(this);
		}
	}

	public final SimpleBlockContext simpleBlock() throws RecognitionException {
		SimpleBlockContext _localctx = new SimpleBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(RightBrace);
			setState(282); simpleText();
			setState(283); match(LeftBrace);
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
		public HyphenContext hyphen(int i) {
			return getRuleContext(HyphenContext.class,i);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public PlainTextContext plainText(int i) {
			return getRuleContext(PlainTextContext.class,i);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public List<SolContext> sol() {
			return getRuleContexts(SolContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public SolContext sol(int i) {
			return getRuleContext(SolContext.class,i);
		}
		public SimpleBlockContext simpleBlock(int i) {
			return getRuleContext(SimpleBlockContext.class,i);
		}
		public List<HyphenContext> hyphen() {
			return getRuleContexts(HyphenContext.class);
		}
		public ItalicBlockContext italicBlock(int i) {
			return getRuleContext(ItalicBlockContext.class,i);
		}
		public List<SimpleBlockContext> simpleBlock() {
			return getRuleContexts(SimpleBlockContext.class);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public List<ColonContext> colon() {
			return getRuleContexts(ColonContext.class);
		}
		public List<PlainTextContext> plainText() {
			return getRuleContexts(PlainTextContext.class);
		}
		public ColonContext colon(int i) {
			return getRuleContext(ColonContext.class,i);
		}
		public List<ItalicBlockContext> italicBlock() {
			return getRuleContexts(ItalicBlockContext.class);
		}
		public SimpleTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSimpleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSimpleText(this);
		}
	}

	public final SimpleTextContext simpleText() throws RecognitionException {
		SimpleTextContext _localctx = new SimpleTextContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simpleText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(294);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(285); simpleBlock();
						}
						break;

					case 2:
						{
						setState(286); italicBlock();
						}
						break;

					case 3:
						{
						setState(287); plainText();
						}
						break;

					case 4:
						{
						setState(288); symbol();
						}
						break;

					case 5:
						{
						setState(289); hyphen();
						}
						break;

					case 6:
						{
						setState(290); colon();
						}
						break;

					case 7:
						{
						setState(291); dot();
						}
						break;

					case 8:
						{
						setState(292); sol();
						}
						break;

					case 9:
						{
						setState(293); numbers();
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PlainTextContext extends ParserRuleContext {
		public List<TerminalNode> Initials() { return getTokens(BibParser.Initials); }
		public TerminalNode Initials(int i) {
			return getToken(BibParser.Initials, i);
		}
		public TerminalNode String() { return getToken(BibParser.String, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public PlainTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitPlainText(this);
		}
	}

	public final PlainTextContext plainText() throws RecognitionException {
		PlainTextContext _localctx = new PlainTextContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_plainText);
		try {
			int _alt;
			setState(312);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); match(String);
				}
				break;
			case Initials:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(300); match(Initials);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(303); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
			case 32:
				enterOuterAlt(_localctx, 3);
				{
				setState(305); and();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 4);
				{
				setState(306); match(24);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); match(23);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 6);
				{
				setState(308); match(14);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 7);
				{
				setState(309); match(30);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 8);
				{
				setState(310); match(33);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 9);
				{
				setState(311); match(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TextContext extends ParserRuleContext {
		public ApostropheContext apostrophe() {
			return getRuleContext(ApostropheContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(BibParser.RightBrace, 0); }
		public TerminalNode String() { return getToken(BibParser.String, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(BibParser.LeftBrace, 0); }
		public HyphenContext hyphen() {
			return getRuleContext(HyphenContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_text);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); match(String);
				}
				break;
			case RightBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(315); match(RightBrace);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); match(LeftBrace);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 4);
				{
				setState(317); apostrophe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 5);
				{
				setState(318); symbol();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 6);
				{
				setState(319); hyphen();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 7);
				{
				setState(320); match(24);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SemiContext extends ParserRuleContext {
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(7);
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); match(23);
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

	public static class ApostropheContext extends ParserRuleContext {
		public ApostropheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apostrophe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterApostrophe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitApostrophe(this);
		}
	}

	public final ApostropheContext apostrophe() throws RecognitionException {
		ApostropheContext _localctx = new ApostropheContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_apostrophe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(19);
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

	public static class SolContext extends ParserRuleContext {
		public SolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSol(this);
		}
	}

	public final SolContext sol() throws RecognitionException {
		SolContext _localctx = new SolContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(1);
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

	public static class DotContext extends ParserRuleContext {
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(24);
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

	public static class SymbolContext extends ParserRuleContext {
		public SymbolBlockContext symbolBlock() {
			return getRuleContext(SymbolBlockContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(6);
			setState(334); symbolBlock();
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

	public static class InitialContext extends ParserRuleContext {
		public TerminalNode Initials() { return getToken(BibParser.Initials, 0); }
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(Initials);
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

	public static class ItalicBlockContext extends ParserRuleContext {
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public ItalicBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).enterItalicBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibListener ) ((BibListener)listener).exitItalicBlock(this);
		}
	}

	public final ItalicBlockContext italicBlock() throws RecognitionException {
		ItalicBlockContext _localctx = new ItalicBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_italicBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(RightBrace);
			setState(339); match(25);
			setState(340); simpleText();
			setState(341); match(LeftBrace);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\7\7o\n\7\f\7\16\7r\13\7\3\b\3\b\7\bv\n"+
		"\b\f\b\16\by\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0087\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0092\n\13\f"+
		"\13\16\13\u0095\13\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13\13\3\13"+
		"\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\13\5\13\u00a4\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\r\3\r\3\16\3\16\7\16"+
		"\u00b4\n\16\f\16\16\16\u00b7\13\16\3\17\3\17\7\17\u00bb\n\17\f\17\16\17"+
		"\u00be\13\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13\17\3\20\7\20\u00c7"+
		"\n\20\f\20\16\20\u00ca\13\20\3\20\7\20\u00cd\n\20\f\20\16\20\u00d0\13"+
		"\20\3\20\7\20\u00d3\n\20\f\20\16\20\u00d6\13\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\5\24\u00e5\n\24\3\24\3\24"+
		"\5\24\u00e9\n\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00f1\n\26\3\26\3"+
		"\26\5\26\u00f5\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u0108\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\7\34\u010f\n\34\f\34\16\34\u0112\13\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0129\n!\f!"+
		"\16!\u012c\13!\3\"\3\"\6\"\u0130\n\"\r\"\16\"\u0131\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u013b\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u0144\n#\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\2\2,\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\r\4"+
		"\2\22\22\26\26\4\2\5\5\24\24\4\2\17\17\23\23\4\2\13\13\"\"\4\2\4\4\7\7"+
		"\4\2\r\r\30\30\4\2\21\21\34\34\4\2\6\6\n\n\4\2\35\35$$\4\2\27\27\36\36"+
		"\4\2\f\f\'\'\u0168\2Y\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\be\3\2\2\2\nh\3\2"+
		"\2\2\fp\3\2\2\2\16s\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u008c"+
		"\3\2\2\2\26\u00a7\3\2\2\2\30\u00af\3\2\2\2\32\u00b1\3\2\2\2\34\u00b8\3"+
		"\2\2\2\36\u00c8\3\2\2\2 \u00d7\3\2\2\2\"\u00db\3\2\2\2$\u00df\3\2\2\2"+
		"&\u00e2\3\2\2\2(\u00ea\3\2\2\2*\u00ee\3\2\2\2,\u00f6\3\2\2\2.\u00fa\3"+
		"\2\2\2\60\u00fe\3\2\2\2\62\u0107\3\2\2\2\64\u0109\3\2\2\2\66\u010b\3\2"+
		"\2\28\u0115\3\2\2\2:\u0117\3\2\2\2<\u0119\3\2\2\2>\u011b\3\2\2\2@\u012a"+
		"\3\2\2\2B\u013a\3\2\2\2D\u0143\3\2\2\2F\u0145\3\2\2\2H\u0147\3\2\2\2J"+
		"\u0149\3\2\2\2L\u014b\3\2\2\2N\u014d\3\2\2\2P\u014f\3\2\2\2R\u0152\3\2"+
		"\2\2T\u0154\3\2\2\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\7\2\2\3]\3\3\2\2\2^a\5\6\4\2_a\5\b\5\2`^\3\2"+
		"\2\2`_\3\2\2\2a\5\3\2\2\2bc\t\2\2\2cd\5\n\6\2d\7\3\2\2\2ef\t\3\2\2fg\5"+
		"\n\6\2g\t\3\2\2\2hi\7)\2\2ij\5\f\7\2jk\5\16\b\2kl\7*\2\2l\13\3\2\2\2m"+
		"o\5D#\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2s"+
		"w\5\20\t\2tv\5\20\t\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\17\3\2"+
		"\2\2yw\3\2\2\2z\u0087\5\22\n\2{\u0087\5\"\22\2|\u0087\5$\23\2}\u0087\5"+
		"&\24\2~\u0087\5(\25\2\177\u0087\5*\26\2\u0080\u0087\5,\27\2\u0081\u0087"+
		"\5.\30\2\u0082\u0087\5<\37\2\u0083\u0087\5H%\2\u0084\u0087\5L\'\2\u0085"+
		"\u0087\5\n\6\2\u0086z\3\2\2\2\u0086{\3\2\2\2\u0086|\3\2\2\2\u0086}\3\2"+
		"\2\2\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081"+
		"\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\21\3\2\2\2\u0088\u0089\t\4\2\2\u0089\u008a\7\16\2"+
		"\2\u008a\u008b\5\24\13\2\u008b\23\3\2\2\2\u008c\u008d\7)\2\2\u008d\u0093"+
		"\5\32\16\2\u008e\u008f\5\30\r\2\u008f\u0090\5\32\16\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u00a3\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\30"+
		"\r\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009f\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\31"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5\26"+
		"\f\2\u00a3\u0099\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\7*\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00ac\7!\2\2\u00a9"+
		"\u00ab\7\32\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\t\5\2\2\u00b0\31\3\2\2\2\u00b1\u00b5\5\36\20\2\u00b2\u00b4\5\34"+
		"\17\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bc\5R*\2"+
		"\u00b9\u00bb\7\32\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\7\31\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c7\5D#\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd"+
		"\7\31\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3"+
		"\5D#\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7)\2\2"+
		"\u00d8\u00d9\7(\2\2\u00d9\u00da\7*\2\2\u00da!\3\2\2\2\u00db\u00dc\t\6"+
		"\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\5> \2\u00de#\3\2\2\2\u00df\u00e0"+
		"\t\7\2\2\u00e0\u00e1\5> \2\u00e1%\3\2\2\2\u00e2\u00e4\t\b\2\2\u00e3\u00e5"+
		"\7)\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\5@!\2\u00e7\u00e9\7*\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2"+
		"\2\u00e9\'\3\2\2\2\u00ea\u00eb\t\t\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed"+
		"\5\60\31\2\u00ed)\3\2\2\2\u00ee\u00f0\t\n\2\2\u00ef\u00f1\7)\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\5@"+
		"!\2\u00f3\u00f5\7*\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5+"+
		"\3\2\2\2\u00f6\u00f7\t\13\2\2\u00f7\u00f8\7\16\2\2\u00f8\u00f9\5> \2\u00f9"+
		"-\3\2\2\2\u00fa\u00fb\t\f\2\2\u00fb\u00fc\7\16\2\2\u00fc\u00fd\5> \2\u00fd"+
		"/\3\2\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5\62\32\2\u0100\u0101\7*\2\2"+
		"\u0101\61\3\2\2\2\u0102\u0103\5\64\33\2\u0103\u0104\5@!\2\u0104\u0108"+
		"\3\2\2\2\u0105\u0108\5\66\34\2\u0106\u0108\58\35\2\u0107\u0102\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\63\3\2\2\2\u0109\u010a"+
		"\7(\2\2\u010a\65\3\2\2\2\u010b\u010c\58\35\2\u010c\u0110\7&\2\2\u010d"+
		"\u010f\7&\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\58\35\2\u0114\67\3\2\2\2\u0115\u0116\7-\2\2\u01169\3\2\2\2\u0117"+
		"\u0118\7&\2\2\u0118;\3\2\2\2\u0119\u011a\7\37\2\2\u011a=\3\2\2\2\u011b"+
		"\u011c\7)\2\2\u011c\u011d\5@!\2\u011d\u011e\7*\2\2\u011e?\3\2\2\2\u011f"+
		"\u0129\5> \2\u0120\u0129\5T+\2\u0121\u0129\5B\"\2\u0122\u0129\5P)\2\u0123"+
		"\u0129\5:\36\2\u0124\u0129\5<\37\2\u0125\u0129\5N(\2\u0126\u0129\5L\'"+
		"\2\u0127\u0129\58\35\2\u0128\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121"+
		"\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bA\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u013b\7(\2\2\u012e\u0130\7,\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013b\3\2"+
		"\2\2\u0133\u013b\5\30\r\2\u0134\u013b\7\32\2\2\u0135\u013b\7\31\2\2\u0136"+
		"\u013b\7\20\2\2\u0137\u013b\7 \2\2\u0138\u013b\7#\2\2\u0139\u013b\7\t"+
		"\2\2\u013a\u012d\3\2\2\2\u013a\u012f\3\2\2\2\u013a\u0133\3\2\2\2\u013a"+
		"\u0134\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013bC\3\2\2\2\u013c\u0144"+
		"\7(\2\2\u013d\u0144\7)\2\2\u013e\u0144\7*\2\2\u013f\u0144\5J&\2\u0140"+
		"\u0144\5P)\2\u0141\u0144\5:\36\2\u0142\u0144\7\32\2\2\u0143\u013c\3\2"+
		"\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u013f\3\2\2\2\u0143"+
		"\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144E\3\2\2\2"+
		"\u0145\u0146\7\t\2\2\u0146G\3\2\2\2\u0147\u0148\7\31\2\2\u0148I\3\2\2"+
		"\2\u0149\u014a\7\25\2\2\u014aK\3\2\2\2\u014b\u014c\7\3\2\2\u014cM\3\2"+
		"\2\2\u014d\u014e\7\32\2\2\u014eO\3\2\2\2\u014f\u0150\7\b\2\2\u0150\u0151"+
		"\5 \21\2\u0151Q\3\2\2\2\u0152\u0153\7,\2\2\u0153S\3\2\2\2\u0154\u0155"+
		"\7)\2\2\u0155\u0156\7\33\2\2\u0156\u0157\5@!\2\u0157\u0158\7*\2\2\u0158"+
		"U\3\2\2\2\35Y`pw\u0086\u0093\u0099\u009f\u00a3\u00ac\u00b5\u00bc\u00c2"+
		"\u00c8\u00ce\u00d4\u00e4\u00e8\u00f0\u00f4\u0107\u0110\u0128\u012a\u0131"+
		"\u013a\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}