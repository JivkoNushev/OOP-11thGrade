import java.util.ArrayList;
import java.util.Collections;

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
        for (int i = 3; i >= 0; i--) {
            Collections.swap(segments, i, (i-1 + 4)%4);
        }
    }

    public void rotateLeft() {
        for (int i = 0; i < 4; i++) {
            Collections.swap(segments, i, (i+1)%4);
        }
    }
}
