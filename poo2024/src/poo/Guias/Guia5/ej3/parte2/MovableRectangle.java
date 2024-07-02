package poo.Guias.Guia5.ej3.parte2;

public class MovableRectangle extends Rectangle<MovablePoint> implements Movable {
    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight){
        super(topLeft, bottomRight);
    }
    @Override
    public void moveNorth(double delta){
        (topLeft).moveNorth(delta);
        (bottomRight).moveNorth(delta);
    }
    @Override
    public void moveSouth(double delta){
        (topLeft).moveSouth(delta);
        (bottomRight).moveSouth(delta);
    }
    @Override
    public void moveEast(double delta){
        (topLeft).moveEast(delta);
        (bottomRight).moveEast(delta);
    }
    @Override
    public void moveWest(double delta){
        (topLeft).moveWest(delta);
        (bottomRight).moveWest(delta);
    }
}
