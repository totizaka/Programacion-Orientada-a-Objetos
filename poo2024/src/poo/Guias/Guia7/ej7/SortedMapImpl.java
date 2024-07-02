package poo.Guias.Guia7.ej7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K extends Comparable<? super K>, V> extends TreeMap<K, V> implements SortedMapEj7<K, V>{
    @Override
    public K firstKey() {
        return iterator().next().getKey();
    }
    @Override
    public V firstValue() {
        return iterator().next().getValue();
    }
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }
}
