package poo.Guias.Guia7.ej7;

import java.util.Map;

public interface SortedMapEj7<K extends Comparable<? super K>, V> extends Map<K, V>, Iterable<Map.Entry<K, V>> {
    K firstKey();
    V firstValue();
}
