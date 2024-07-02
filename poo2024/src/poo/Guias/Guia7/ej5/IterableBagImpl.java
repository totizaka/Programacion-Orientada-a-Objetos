package poo.Guias.Guia7.ej5;

import java.util.*;

public class IterableBagImpl<T extends Comparable<? super T>> implements IterableBag<T>{

    Map<T, Integer> bag = new TreeMap<>(Comparator.reverseOrder());

    @Override
    public void add(T element) {
        if(!bag.containsKey(element)){
            bag.put(element, 1);
        }
        else
            bag.put(element, bag.get(element)+1);
    }
    @Override
    public int size() {
        if (bag.isEmpty()){
            return 0;
        }
        int counter=0;
        for (T e : bag.keySet()){
            counter+=bag.get(e);
        }
        return counter;
    }
    @Override
    public boolean contains(T element) {
        return bag.containsKey(element);
    }
    @Override
    public void remove(T element) {
        if (bag.isEmpty()){
            throw new NoSuchElementException();
        }
        if (bag.get(element)==1){
            bag.remove(element);
        }
        else
            bag.put(element, bag.get(element)-1);
    }
    @Override
    public int count(T element) {
        if (!bag.containsKey(element)){
            return 0;
        }
        return bag.get(element);
    }
    @Override
    public int sizeDistinct() {
        return bag.size();
    }
    @Override
    public Iterable<T> elements() {
        List<T> list = new ArrayList<>();
        for (T e : bag.keySet()){
            for(int i = 0; i<bag.get(e); i++) {
                list.add(e);
            }
        }
        return list;
    }
    @Override
    public Iterable<T> elementsDistinct() {
        return bag.keySet();
    }
}
