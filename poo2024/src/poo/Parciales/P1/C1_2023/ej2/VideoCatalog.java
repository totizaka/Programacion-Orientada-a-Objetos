package poo.Parciales.P1.C1_2023.ej2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class VideoCatalog {
    private static final int INITIAL_DIM=5;
    private VideoCatalogElement[] videoCatalogElements = new VideoCatalogElement[INITIAL_DIM];
    private int dim;
    private void addElement(VideoCatalogElement element){
        if (videoCatalogElements.length == dim){
            resize();
        }
        videoCatalogElements[dim++] = element;
    }
    public void add(String name, LocalDate date, int season){
        addElement(new TVEpisode(name, date, season));
    }
    public void add(String name, LocalDate date, String studio){
        addElement(new Movie(name, date, studio));
    }
    private void resize(){
        videoCatalogElements = Arrays.copyOf(videoCatalogElements, videoCatalogElements.length + INITIAL_DIM);
    }
    private VideoCatalogElement[] getCustomCopy(Comparator<VideoCatalogElement> cmp) {
        VideoCatalogElement[] copy = Arrays.copyOf(videoCatalogElements, dim);
        Arrays.sort(copy, cmp);
        return copy;
    }
    public VideoCatalogElement[] getDescendingDateCopy() {
        return getCustomCopy(Comparator.naturalOrder());
    }
    public VideoCatalogElement[] getChronologicalDateCopy() {
        return getCustomCopy(Comparator.reverseOrder());
    }
}
