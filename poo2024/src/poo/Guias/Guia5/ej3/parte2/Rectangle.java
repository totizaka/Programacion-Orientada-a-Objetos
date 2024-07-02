package poo.Guias.Guia5.ej3.parte2;
public class Rectangle<P extends Point> extends Figure {
    P topLeft;
    P bottomRight;

    public Rectangle(P topLeft, P bottomRight){
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
