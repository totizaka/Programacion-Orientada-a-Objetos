package poo.Talleres.Taller4.ej3;

public class ArrayList<T> implements List<T>{
    private T[] array = (T[]) new Object[5];
    private int dim=0;

    @Override
    public void add(T element) {
        array[dim++] = element;
    }
    @Override
    public int getPosition(T element) {
        for (int i = 0; i < dim; i++) {
            if (array[i].equals(element)){
                return dim;
            }
        }
        System.out.println("no esta incluido");
        return -1;
    }

    @Override
    public int contains(T element) {
        return getPosition(element);
    }

    @Override
    public boolean remove(int position) {
        return true;
    }
    @Override
    public boolean isEmpty() {
        return dim==0;
    }
}
