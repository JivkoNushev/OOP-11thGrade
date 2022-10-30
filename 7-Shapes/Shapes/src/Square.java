public class Square extends Shape_with_points {
    private double a;

    public Square(double x, double y, double a) {
        super(x, y);
        this.S = a*a;
        this.P = 4*a;
        this.bounds = this;
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{new Point(   this.x-a/2, this.y - a/2), new Point(this.x + a/2, a - a/2), new Point(this.x+a/2, this.y - a/2), new Point(this.x-a/2, this.y-a/2)};
    }
}
