// Generated from C:/Users/y62/IdeaProjects/compiler_mandatory/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 */
	void enterLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 */
	void exitLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(implParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(implParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimInp(implParser.SimInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimInp(implParser.SimInpContext ctx);
}