package expression;

public class VariableDec extends Expression {
    public String id;
    public String type;
    public int value;

    public void VariableDeclaration(String id, String type, int value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }
}
