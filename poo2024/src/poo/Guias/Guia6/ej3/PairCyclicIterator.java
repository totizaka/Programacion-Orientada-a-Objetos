package poo.Guias.Guia6.ej3;

import java.util.*;

public class PairCyclicIterator<T> implements Iterator<Pair<T>> {
    private final Collection<T> coleccion;
    private Iterator<T> iterator;
    private int currentIndex;
    public PairCyclicIterator(Collection<T> coleccion){
        this.coleccion=coleccion;
        this.iterator=coleccion.iterator();
    }
    @Override
    public boolean hasNext(){
        return this.coleccion.iterator().hasNext();
    }
    @Override
    public Pair<T> next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        T left, right;
        if (!iterator.hasNext()){
            iterator = coleccion.iterator();
        }
        left= iterator.next();
        if (!iterator.hasNext()){
            iterator = coleccion.iterator();
        }
        right=iterator.next();
        return new Pair<>(left,right);
    }
}
