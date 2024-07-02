package poo.Guias.Guia4.ej3;

public class MovableRectangle extends Rectangle implements Movable{
    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight){
        super(topLeft, bottomRight);
    }
    @Override
    public void moveNorth(double delta){
        ((MovablePoint)topLeft).moveNorth(delta);
        ((MovablePoint)bottomRight).moveNorth(delta);
    }
    @Override
    public void moveSouth(double delta){
        ((MovablePoint)topLeft).moveSouth(delta);
        ((MovablePoint)bottomRight).moveSouth(delta);
    }
    @Override
    public void moveEast(double delta){
        ((MovablePoint)topLeft).moveEast(delta);
        ((MovablePoint)bottomRight).moveEast(delta);
    }
    @Override
    public void moveWest(double delta){
        ((MovablePoint)topLeft).moveWest(delta);
        ((MovablePoint)bottomRight).moveWest(delta);
    }
}
