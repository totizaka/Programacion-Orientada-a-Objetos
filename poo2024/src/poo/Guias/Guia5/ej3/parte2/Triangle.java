package poo.Guias.Guia5.ej3.parte2;

public class Triangle<P extends Point> extends Figure {
    P first, second, third;

    public Triangle(P first, P second, P third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    @Override
    public double perimeter(){
        return (first.distanceTo(second) + second.distanceTo(third) + third.distanceTo(first));
    }

    @Override
    public double area(){
        double semiPerimeter = perimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - first.distanceTo(second))
                * (semiPerimeter - second.distanceTo(third)) * (semiPerimeter - third.distanceTo(first)));
    }

    @Override
    public String toString(){
        return "Triangulo [ %s , %s , %s ]".formatted(first, second, third);
    }
}
