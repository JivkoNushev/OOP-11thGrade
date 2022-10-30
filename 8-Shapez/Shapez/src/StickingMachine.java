import java.util.ArrayList;
import java.util.Queue;

public class StickingMachine extends ComplexMachine{

    private Queue<Figure> stickedFigures;

    @Override
    public void print_work(Figure f)
    {
        ArrayList<Segment> segm = f.getSegments();
        int count = 0;
        for(Segment s : segm)
        {
            if(s.getColor().equalsIgnoreCase("RED"))
                System.out.print(Color.RED);
            else if (s.getColor().equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
            }
            else if (s.getColor().equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
            }
            else if (s.getColor().equalsIgnoreCase("GREEN")) {
                System.out.print(Color.GREEN);
            }
            else{
                System.out.print(Color.WHITE);
            }

            System.out.print(s.getColor());

            System.out.print(Color.RESET);
            count++;

            if (count == 2) {
                System.out.println();
            }
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

    public Figure join(Figure f1, Figure f2)
    {
        print_work(f1);
        print_work(f2);
        System.out.println("Joining...");

        for (int i = 0; i < 4; i++) {
            if (f2.getSegments().get(i).getColor() == null) {
                f2.getSegments().set(i, f1.getSegments().get(i));
            }
        }
        print_work(f2);

        return f2;
    }

}
