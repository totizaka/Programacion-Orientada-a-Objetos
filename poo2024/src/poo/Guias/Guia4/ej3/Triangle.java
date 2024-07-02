package poo.Guias.Guia4.ej3;

public class Triangle extends Figure {
    Point first, second, third;

    public Triangle(Point first, Point second, Point third){
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
