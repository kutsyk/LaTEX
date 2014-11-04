// Generated from ISOENT.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ISOENTParser}.
 */
public interface ISOENTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ISOENTParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void enterIsoEnt(@NotNull ISOENTParser.IsoEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ISOENTParser#isoEnt}.
	 * @param ctx the parse tree
	 */
	void exitIsoEnt(@NotNull ISOENTParser.IsoEntContext ctx);
}