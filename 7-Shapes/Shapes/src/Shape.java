public abstract class Shape extends Point{

    protected double P, S;
    protected Square bounds;

    public double getP() {
        return P;
    }

    public double getS() {
        return S;
    }

    public Square getBounds() {
        return bounds;
    }
    public Shape(double x, double y) {
        super(x, y);
    }
}
