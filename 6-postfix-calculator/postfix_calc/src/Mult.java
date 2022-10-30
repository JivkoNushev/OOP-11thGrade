import java.util.Stack;

public class Mult extends Operation{
    public Mult() {
        super("*");
    }

    @Override
    public void run(Stack<Double> values) {
        values.add(values.pop() * values.pop());
    }
}
