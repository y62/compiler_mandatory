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

