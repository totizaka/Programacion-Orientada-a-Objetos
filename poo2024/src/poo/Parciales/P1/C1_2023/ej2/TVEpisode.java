package poo.Parciales.P1.C1_2023.ej2;

import java.time.LocalDate;
public class TVEpisode extends VideoCatalogElement{
    private final int season;
    public TVEpisode(String title, LocalDate airedDate, int season) {
        super(title, airedDate);
        this.season = season;
    }
}
