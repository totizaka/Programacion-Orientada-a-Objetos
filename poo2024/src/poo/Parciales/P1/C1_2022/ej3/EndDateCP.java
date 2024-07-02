package poo.Parciales.P1.C1_2022.ej3;

import java.time.LocalDate;

public class EndDateCP extends UnlimitedCP{
    private LocalDate expireDay;
    public EndDateCP(Attraction[] attractions, String name, LocalDate releaseDate, LocalDate expireDay){
        super(attractions, name, releaseDate);
        this.expireDay=expireDay;
    }
    @Override
    protected boolean canVisit(Attraction attraction, LocalDate localDate){
        return (expireDay.isBefore(localDate)) && super.canVisit(attraction, localDate);
    }
}
