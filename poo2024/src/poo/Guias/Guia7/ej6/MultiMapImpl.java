package poo.Guias.Guia7.ej6;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V>{

    private Map<K, SortedSet<V>> multiMap = new HashMap<>();
    @Override
    public void put(K key, V value) {
        if (!multiMap.containsKey(key)){
            SortedSet<V> newSet = new TreeSet<>(Comparator.reverseOrder());
            newSet.add(value);
            multiMap.put(key, newSet);
        }
        else{
            if (!multiMap.get(key).contains(value)){
                multiMap.get(key).add(value);
            }
        }
    }
    @Override
    public int size() {
        if(multiMap.isEmpty()){
            return 0;
        }
        int counter=0;
        for (K e : multiMap.keySet()){
            counter+=multiMap.get(e).size();
        }
        return counter;
    }
    @Override
    public int size(K key) {
        return multiMap.get(key).size();
    }
    @Override
    public void remove(K key) {
        if (multiMap.containsKey(key)){
            multiMap.remove(key);
        }
    }
    @Override
    public void remove(K key, V value) {
        if (multiMap.containsKey(key)){
            multiMap.get(key).remove(value);
        }
    }
    @Override
    public Iterable<V> get(K key) {
        return multiMap.get(key);
    }
}
