package poo.Talleres.Taller4.ej3;

public interface List <T>{
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
