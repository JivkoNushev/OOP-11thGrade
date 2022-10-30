import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) { // psvm + TAB
        System.out.println("Hello world!"); // sout + TAB
        (new Test()).foo().bar();
        Test.baz();
        new Test.InnerClass();
//        Stream.of(1,2,3).map(v -> v + 1).count();

    }

}

