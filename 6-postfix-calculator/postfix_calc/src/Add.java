import jdk.jfr.Description;

import java.util.Stack;

public class Add extends Operation {

    public Add() {
        super("+");
    }

    @Override //annotation
    public void run(Stack<Double> values) {
        values.add(values.pop() + values.pop());
    }
}

