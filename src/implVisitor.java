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
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(implParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link implParser#latchdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(implParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(implParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(implParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(implParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(implParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link implParser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
}