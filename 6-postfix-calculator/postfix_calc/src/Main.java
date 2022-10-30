import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.addOp(new Add());
        calc.addOp(new Sub());
        calc.addOp(new Mult());

        System.out.println(calc.run("2 3 4 + *"));
    }
}