package poo.Parciales.P1.Repaso.ej2;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>>{
    private final T[] vec1;
    private final T[] vec2;
    private int iterador;
    public ParallelIterator(T[] vec1, T[] vec2){
        if (vec1==null){
            throw new RuntimeException("First collection missing");
        }
        if (vec2==null){
            throw new RuntimeException("Second collection missing");
        }
        this.vec1 = vec1;
        this.vec2 = vec2;
    }

    @Override
    public boolean hasNext() {
        return iterador < vec1.length || iterador < vec2.length;
    }

    @Override
    public Pair<T> next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        Pair<T> toReturn = new Pair<>(vec1[iterador], vec2[iterador]);
        iterador++;
        return toReturn;
    }
    public static class Pair<T>{
        private final T left, right;
        Pair(T element1, T element2){
            this.left = element1;
            this.right = element2;
        }
        @Override
        public String toString() {
            return String.format("{%s,%s}", left,right);
        }
    }
}
