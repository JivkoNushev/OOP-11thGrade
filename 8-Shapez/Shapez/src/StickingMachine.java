import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StickingMachine extends ComplexMachine{

    private final Queue<Figure> stickedFigures;

    public StickingMachine() {
        this.stickedFigures = new LinkedList<Figure>();
    }
    @Override
    public void print_work(Figure f)
    {
        ArrayList<Segment> segm = f.getSegments();
        System.out.println("\n\nJoining...\n");
        int count = 0;
        for (int j = 0; j < 4; j++) {
            Segment s = segm.get(j);
            String c = "";

            if (s == null) {
                System.out.print(Color.WHITE);
                c = "";
                for (int k = 0; k < 6; k++) {
                    c += "/";
                }
            }
            else if(s.color.equalsIgnoreCase("RED")){
                System.out.print(Color.RED);
                c = " RED  ";
            }
            else if (s.color.equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
                c = "YELLOW";
            }
            else if (s.color.equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
                c = " BLUE ";
            }
            else if (s.color.equalsIgnoreCase("GREEN")) {
                System.out.print(Color.GREEN);
                c = "GREEN ";
            }
            System.out.print("|" + c + "|");
            count++;

            if (count == 2) {
                System.out.println();
            }
            System.out.print(Color.RESET);
        }
    }

    @Override
    public void push(Figure figure) throws Exception {
        if (0 == figures.size()) {
            if(!figures.add(figure))
                throw new Exception("Couldn't add figure to SplitMachine");
        } else {
            Figure new_figure = join(figures.remove(), figure);
            if(!stickedFigures.add(new_figure))
                throw new Exception("Couldn't add figure to StickingMachine");
        }
    }

    @Override
    public Figure pull() {
        return stickedFigures.remove();
    }

    private Figure join(Figure f1, Figure f2)
    {
        print_work(f1);
        print_work(f2);

        for (int i = 0; i < 4; i++) {
            if (f2.getSegments().get(i) == null) {
                f2.getSegments().set(i, f1.getSegments().get(i));
            }
        }

        print_work(f2);

        return f2;
    }

}
