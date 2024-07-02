package poo.Talleres.Taller8.ej3;

import java.util.SortedSet;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public interface SpecialCollection<T extends Comparable<?>> extends SortedSet<T>{
    void deleteFirst();
    void deleteFirst(Predicate<T> predicate);
    void undoDeleteFirst();
}
