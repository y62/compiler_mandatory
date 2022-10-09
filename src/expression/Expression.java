package expression;

import java.util.ArrayList;
import java.util.List;

public abstract class Expression {

}

class Latch {
    String id;

    public Latch(String id) {
        this.id =  id;
    }

    @Override
    public String toString() {
        return id;
    }
}

class Program {
    public List<Expression> expressions;

    public Program() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e) {
        expressions.add(e);
    }

}

class Simulate {
}

class Update {
}

class Variable extends Expression {
    String id;

    public Variable(String id) {
        this.id =  id;
    }

    @Override
    public String toString() {
        return id;
    }
}

class VariableDec extends Expression {
    public String id;
    public String type;
    public int value;

    public void VariableDeclaration(String id, String type, int value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }
}

