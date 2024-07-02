package poo.Guias.Guia6.ej10;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T>{

    private Map<Comparator<T>, Set<T>> personas = new HashMap<>();
    private Set<T> guardadas = new HashSet<>();
    @Override
    public void add(Comparator<T> comp) {
        if(!personas.containsKey(comp)) {
            Set<T> newSet = new TreeSet<>(comp);
            newSet.addAll(guardadas);
            personas.put(comp, newSet);
        }
    }
    @Override
    public void add(T elem) {
        if(personas.isEmpty()){
            throw new IllegalArgumentException();
        }
        guardadas.add(elem);
        for(Comparator<T> comparator : personas.keySet()){
            personas.get(comparator).add(elem);
        }
    }
    @Override
    public void remove(T elem) {
        if (!personas.isEmpty()) {
            guardadas.remove(elem);
            for (Comparator<T> comparator : personas.keySet()) {
                personas.get(comparator).remove(elem);
            }
        }
    }
    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        if (!personas.containsKey(comp)){
            throw new IllegalArgumentException();
        }
        return personas.get(comp);
    }
}
