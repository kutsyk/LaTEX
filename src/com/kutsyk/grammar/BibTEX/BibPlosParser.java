// Generated from BibPlos.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BibPlosParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Text=7, String=8, Number=9, 
		INT=10, DOUBLE=11, NameChar=12, NameStartChar=13, ASSIGN=14, GT=15, LT=16, 
		BANG=17, TILDE=18, QUESTION=19, COLON=20, EQUAL=21, LE=22, GE=23, NOTEQUAL=24, 
		AND=25, OR=26, INC=27, DEC=28, ADD=29, SUB=30, MUL=31, BITAND=32, BITOR=33, 
		CARET=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, RBRACK=40, 
		SEMI=41, COMMA=42, DOT=43, WS=44, LINE_COMMENT=45, SkipString=46;
	public static final int
		RULE_compilationUnit = 0, RULE_acknowledgment = 1, RULE_refs = 2, RULE_bibItem = 3, 
		RULE_authorList = 4, RULE_author = 5, RULE_additionalInfo = 6, RULE_bibLabel = 7, 
		RULE_bibYear = 8, RULE_title = 9, RULE_address = 10, RULE_publishing = 11, 
		RULE_simpleText = 12;
	public static final String[] ruleNames = {
		"compilationUnit", "acknowledgment", "refs", "bibItem", "authorList", 
		"author", "additionalInfo", "bibLabel", "bibYear", "title", "address", 
		"publishing", "simpleText"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\section*{'", "'Acknowledgments'", "'acknowledgments'", "'\\begin{thebibliography}{'", 
		"'\\end{thebibliography}'", "'\\bibitem'", null, null, null, null, null, 
		null, null, "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'&'", 
		"'|'", "'^'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Text", "String", "Number", 
		"INT", "DOUBLE", "NameChar", "NameStartChar", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "BITAND", "BITOR", "CARET", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"WS", "LINE_COMMENT", "SkipString"
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
			setState(26);
			acknowledgment();
			setState(27);
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
			setState(29);
			match(T__0);
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(31);
			match(RBRACE);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				switch (_input.LA(1)) {
				case Text:
					{
					setState(32);
					simpleText();
					}
					break;
				case COMMA:
					{
					setState(33);
					match(COMMA);
					}
					break;
				case DOT:
					{
					setState(34);
					match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37); 
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
			setState(39);
			match(T__3);
			setState(40);
			match(Text);
			setState(41);
			match(RBRACE);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				bibItem();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(47);
			match(T__4);
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
		public AdditionalInfoContext additionalInfo() {
			return getRuleContext(AdditionalInfoContext.class,0);
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
			setState(49);
			match(T__5);
			setState(50);
			match(LBRACE);
			setState(51);
			bibLabel();
			setState(52);
			match(RBRACE);
			setState(53);
			authorList();
			setState(54);
			match(DOT);
			setState(55);
			additionalInfo();
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

	public static class AdditionalInfoContext extends ParserRuleContext {
		public List<SimpleTextContext> simpleText() {
			return getRuleContexts(SimpleTextContext.class);
		}
		public SimpleTextContext simpleText(int i) {
			return getRuleContext(SimpleTextContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(BibPlosParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BibPlosParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BibPlosParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BibPlosParser.COMMA, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BibPlosParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BibPlosParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BibPlosParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BibPlosParser.RPAREN, i);
		}
		public AdditionalInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).enterAdditionalInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BibPlosListener ) ((BibPlosListener)listener).exitAdditionalInfo(this);
		}
	}

	public final AdditionalInfoContext additionalInfo() throws RecognitionException {
		AdditionalInfoContext _localctx = new AdditionalInfoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_additionalInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Text) | (1L << LPAREN) | (1L << RPAREN) | (1L << COMMA) | (1L << DOT))) != 0)) {
				{
				setState(75);
				switch (_input.LA(1)) {
				case Text:
					{
					setState(70);
					simpleText();
					}
					break;
				case DOT:
					{
					setState(71);
					match(DOT);
					}
					break;
				case COMMA:
					{
					setState(72);
					match(COMMA);
					}
					break;
				case LPAREN:
					{
					setState(73);
					match(LPAREN);
					}
					break;
				case RPAREN:
					{
					setState(74);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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
		enterRule(_localctx, 14, RULE_bibLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 16, RULE_bibYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
		enterRule(_localctx, 18, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(84);
				simpleText();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		enterRule(_localctx, 20, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					simpleText();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(98);
				match(Text);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
		enterRule(_localctx, 22, RULE_publishing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Text) {
				{
				{
				setState(106);
				simpleText();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 24, RULE_simpleText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3&\n\3"+
		"\r\3\16\3\'\3\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\7\6\7E\n\7\r\7"+
		"\16\7F\3\b\3\b\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t\3\n\3\n\3\13"+
		"\7\13X\n\13\f\13\16\13[\13\13\3\13\3\13\3\f\7\f`\n\f\f\f\16\fc\13\f\3"+
		"\f\7\ff\n\f\f\f\16\fi\13\f\3\f\3\f\3\r\7\rn\n\r\f\r\16\rq\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\4\5x\2"+
		"\34\3\2\2\2\4\37\3\2\2\2\6)\3\2\2\2\b\63\3\2\2\2\n;\3\2\2\2\fD\3\2\2\2"+
		"\16O\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24Y\3\2\2\2\26a\3\2\2\2\30o\3\2\2"+
		"\2\32t\3\2\2\2\34\35\5\4\3\2\35\36\5\6\4\2\36\3\3\2\2\2\37 \7\3\2\2 !"+
		"\t\2\2\2!%\7(\2\2\"&\5\32\16\2#&\7,\2\2$&\7-\2\2%\"\3\2\2\2%#\3\2\2\2"+
		"%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)*\7\6\2\2*+\7\t"+
		"\2\2+-\7(\2\2,.\5\b\5\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\7\7\2\2\62\7\3\2\2\2\63\64\7\b\2\2\64\65\7\'\2\2\65\66"+
		"\5\20\t\2\66\67\7(\2\2\678\5\n\6\289\7-\2\29:\5\16\b\2:\t\3\2\2\2;@\5"+
		"\f\7\2<=\7,\2\2=?\5\f\7\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13"+
		"\3\2\2\2B@\3\2\2\2CE\5\32\16\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\r\3\2\2\2HN\5\32\16\2IN\7-\2\2JN\7,\2\2KN\7%\2\2LN\7&\2\2MH\3\2\2\2"+
		"MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"P\17\3\2\2\2QO\3\2\2\2RS\5\32\16\2S\21\3\2\2\2TU\5\32\16\2U\23\3\2\2\2"+
		"VX\5\32\16\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2"+
		"\2\2\\]\7-\2\2]\25\3\2\2\2^`\5\32\16\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7\t\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7,\2\2k\27\3\2\2\2ln\5\32\16\2ml\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7-\2\2s\31\3"+
		"\2\2\2tu\7\t\2\2u\33\3\2\2\2\r%\'/@FMOYago";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}