package poo.Clases.iterator;

public interface Queue<E> extends Iterable<E>{
    void enqueue(E elem);

    E dequeue();

    boolean isEmpty();
}
