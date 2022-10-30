enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    WHITE("\033[0;37m"),
    BLUE("\033[0;34m");     // BLUE
    private String code;
    Color(String code) {
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Color.RED + "Hello world!" + Color.RESET);
    }
}