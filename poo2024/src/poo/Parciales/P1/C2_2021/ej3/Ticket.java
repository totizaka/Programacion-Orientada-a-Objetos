package poo.Parciales.P1.C2_2021.ej3;

public class Ticket {
    private int id;
    private int ridesLeft;
    private boolean isVisitor;
    public Ticket(int id, int maxRides, boolean isVisitor){
        this.id=id;
        this.ridesLeft=maxRides;
        this.isVisitor=isVisitor;
    }
    public int getRidesLeft(){
        return ridesLeft;
    }
    public boolean canRide(){
        return ridesLeft>0;
    }
    public void useRide(){
        this.ridesLeft--;
    }
    public boolean isVisitor(){
        return isVisitor;
    }
    @Override
    public String toString(){
        return "Ski Ticket %d has %d rides left".formatted(id, ridesLeft);
    }
}
