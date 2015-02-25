// Generated from D:/Charlesworth/LaTEX/src/com/kutsyk/grammar/BibTEX\plosBIB.g4 by ANTLR 4.5
package com.kutsyk.grammar.BibTEX;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link plosBIBParser}.
 */
public interface plosBIBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull plosBIBParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull plosBIBParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void enterAcknowledgment(@NotNull plosBIBParser.AcknowledgmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#acknowledgment}.
	 * @param ctx the parse tree
	 */
	void exitAcknowledgment(@NotNull plosBIBParser.AcknowledgmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#refs}.
	 * @param ctx the parse tree
	 */
	void enterRefs(@NotNull plosBIBParser.RefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#refs}.
	 * @param ctx the parse tree
	 */
	void exitRefs(@NotNull plosBIBParser.RefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void enterBibItem(@NotNull plosBIBParser.BibItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#bibItem}.
	 * @param ctx the parse tree
	 */
	void exitBibItem(@NotNull plosBIBParser.BibItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#authorList}.
	 * @param ctx the parse tree
	 */
	void enterAuthorList(@NotNull plosBIBParser.AuthorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#authorList}.
	 * @param ctx the parse tree
	 */
	void exitAuthorList(@NotNull plosBIBParser.AuthorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#author}.
	 * @param ctx the parse tree
	 */
	void enterAuthor(@NotNull plosBIBParser.AuthorContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#author}.
	 * @param ctx the parse tree
	 */
	void exitAuthor(@NotNull plosBIBParser.AuthorContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void enterBibLabel(@NotNull plosBIBParser.BibLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#bibLabel}.
	 * @param ctx the parse tree
	 */
	void exitBibLabel(@NotNull plosBIBParser.BibLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void enterBibYear(@NotNull plosBIBParser.BibYearContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#bibYear}.
	 * @param ctx the parse tree
	 */
	void exitBibYear(@NotNull plosBIBParser.BibYearContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull plosBIBParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull plosBIBParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull plosBIBParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull plosBIBParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link plosBIBParser#publishing}.
	 * @param ctx the parse tree
	 */
	void enterPublishing(@NotNull plosBIBParser.PublishingContext ctx);
	/**
	 * Exit a parse tree produced by {@link plosBIBParser#publishing}.
	 * @param ctx the parse tree
	 */
	void exitPublishing(@NotNull plosBIBParser.PublishingContext ctx);
}