package poo.Guias.Guia5.ej3.parte2;

public class Circle<P extends Point> extends Ellipse<P> {

    public Circle(P centerPoint, double radius){
        super(centerPoint, 2*radius, 2*radius);
    }

    @Override
    public String toString(){
        return "Circulo [Centro: %s Radio: %.2f ]".formatted(centerPoint, sMayorAxis/2);
    }
}
