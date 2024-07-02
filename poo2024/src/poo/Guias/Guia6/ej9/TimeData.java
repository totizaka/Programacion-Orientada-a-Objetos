package poo.Guias.Guia6.ej9;

import java.util.Objects;

public class TimeData<T> implements Comparable<TimeData<T>>{
    private T elem;
    private int hours, minutes;

    public TimeData(T elem, int hours, int minutes){
        this.elem=elem;
        this.hours=hours;
        this.minutes=minutes;
    }
    public boolean equals(Object o){
        return o instanceof TimeData<?> timeData &&
                elem.equals(timeData.elem);
    }
    public T getElem(){
        return elem;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    @Override
    public int compareTo(TimeData<T> o){
        int cmp = Integer.compare(hours, o.hours);
        if(cmp==0){
            cmp = Integer.compare(minutes, o.minutes);
        }
        return cmp;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getElem());
    }
    public boolean between(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        return (hours > hoursFrom || hours == hoursFrom && minutes >= minutesFrom) &&
                (hours < hoursTo || hours == hoursTo && minutes <= minutesTo);
    }

}
