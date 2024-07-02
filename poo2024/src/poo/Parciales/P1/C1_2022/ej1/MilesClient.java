package poo.Parciales.P1.C1_2022.ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MilesClient implements Iterable<String>{
    private final String name;
    private final int amountMonths;
    private final Plan plan;

    public MilesClient(String name, int amountMonths, Plan plan){
        this.name=name;
        this.amountMonths=amountMonths;
        this.plan=plan;
    }

    public Iterator<String> iterator(){
        return new IteratorMilesClient();
    }
    private class IteratorMilesClient implements Iterator<String>{
        private int currentMonth=1;

        public boolean hasNext(){
            return currentMonth<=amountMonths;
        }
        public String next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            String toReturn = String.format("Client %s: Month %d earned %d miles for %f",name, currentMonth, plan.getMiles(currentMonth), plan.getCostPerMonth());
            currentMonth++;
            return toReturn;
        }
    }
}
