package poo.Guias.Guia5.ej14;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<E> implements Iterator<E>{
    private final E[] words;
    private int index;

    public ReversedIterator(E[] words){
        this.words = words;
        this.index = words.length-1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public E next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return words[index--];
    }
}
