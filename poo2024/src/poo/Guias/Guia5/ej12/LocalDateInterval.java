package poo.Guias.Guia5.ej12;
import java.time.LocalDate;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LocalDateInterval implements Iterable<LocalDate>{

    private final LocalDate today;
    private final LocalDate todayPlus10;
    private final int step;

    public LocalDateInterval(LocalDate today, LocalDate todayPlus10, int step){
        this.today=today;
        this.todayPlus10=todayPlus10;
        this.step=step;
    }

    @Override
    public Iterator<LocalDate> iterator() {
        return new DateIterator();
    }
    private class DateIterator implements Iterator<LocalDate>{
        private LocalDate currentDay = today;
        @Override
        public boolean hasNext() {
            return !currentDay.isAfter(todayPlus10);
        }

        @Override
        public LocalDate next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            LocalDate dateToReturn = currentDay;
            currentDay = currentDay.plusDays(step);
            return dateToReturn;
        }
    }
}
