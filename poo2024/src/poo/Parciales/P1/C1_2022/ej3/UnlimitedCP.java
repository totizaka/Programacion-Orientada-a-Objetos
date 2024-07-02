package poo.Parciales.P1.C1_2022.ej3;

import java.time.LocalDate;
import java.time.LocalTime;

public class UnlimitedCP implements CityPass{
    private Attraction[] attractions;
    private String name;
    private LocalDate releaseDate;
    private int uses;

    public UnlimitedCP(Attraction[] attractions, String name, LocalDate releaseDate){
        this.attractions = attractions;
        this.name = name;
        this.releaseDate = releaseDate;
    }
    @Override
    public void visit(Attraction attraction, LocalDate localDate){
        if (!canVisit(attraction, localDate)){
            throw new CannotVisitAttractionException(attraction);
        }
        this.uses++;
        System.out.printf("%s visited %s", name, attraction);
    }
    @Override
    public Attraction[] getAttractions(){
        return attractions;
    }
    protected boolean canVisit(Attraction attraction, LocalDate localDate){
        return belongsIn (attraction) && localDate.isAfter(releaseDate);
    }
    public int getUses(){
        return uses;
    }
    @Override
    public String toString(){
        return "City pass for %s used for %d attractions".formatted(name, uses);
    }
}
