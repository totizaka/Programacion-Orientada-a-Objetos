package poo.Guias.Guia6.ej8;

import java.util.List;

public interface Bag<T>{

    void add(T element);

    int size();
    boolean contains(T element);

    void remove(T element);
    int count(T element);
    int sizeDistinct();
}
