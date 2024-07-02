package poo.Talleres.Taller8.ej3;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T>{

    private Deque<T> borrados = new LinkedList<>();
    public SpecialCollectionImpl(){
        super(Comparator.reverseOrder());
    }
    @Override
    public void deleteFirst() {
        deleteFirst(first -> true);
    }
    @Override
    public void deleteFirst(Predicate<T> predicate) {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        T first = getFirst();
        if (predicate.test(first)){
            remove(first);
            borrados.push(first);
        }
    }
    @Override
    public void undoDeleteFirst() {
        if(borrados.isEmpty()){
            throw new NothingToUndoException();
        }
        T first = borrados.pop();
        add(first);
    }
}
