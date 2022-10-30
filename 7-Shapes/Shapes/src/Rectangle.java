public class Rectangle extends Shape_with_points{
    public double a, b;

    public Rectangle(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;

        this.S = a*b;
        this.P = 2*(a+b);
        this.bounds = new Square(x,y,Math.max(a,b));
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{new Point(   this.x-a/2, this.y - b/2), new Point(this.x + a/2, a - b/2), new Point(this.x+a/2, this.y - b/2), new Point(this.x-a/2, this.y-b/2)};
    }
}
