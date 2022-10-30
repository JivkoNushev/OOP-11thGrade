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
        System.out.println("Mining...");
        int count = 0;
        for(Segment s : segm)
        {
            if(color.equalsIgnoreCase("RED"))
                System.out.print(Color.RED);
            else if (color.equalsIgnoreCase("YELLOW")) {
                System.out.print(Color.YELLOW);
            }
            else if (color.equalsIgnoreCase("BLUE")) {
                System.out.print(Color.BLUE);
            }
            else if (color.equalsIgnoreCase("GREEN")) {
                System.out.print(Color.GREEN);
            }
            else{
                System.out.print(Color.WHITE);
            }

            System.out.print(color);

            System.out.print(Color.RESET);
            count++;

            if (count == 2) {
                System.out.println();
            }
        }
    }


    @Override
    public Figure pull() {

        ArrayList<Segment> segm = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            segm.add(null);
        }

        for (int s : segments) {
            segm.get(s - 1).setColor(color);
        }

        print_work(new Figure(segm));

        return new Figure(segm);
    }
}
