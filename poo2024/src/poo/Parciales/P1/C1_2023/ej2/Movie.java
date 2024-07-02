package poo.Parciales.P1.C1_2023.ej2;
import java.time.LocalDate;
public class Movie extends VideoCatalogElement{
    private final String studio;
    public Movie(String title, LocalDate airedDate, String studio) {
        super(title,airedDate);
        this.studio = studio;
    }
}
