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
        System.out.println("\n\nSplitting...\n");
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

        System.out.println("\n\nSplitting " + split + "...");

        print_work(f);

        print_work(first_f);
        print_work(second_f);

        return new Figure[]{first_f, second_f};
    }

//    public Figure[] pull() {
//        return new Figure[] {this.pull(), this.pull()}
//    }

}
