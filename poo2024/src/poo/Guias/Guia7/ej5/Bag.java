package poo.Guias.Guia7.ej5;

public interface Bag<T>{

    void add(T element);
    int size();
    boolean contains(T element);
    void remove(T element);
    int count(T element);
    int sizeDistinct();
}
