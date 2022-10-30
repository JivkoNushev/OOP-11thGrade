public class Circle extends Shape_without_points{
    public double r;

    public Circle(double x, double y) {
        super(x, y);
        this.S = 6.28 * r;
        this.P = 3.14 * r;
        this.bounds = new Square(x,y, 2*r);
    }

}
