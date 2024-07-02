package poo.Guias.Guia4.ej3;

public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point otherPoint){
        return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
    }

    @Override
    public String toString() {
        return "{%.2f , %.2f}".formatted(x, y);
    }
}
