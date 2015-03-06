// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/BibTEX\BibPlos.g4 by ANTLR 4.5
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
	void enterCompilationUnit(@NotNull BibPlosParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull BibPlosParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void enterAcknowledgment(@NotNull BibPlosParser.AcknowledgmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void exitAcknowledgment(@NotNull BibPlosParser.AcknowledgmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#refs}.
	 * @param ctx the parse tree
	 */
	void enterRefs(@NotNull BibPlosParser.RefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#refs}.
	 * @param ctx the parse tree
	 */
	void exitRefs(@NotNull BibPlosParser.RefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void enterBibItem(@NotNull BibPlosParser.BibItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void exitBibItem(@NotNull BibPlosParser.BibItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#authorList}.
	 * @param ctx the parse tree
	 */
	void enterAuthorList(@NotNull BibPlosParser.AuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#authorList}.
	 * @param ctx the parse tree
	 */
	void exitAuthorList(@NotNull BibPlosParser.AuthorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(@NotNull BibPlosParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(@NotNull BibPlosParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void enterBibLabel(@NotNull BibPlosParser.BibLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void exitBibLabel(@NotNull BibPlosParser.BibLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void enterBibYear(@NotNull BibPlosParser.BibYearContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void exitBibYear(@NotNull BibPlosParser.BibYearContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull BibPlosParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull BibPlosParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull BibPlosParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull BibPlosParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#publishing}.
	 * @param ctx the parse tree
	 */
	void enterPublishing(@NotNull BibPlosParser.PublishingContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#publishing}.
	 * @param ctx the parse tree
	 */
	void exitPublishing(@NotNull BibPlosParser.PublishingContext ctx);
	/**
	 * Enter a parse tree produced by {@link BibPlosParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(@NotNull BibPlosParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BibPlosParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(@NotNull BibPlosParser.SimpleTextContext ctx);
}