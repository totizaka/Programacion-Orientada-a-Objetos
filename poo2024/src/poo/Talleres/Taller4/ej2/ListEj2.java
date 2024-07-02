package poo.Talleres.Taller4.ej2;

public interface ListEj2<T>{
    void add(T element);

    int contains(T element);

    int getPosition(T element);

    boolean remove(int position);

    boolean isEmpty();

    default boolean removeElement(T element){
        int pos = contains(element);
        return remove(pos);
    }
}
