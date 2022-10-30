public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Square s = new Square(0,0,5);
        Rectangle r = new Rectangle(0,0, 5,6);
        System.out.println(s.getS());
        System.out.println(r.getS());
    }
}