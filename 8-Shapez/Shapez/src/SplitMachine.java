import java.util.ArrayList;

public class SplitMachine extends ComplexMachine{

    private boolean isSplittingHorizontal = false;

    public SplitMachine(boolean isSplittingHorizontal) {
        this.isSplittingHorizontal = isSplittingHorizontal;
    }

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
        Figure[] figs = split_figure(figure);

        if(!figures.add(figs[0]))
            throw new Exception("Couldn't add figure to SplitMachine");
        if(!figures.add(figs[1]))
            throw new Exception("Couldn't add figure to SplitMachine");
    }

    @Override
    public Figure pull() {
        return figures.remove();
    }

    private Figure[] split_figure(Figure f)
    {
        Figure first_f = new Figure(f);
        Figure second_f = new Figure(f);

        String split;
        if (isSplittingHorizontal) {
            split = "Horizontal";

            first_f.getSegments().set(2, null);
            first_f.getSegments().set(3, null);

            second_f.getSegments().set(0, null);
            second_f.getSegments().set(1, null);
        }
        else{
            split = "Vertical";

            first_f.getSegments().set(1, null);
            first_f.getSegments().set(2, null);

            second_f.getSegments().set(0, null);
            second_f.getSegments().set(3, null);
        }

        print_work(f);
        System.out.println("Splitting " + split + "...");

        print_work(first_f);
        print_work(second_f);

        return new Figure[]{first_f, second_f};
    }

//    public Figure[] pull() {
//        return new Figure[] {this.pull(), this.pull()}
//    }

}
