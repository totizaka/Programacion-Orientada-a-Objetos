package poo.Parciales.P1.C1_2023.ej2;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class VideoCatalogElement implements Comparable<VideoCatalogElement>{
    private final String title;
    private final LocalDate airedDate;

    public VideoCatalogElement(String title, LocalDate airedDate){
        this.airedDate=airedDate;
        this.title=title;
    }
    @Override
    public int compareTo(VideoCatalogElement o){
        int cmp = o.airedDate.compareTo(airedDate);
        if (cmp==0){
            cmp = o.title.compareTo(title);
        }
        return cmp;
    }
}
