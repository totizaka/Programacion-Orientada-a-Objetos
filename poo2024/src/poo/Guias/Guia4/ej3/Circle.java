package poo.Guias.Guia4.ej3;

public class Circle extends Ellipse {

    public Circle(Point centerPoint, double radius){
        super(centerPoint, 2*radius, 2*radius);
    }

    @Override
    public String toString(){
        return "Circulo [Centro: %s Radio: %.2f ]".formatted(centerPoint, sMayorAxis/2);
    }
}
