import java.util.ArrayList;

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

    @Override
    public String toString() {
        return code;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Color.RED + "Hello world!" + Color.RESET);

        Mine redM = new Mine(new int[]{1,2}, "RED");
        Mine yellowM = new Mine(new int[]{3,4}, "YELLOW");

        StickingMachine stickM = new StickingMachine();
        SplitMachine splitHor = new SplitMachine(true);
        SplitMachine splitVer = new SplitMachine(false);

        ArrayList<Figure> f = new ArrayList<>();
        f.add(redM.pull());
        f.add(yellowM.pull());

        Figure first = f.remove(f.size()-1), second = f.remove(f.size()-1);

        Figure a = stickM.join(first, second);

        f.add(a);

        splitVer.push(a);

        f.add(splitVer.pull());
        f.add(splitVer.pull());

    }
}