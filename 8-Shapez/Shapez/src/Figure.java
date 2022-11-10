import java.util.ArrayList;

public class Figure {

    private ArrayList<Segment> segments;

    public Figure(){

    }
    public Figure(ArrayList<Segment> segments) {
        this.segments = segments;
    }
    public Figure(Figure other) {
        this.segments = (ArrayList<Segment>) other.segments.clone();
    }
    public ArrayList<Segment> getSegments() {
        return segments;
    }

    public void setSegments(ArrayList<Segment> segments) {
        this.segments = segments;
    }

    protected void rotateRight() {
        Segment temp = segments.get(3);
        segments.set(3, segments.get(1));
        segments.set(1, segments.get(0));
        segments.set(0, segments.get(2));
        segments.set(2, temp);
    }

    protected void rotateLeft() {
        Segment temp = segments.get(3);
        segments.set(3, segments.get(2));
        segments.set(2, segments.get(0));
        segments.set(0, segments.get(1));
        segments.set(1, temp);
    }

    public void print(){
        int count = 0;
        System.out.println("\n\n");
        for (int j = 0; j < 4; j++) {
            Segment s = segments.get(j);
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
}
