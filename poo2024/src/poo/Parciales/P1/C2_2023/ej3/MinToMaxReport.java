package poo.Parciales.P1.C2_2023.ej3;

import java.util.Comparator;
import java.util.Arrays;

public class MinToMaxReport<R> implements ReportCollection<R>{
    private static final int INITIAL_DIM=5;
    private int dim;
    private final Comparator <? super R> cmp;
    private R[] elements = (R[]) new Object[INITIAL_DIM];

    public MinToMaxReport(Comparator <? super R> cmp){
        this.cmp=cmp;
    }

    @Override
    public void add (R report){
        if (dim == elements.length){
            resize();
        }
        elements[dim++]=report;
    }
    @Override
    public R get(int index){
        if (index > dim || index < 0){
            throw new RuntimeException();
        }
        return elements[index];
    }
    @Override
    public R[] reports(){
        R[] toReturn = Arrays.copyOf(elements, dim);
        Arrays.sort(toReturn, cmp);
        return toReturn;
    }

    private void resize(){
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }
}
