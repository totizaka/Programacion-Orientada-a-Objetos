package poo.Talleres.Taller4.ej2;
public class ArrayIntegerList implements ListEj2<Integer> {

    private Integer[] array = new Integer[5];
    private int dim=0;

    @Override
    public void add(Integer element) {
        array[dim++] = element;
    }
    @Override
    public int getPosition(Integer element) {
        for (int i = 0; i < dim; i++) {
            if (array[i].equals(element)){
                return dim;
            }
        }
        System.out.println("no esta incluido");
        return -1;
    }

    @Override
    public int contains(Integer element) {
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

