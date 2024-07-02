package poo.Guias.Guia4.ej3;

public class MovableTriangle extends Triangle implements Movable{
    public MovableTriangle(MovablePoint first, MovablePoint second, MovablePoint third){
        super(first,second,third);
    }

    @Override
    public void moveNorth(double delta){
        ((MovablePoint)first).moveNorth(delta);
        ((MovablePoint)second).moveNorth(delta);
        ((MovablePoint)third).moveNorth(delta);
    }
    @Override
    public void moveSouth(double delta){
        ((MovablePoint)first).moveSouth(delta);
        ((MovablePoint)second).moveSouth(delta);
        ((MovablePoint)third).moveSouth(delta);
    }
    @Override
    public void moveEast(double delta){
        ((MovablePoint)first).moveEast(delta);
        ((MovablePoint)second).moveEast(delta);
        ((MovablePoint)third).moveEast(delta);
    }
    @Override
    public void moveWest(double delta){
        ((MovablePoint)first).moveWest(delta);
        ((MovablePoint)second).moveWest(delta);
        ((MovablePoint)third).moveWest(delta);
    }
}
