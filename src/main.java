import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        // we expect exactly one argument: the name of the input file


        /* open the input file */
        CharStream input = CharStreams.fromFileName("C:\\Users\\y62\\compiler_mandatory\\src\\comp.hw");
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        implLexer lex = new implLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        implParser parser = new implParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Command result=(Command)interpreter.visit(parseTree);
        System.out.println("The result is: " + result);
        result.eval(new Environment());
    }
}

class Interpreter extends AbstractParseTreeVisitor<AST> implements implVisitor<AST> {


    @Override
    public AST visitProgram(implParser.ProgramContext ctx) {
        return new Variable(ctx.x1.getText());
    }
    public AST visitVariable(implParser.VariableContext ctx){
        return new Variable(ctx.x1.getText());
    }

    @Override
    public AST visitLatch(implParser.LatchContext ctx) {
        return new Latch(ctx.x1.getText(), ctx.x2.getText());
    }

    @Override
    public AST visitUpdate(implParser.UpdateContext ctx) {
        return new Update((Expr) visit(ctx.e1), ctx.x1.getText());
    }

    @Override
    public AST visitNot(implParser.NotContext ctx) {
        return new Not((Condition) visit(ctx.e1));
    }

    @Override
    public AST visitAnd(implParser.AndContext ctx) {
        return new And((Condition) visit(ctx.e1), (Condition)visit(ctx.e2));
    }

    @Override
    public AST visitSimulate(implParser.SimulateContext ctx) {
        return new Simulate(ctx.x1.getText(), Integer.parseInt(ctx.c.getText()));
    }
}
