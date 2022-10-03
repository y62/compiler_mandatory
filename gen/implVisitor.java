// Generated from C:/Users/y62/IdeaProjects/compiler_mandatory/src\impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchdec(implParser.LatchdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(implParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimInp(implParser.SimInpContext ctx);
}