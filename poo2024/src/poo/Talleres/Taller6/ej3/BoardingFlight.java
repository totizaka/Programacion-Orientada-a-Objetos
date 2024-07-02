package poo.Talleres.Taller6.ej3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BoardingFlight {
    private Set<Passenger> passengerSet;

    public BoardingFlight(Comparator<Passenger> cmp){
        passengerSet = new TreeSet<>(cmp);
    }
    public void addForBoarding(String nombre, int row, PassengerCategory category){
        passengerSet.add(new Passenger(nombre,row,category));
    }
    public Iterator<String> boardingCallIterator(){
        Iterator<Passenger> it = passengerSet.iterator();
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return it.hasNext();
            }
            @Override
            public String next() {
                return it.next().getName();
            }
        };
    }
}
