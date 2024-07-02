package poo.Guias.Guia3.ej9;

public class Rectangle extends Figure{
    Point topLeft;
    Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight){
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    public double base(){
        return bottomRight.getX() - topLeft.getX();
    }

    public double height(){
        return bottomRight.getY() - topLeft.getY();
    }
    @Override
    public double perimeter(){
        return (base()*2 + height()*2);
    }

    @Override
    public double area(){
        return (base()*height());
    }

    @Override
    public String toString(){
        return "Rectangulo [ %s , %s ]".formatted(topLeft, bottomRight);
    }
}
