public abstract class AST {

}

abstract class Command extends AST{
    abstract public void eval(Environment env);
}
class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1,Command c2){this.c1=c1; this.c2=c2;}
    public void eval(Environment env){
        c1.eval(env);
        c2.eval(env);
    }
}

abstract class Expr extends AST{
    abstract public Integer eval(Environment env);
}

abstract class Condition extends AST {
    abstract public Boolean eval(Environment env);
}

class Variable extends Expr{
    public String varname;

    Variable(String varname) {
        this.varname = varname;
    }

    public Integer eval(Environment env) {
        return env.getVariable(varname);
    }
}

class Latch extends Expr {
        String id1, id2;

        public Latch(String id1, String id2) {
            this.id1 = id1;
            this.id2 = id2;
        }
        public Integer eval(Environment env) {
            return env.getVariable(id1 + " -> " + id2);
        }
    }


class Program extends AST{

    public Program() {
    }

}



class Simulate extends Expr {
    String signalName;
    Integer i;
    Simulate(String arrayName, Integer index) {
        this.signalName = arrayName;
        this.i = index;
    }
    public Integer eval(Environment env) {
        return env.getVariable(signalName + " = " +  i );
    }
}


class Update extends Expr {
    Expr e1;
    String id;

    Update(Expr e1, String id) {
        this.e1 = e1;
        this.id = id;
    }

    public Integer eval(Environment env) {
        return env.getVariable(id) + '=' + e1.eval(env);
    }
}

class And extends Condition {
    Condition e1, e2;

    And(Condition e1, Condition e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Boolean eval(Environment env) {
        return e1.eval(env) && e2.eval(env);
    }
}

class Not extends Condition {
    Condition e1;

    Not(Condition e1) {
        this.e1 = e1;
    }

    public Boolean eval(Environment env) {
        return !(e1.eval(env));
    }
}

class NOP extends Command{
    NOP(){}
    public void eval(Environment env){};
}




