import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    WHITE("\033[0;37m"),
    BLUE("\033[0;34m");     // BLUE
    private final String code;
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
        StickingMachine stickM1 = new StickingMachine();
        SplitMachine splitHor1 = new SplitMachine(true);
        SplitMachine splitVer1 = new SplitMachine(false);
        RotateMachine rotateRight1 = new RotateMachine(true );
        RotateMachine rotateLeft1 = new RotateMachine(false );

        ArrayList<Figure> f = new ArrayList<>();
        f.add(redM.pull());
        f.add(yellowM.pull());

        Figure first = f.remove(f.size()-1), second = f.remove(0);

        stickM1.push(first);
        stickM1.push(second);

        Figure a = stickM1.pull();

        f.add(a);

        splitHor1.push(a);

        f.add(splitHor1.pull());
        f.add(splitHor1.pull());

        splitVer1.push(f.remove(f.size()-1));

        f.add(splitVer1.pull());

        Figure third = f.remove(f.size()-1), fourth = f.remove(f.size()-1);
        rotateRight1.push(third);
        rotateLeft1.push(fourth);

        f.add(rotateRight1.pull());
        f.add(rotateLeft1.pull());

        System.out.println("\n\nNEXT DEMONSTRATION\n\n");
        f.clear();

        boolean run = true;
        while(run) {
            System.out.println("\n\nMake figure(1,2,3,4):");
            System.out.println("Exit(0):\n");
            Scanner sc = new Scanner(System.in);
            String i = sc.next();
            int Int = Integer.parseInt(i);


            Figure temp;
            switch (Int) {
                case 0:
                    run = false;
                    System.out.println("Exited");
                    break;
                case 1:
                    System.out.println("\n\nFIRST_FIGURE:");
                    temp = firstFigureMachine();
                    temp.print();
                    f.add(temp);
                    break;
                case 2:
                    System.out.println("\n\nSECOND_FIGURE:");
                    temp = secondFigureMachine();
                    temp.print();
                    f.add(temp);
                    break;
                case 3:
                    System.out.println("\n\nTHIRD_FIGURE:");
                    temp = thirdFigureMachine();
                    temp.print();
                    f.add(temp);
                    break;
                case 4:
                    System.out.println("\n\nFOURTH_FIGURE:");
                    temp = fourthFigureMachine();
                    temp.print();
                    f.add(temp);
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }
    public static Figure firstFigureMachine() throws Exception {
        StickingMachine stickM = new StickingMachine();
        RotateMachine rotateLeft = new RotateMachine(false );

        Mine yellowMine = new Mine(new int[]{4}, "YELLOW");
        Mine greenMine = new Mine(new int[]{1,2,3}, "GREEN");
        Mine blueMine = new Mine(new int[]{2,4}, "BLUE");

        Figure Figure1;

        Figure GreenFigure1 = greenMine.pull();
        rotateLeft.push(GreenFigure1);
        rotateLeft.push(rotateLeft.pull());
        GreenFigure1 = rotateLeft.pull();

        Figure blueFigure1 = blueMine.pull(), blueFigure2 = blueMine.pull();
        rotateLeft.push(blueFigure1);
        rotateLeft.push(rotateLeft.pull());
        blueFigure1 = rotateLeft.pull();
        rotateLeft.push(blueFigure2);
        blueFigure2 = rotateLeft.pull();

        stickM.push(GreenFigure1);
        stickM.push(blueFigure1);
        Figure1 = stickM.pull();
        stickM.push(Figure1);
        stickM.push(blueFigure2);
        Figure1 = stickM.pull();

        Figure yellowFigure = yellowMine.pull();
        rotateLeft.push(yellowFigure);
        rotateLeft.push(rotateLeft.pull());
        yellowFigure = rotateLeft.pull();

        stickM.push(Figure1);
        stickM.push(yellowFigure);
        Figure1 = stickM.pull();

        return Figure1;
    }
    public static Figure secondFigureMachine() throws Exception {
        StickingMachine stickM = new StickingMachine();
        RotateMachine rotateLeft = new RotateMachine(false );

        Mine redMine = new Mine(new int[]{2,3}, "RED");
        Mine yellowMine = new Mine(new int[]{4}, "YELLOW");

        Figure figure;

        Figure RedFigure1 = redMine.pull(), RedFigure2 = redMine.pull();
        rotateLeft.push(RedFigure2);
        RedFigure2 = rotateLeft.pull();
        stickM.push(RedFigure1);
        stickM.push(RedFigure2);
        figure = stickM.pull();

        Figure YellowFigure1 = yellowMine.pull(), YellowFigure2 = yellowMine.pull();
        rotateLeft.push(YellowFigure2);
        YellowFigure2 = rotateLeft.pull();
        stickM.push(YellowFigure1);
        stickM.push(YellowFigure2);
        YellowFigure1 = stickM.pull();

        stickM.push(figure);
        stickM.push(YellowFigure1);
        figure = stickM.pull();

        return figure;
    }
    public static Figure thirdFigureMachine() throws Exception {
        StickingMachine stickM = new StickingMachine();
        RotateMachine rotateRight = new RotateMachine(true );

        Mine redMine = new Mine(new int[]{2,3}, "RED");
        Mine yellowMine = new Mine(new int[]{4}, "YELLOW");
        Mine greenMine = new Mine(new int[]{1,2,3}, "GREEN");
        Mine blueMine = new Mine(new int[]{2,4}, "BLUE");

        Figure figure;

        Figure greenFigure = greenMine.pull(), redFigure = redMine.pull(), blueFigure = blueMine.pull(), yellowFigure = yellowMine.pull();
        rotateRight.push(blueFigure);
        blueFigure = rotateRight.pull();

        stickM.push(greenFigure);
        stickM.push(redFigure);
        figure = stickM.pull();

        stickM.push(figure);
        stickM.push(blueFigure);
        figure = stickM.pull();

        stickM.push(figure);
        stickM.push(yellowFigure);
        figure = stickM.pull();

        return figure;
    }
    public static Figure fourthFigureMachine() throws Exception {
        StickingMachine stickM = new StickingMachine();
        RotateMachine rotateRight = new RotateMachine(true );
        RotateMachine rotateLeft = new RotateMachine(false );

        Mine redMine = new Mine(new int[]{2,3}, "RED");
        Mine yellowMine = new Mine(new int[]{4}, "YELLOW");
        Mine greenMine = new Mine(new int[]{1,2,3}, "GREEN");

        Figure figure;

        Figure greenFigure = greenMine.pull(), redFigure = redMine.pull(), yellowFigure = yellowMine.pull();

        rotateRight.push(redFigure);
        redFigure = rotateRight.pull();

        rotateLeft.push(yellowFigure);
        rotateLeft.push(rotateLeft.pull());
        yellowFigure = rotateLeft.pull();

        stickM.push(redFigure);
        stickM.push(greenFigure);
        figure = stickM.pull();

        stickM.push(figure);
        stickM.push(yellowFigure);
        figure = stickM.pull();

        return figure;
    }
}