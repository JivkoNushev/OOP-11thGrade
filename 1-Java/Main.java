class Main {

  public static void main(String[] args) {
    System.out.println("Hello");

    int a = 1;
    double b = 12;
    long c = 13;
    char d = 'd';
    boolean e = false;

    for (int i = 0; i < 10; i++) {
      System.out.println("i = " + i);
    }

    Main m = new Main();
    m.foo();
    Test t = new Test();
    t.foo();
  }

  public Main() {
    var1 = 10;
  }

  private void foo() {
    System.out.println("Main.foo");
  }

  private int var1 = 5;
}
