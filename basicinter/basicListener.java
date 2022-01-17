// Generated from basic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link basicParser}.
 */
public interface basicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link basicParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(basicParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(basicParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link basicParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(basicParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link basicParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(basicParser.IntExprContext ctx);
}