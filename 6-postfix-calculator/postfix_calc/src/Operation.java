import java.util.Stack;

public abstract class Operation implements IOperation{
    public String op;

    public Operation(String op) {
        this.op = op;
    }

}