package poo.Talleres.Taller4.ej1;

public interface List<T> {
    void add(T element);

    int getPosition(T element);

    void remove(int position);

    boolean isEmpty();
}
