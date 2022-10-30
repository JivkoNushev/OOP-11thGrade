public abstract class Shape_with_points extends Shape_without_points {

    public Shape_with_points(double x, double y) {
        super(x, y);
    }

    public abstract Point[] getPoints();
}
