public class Test {
    public static int counter = 0;
    public static void baz(){
        System.out.println("Test.baz");
    }
    private int var2;

    public int getVar2() {
        return var2;
    }

    public Test(int var2) {
        this.var2 = var2;
    }

    public Test(){
        counter++;
    }

    public Test foo() {
        System.out.println("Test.foo");
        return this;
    }

    public void bar() {
        System.out.println("Test.bar");
    }

    public static class InnerClass{

        public InnerClass(){
            System.out.println("inner");
        }
    }

    private class InnerClass2{

        public InnerClass2(){
            System.out.println("inner2");
        }
    }
}