// Generated from BibPlos.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BibPlosParser}.
 */
public interface BibPlosListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(BibPlosParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(BibPlosParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void enterAcknowledgment(BibPlosParser.AcknowledgmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void exitAcknowledgment(BibPlosParser.AcknowledgmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#refs}.
	 * @param ctx the parse tree
	 */
	void enterRefs(BibPlosParser.RefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#refs}.
	 * @param ctx the parse tree
	 */
	void exitRefs(BibPlosParser.RefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void enterBibItem(BibPlosParser.BibItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void exitBibItem(BibPlosParser.BibItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#authorList}.
	 * @param ctx the parse tree
	 */
	void enterAuthorList(BibPlosParser.AuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#authorList}.
	 * @param ctx the parse tree
	 */
	void exitAuthorList(BibPlosParser.AuthorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(BibPlosParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(BibPlosParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#additionalInfo}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalInfo(BibPlosParser.AdditionalInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#additionalInfo}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalInfo(BibPlosParser.AdditionalInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void enterBibLabel(BibPlosParser.BibLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void exitBibLabel(BibPlosParser.BibLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void enterBibYear(BibPlosParser.BibYearContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void exitBibYear(BibPlosParser.BibYearContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(BibPlosParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(BibPlosParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(BibPlosParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(BibPlosParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#publishing}.
	 * @param ctx the parse tree
	 */
	void enterPublishing(BibPlosParser.PublishingContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#publishing}.
	 * @param ctx the parse tree
	 */
	void exitPublishing(BibPlosParser.PublishingContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(BibPlosParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(BibPlosParser.SimpleTextContext ctx);
}