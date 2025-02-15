package poo.Guias.Guia5.ej3.parte2;

public class Ellipse<P extends Point> extends Figure {
    P centerPoint;
    double sMayorAxis, sMinorAxis;

    public Ellipse(P centerPoint, double sMayorAxis, double sMinorAxis){
        this.centerPoint = centerPoint;
        this.sMayorAxis = sMayorAxis;
        this.sMinorAxis = sMinorAxis;
    }

    @Override
    public double area() {
        return Math.PI / 4 * sMayorAxis * sMinorAxis;
    }

    @Override
    public double perimeter() {
        return Math.PI / 2 * (sMayorAxis + sMinorAxis);
    }

    @Override
    public String toString(){
        return "Elipse [Centro: %s Dmayor: %.2f Dmenor: %.2f ]".formatted(centerPoint, sMayorAxis, sMinorAxis);
    }
}
