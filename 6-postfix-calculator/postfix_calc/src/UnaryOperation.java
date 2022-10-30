import java.util.Stack;

public abstract class UnaryOperation extends Operation{

    public UnaryOperation(String op) {
        super(op);
    }

    public abstract double run(double value);
    @Override
    public void run(Stack<Double> values) {
        values.add(run(values.pop()));
    }
}
