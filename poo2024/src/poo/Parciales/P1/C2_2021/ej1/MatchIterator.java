package poo.Parciales.P1.C2_2021.ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchIterator<T> implements Iterator<MatchElement>{
    private final T[] vec;
    Predicate<T> predicate;
    private int index;
    public MatchIterator(T[] vec, Predicate<T> predicate){
        this.vec=vec;
        this.predicate=predicate;
    }

    @Override
    public boolean hasNext(){
        return index < vec.length;
    }
    @Override
    public MatchElement next(){
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        T currentElement = vec[index++];
        boolean match = predicate.test(currentElement);
        return new MatchElement(currentElement, match);
    }
}
