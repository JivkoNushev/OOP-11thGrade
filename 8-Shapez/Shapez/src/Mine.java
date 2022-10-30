import java.util.ArrayList;

public class Mine implements Machine{

    private int[] segments;
    private String color;

    public int[] getSegments() {
        return segments;
    }

    public String getColor() {
        return color;
    }

    public Mine(int[] segments, String color) {
        this.segments = segments;
        this.color = color;
    }

    @Override
    public void print_work(Figure f)
    {
        ArrayList<Segment> segm = f.getSegments();
        System.out.println("\n\nMining...\n");
        int count = 0;
        for (int j = 0; j < 4; j++) {
            Segment s = segm.get(j);
            String c = color;

            if (s == null) {
                System.out.print(Color.WHITE);
                c = "";
                for (int k = 0; k < 6; k++) {
                    c += "/";
                }
            }
            else if(color.equalsIgnoreCase("RED")){
                System.out.print(Color.RED);
                c = " RED  ";
            }
            else if (color.equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
                c = "YELLOW";
            }
            else if (color.equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
                c = " BLUE ";
            }
            else if (color.equalsIgnoreCase("GREEN")) {
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
    public Figure pull() {

        ArrayList<Segment> segm = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            segm.add(null);
        }

        for (int s : segments) {
            segm.set(s-1, new Segment(color));
        }

        print_work(new Figure(segm));

        return new Figure(segm);
    }
}
