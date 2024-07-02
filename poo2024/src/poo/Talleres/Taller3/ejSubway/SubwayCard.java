package poo.Talleres.Taller3.ejSubway;

public abstract class SubwayCard {

    private SubwayCentral subwayCentral;

    public SubwayCard(SubwayCentral sc){
        this.subwayCentral = sc;
    }

    public double getRideCost(){
        return subwayCentral.getRideCost();
    }

    protected abstract boolean canRide();

    public abstract void ride();
}
