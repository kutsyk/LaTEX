// Generated from Bib.g4 by ANTLR 4.2.2
package com.kutsyk.bibliography;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BibParser}.
 */
public interface BibListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BibParser#articleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArticleDeclaration(@NotNull BibParser.ArticleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#articleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArticleDeclaration(@NotNull BibParser.ArticleDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull BibParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull BibParser.SymbolContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#initialList}.
	 * @param ctx the parse tree
	 */
	void enterInitialList(@NotNull BibParser.InitialListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#initialList}.
	 * @param ctx the parse tree
	 */
	void exitInitialList(@NotNull BibParser.InitialListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(@NotNull BibParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(@NotNull BibParser.YearContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(@NotNull BibParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(@NotNull BibParser.NumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull BibParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull BibParser.DotContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void enterItalicBlock(@NotNull BibParser.ItalicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#italicBlock}.
	 * @param ctx the parse tree
	 */
	void exitItalicBlock(@NotNull BibParser.ItalicBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#pageBlockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPageBlockDeclaration(@NotNull BibParser.PageBlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#pageBlockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPageBlockDeclaration(@NotNull BibParser.PageBlockDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull BibParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull BibParser.TitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#authorBlockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAuthorBlockDeclaration(@NotNull BibParser.AuthorBlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#authorBlockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAuthorBlockDeclaration(@NotNull BibParser.AuthorBlockDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#sol}.
	 * @param ctx the parse tree
	 */
	void enterSol(@NotNull BibParser.SolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#sol}.
	 * @param ctx the parse tree
	 */
	void exitSol(@NotNull BibParser.SolContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#memberList}.
	 * @param ctx the parse tree
	 */
	void enterMemberList(@NotNull BibParser.MemberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#memberList}.
	 * @param ctx the parse tree
	 */
	void exitMemberList(@NotNull BibParser.MemberListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#journal}.
	 * @param ctx the parse tree
	 */
	void enterJournal(@NotNull BibParser.JournalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#journal}.
	 * @param ctx the parse tree
	 */
	void exitJournal(@NotNull BibParser.JournalContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#pages}.
	 * @param ctx the parse tree
	 */
	void enterPages(@NotNull BibParser.PagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#pages}.
	 * @param ctx the parse tree
	 */
	void exitPages(@NotNull BibParser.PagesContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#compile}.
	 * @param ctx the parse tree
	 */
	void enterCompile(@NotNull BibParser.CompileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#compile}.
	 * @param ctx the parse tree
	 */
	void exitCompile(@NotNull BibParser.CompileContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(@NotNull BibParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(@NotNull BibParser.SimpleTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#etAl}.
	 * @param ctx the parse tree
	 */
	void enterEtAl(@NotNull BibParser.EtAlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#etAl}.
	 * @param ctx the parse tree
	 */
	void exitEtAl(@NotNull BibParser.EtAlContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull BibParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull BibParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#surname}.
	 * @param ctx the parse tree
	 */
	void enterSurname(@NotNull BibParser.SurnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#surname}.
	 * @param ctx the parse tree
	 */
	void exitSurname(@NotNull BibParser.SurnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull BibParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull BibParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#plainText}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(@NotNull BibParser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#plainText}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(@NotNull BibParser.PlainTextContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull BibParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull BibParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull BibParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull BibParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(@NotNull BibParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(@NotNull BibParser.SemiContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#booktitle}.
	 * @param ctx the parse tree
	 */
	void enterBooktitle(@NotNull BibParser.BooktitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#booktitle}.
	 * @param ctx the parse tree
	 */
	void exitBooktitle(@NotNull BibParser.BooktitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(@NotNull BibParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(@NotNull BibParser.InitialContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(@NotNull BibParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(@NotNull BibParser.AuthorContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void enterHyphen(@NotNull BibParser.HyphenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#hyphen}.
	 * @param ctx the parse tree
	 */
	void exitHyphen(@NotNull BibParser.HyphenContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#symbolBlock}.
	 * @param ctx the parse tree
	 */
	void enterSymbolBlock(@NotNull BibParser.SymbolBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#symbolBlock}.
	 * @param ctx the parse tree
	 */
	void exitSymbolBlock(@NotNull BibParser.SymbolBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#simpleBlock}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBlock(@NotNull BibParser.SimpleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#simpleBlock}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBlock(@NotNull BibParser.SimpleBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#bookDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBookDeclaration(@NotNull BibParser.BookDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#bookDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBookDeclaration(@NotNull BibParser.BookDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull BibParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull BibParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#referenceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDeclaration(@NotNull BibParser.ReferenceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#referenceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDeclaration(@NotNull BibParser.ReferenceDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#apostrophe}.
	 * @param ctx the parse tree
	 */
	void enterApostrophe(@NotNull BibParser.ApostropheContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#apostrophe}.
	 * @param ctx the parse tree
	 */
	void exitApostrophe(@NotNull BibParser.ApostropheContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#volume}.
	 * @param ctx the parse tree
	 */
	void enterVolume(@NotNull BibParser.VolumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#volume}.
	 * @param ctx the parse tree
	 */
	void exitVolume(@NotNull BibParser.VolumeContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(@NotNull BibParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(@NotNull BibParser.CommaContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#eNumbers}.
	 * @param ctx the parse tree
	 */
	void enterENumbers(@NotNull BibParser.ENumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#eNumbers}.
	 * @param ctx the parse tree
	 */
	void exitENumbers(@NotNull BibParser.ENumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#authorName}.
	 * @param ctx the parse tree
	 */
	void enterAuthorName(@NotNull BibParser.AuthorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#authorName}.
	 * @param ctx the parse tree
	 */
	void exitAuthorName(@NotNull BibParser.AuthorNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(@NotNull BibParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(@NotNull BibParser.ColonContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#publisher}.
	 * @param ctx the parse tree
	 */
	void enterPublisher(@NotNull BibParser.PublisherContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#publisher}.
	 * @param ctx the parse tree
	 */
	void exitPublisher(@NotNull BibParser.PublisherContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#pagesBlock}.
	 * @param ctx the parse tree
	 */
	void enterPagesBlock(@NotNull BibParser.PagesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#pagesBlock}.
	 * @param ctx the parse tree
	 */
	void exitPagesBlock(@NotNull BibParser.PagesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BibParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull BibParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull BibParser.IntervalContext ctx);
}