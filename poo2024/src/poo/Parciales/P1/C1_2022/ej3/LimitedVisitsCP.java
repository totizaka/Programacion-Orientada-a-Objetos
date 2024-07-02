package poo.Parciales.P1.C1_2022.ej3;

import java.time.LocalDate;

public class LimitedVisitsCP extends UnlimitedCP{
    private final int maxUses;
    public LimitedVisitsCP(Attraction[] attractions, String name, LocalDate releaseDate, int maxUses){
        super(attractions,name,releaseDate);
        this.maxUses=maxUses;
    }
    @Override
    protected boolean canVisit(Attraction attraction, LocalDate localDate){
        return (getUses()<maxUses) && super.canVisit(attraction, localDate);
    }
}
