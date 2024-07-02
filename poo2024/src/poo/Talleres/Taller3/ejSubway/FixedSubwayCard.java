package poo.Talleres.Taller3.ejSubway;

public class FixedSubwayCard extends SubwayCard{

    private int rides;

    public FixedSubwayCard(SubwayCentral sc, int rides){
        super(sc);
        this.rides = rides;
    }

    protected boolean canRide(){
        return this.rides > 0;
    }

    public void ride(){
        if (!canRide()){
            System.out.println("imprimo error");
            return;
        }
        this.rides--;
        System.out.println("viaja fixed");
    }
}
