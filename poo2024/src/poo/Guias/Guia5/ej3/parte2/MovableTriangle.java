package poo.Guias.Guia5.ej3.parte2;

public class MovableTriangle extends Triangle<MovablePoint> implements Movable {
    public MovableTriangle(MovablePoint first, MovablePoint second, MovablePoint third){
        super(first,second,third);
    }

    @Override
    public void moveNorth(double delta){
        (first).moveNorth(delta);
        (second).moveNorth(delta);
        (third).moveNorth(delta);
    }
    @Override
    public void moveSouth(double delta){
        (first).moveSouth(delta);
        (second).moveSouth(delta);
        (third).moveSouth(delta);
    }
    @Override
    public void moveEast(double delta){
        (first).moveEast(delta);
        (second).moveEast(delta);
        (third).moveEast(delta);
    }
    @Override
    public void moveWest(double delta){
        (first).moveWest(delta);
        (second).moveWest(delta);
        (third).moveWest(delta);
    }
}
