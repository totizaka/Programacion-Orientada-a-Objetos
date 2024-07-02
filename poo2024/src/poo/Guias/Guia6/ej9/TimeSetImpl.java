package poo.Guias.Guia6.ej9;

import java.util.*;

public class TimeSetImpl<T> implements TimeSet<T>{

    private Set<TimeData<T>> horarios = new TreeSet<>();

    @Override
    public void add(T elem, int hours, int minutes) {
        TimeData<T> timeData = new TimeData<>(elem, hours, minutes);
        remove(timeData.getElem());
        horarios.add(timeData);
    }

    @Override
    public void remove(T elem) {
        Iterator<TimeData<T>> iterator = horarios.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getElem().equals(elem)){
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public int size() {
        return horarios.size();
    }

    @Override
    public boolean contains(T elem) {
        for(TimeData<T> t : horarios){
            if (t.getElem().equals(elem)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> toReturn = new HashSet<>();
        for (TimeData<T> timeData : horarios){
            if(timeData.getHours()>hoursTo){
                break;
            }
            if (timeData.between(hoursFrom, minutesFrom, hoursTo, minutesTo)){
                toReturn.add(timeData.getElem());
            }
        }
        return toReturn;
    }
}
