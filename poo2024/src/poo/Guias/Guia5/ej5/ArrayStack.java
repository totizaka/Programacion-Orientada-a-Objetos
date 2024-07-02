package poo.Guias.Guia5.ej5;
import java.util.Arrays;
public class ArrayStack <E> implements Stack<E>{

    private static final int INITIAL_DIM=1;
    private int dim=0;
    private E[] elements;

    public ArrayStack(){
        this.elements = (E[])new Object[INITIAL_DIM];
    }
    @Override
    public void push(E obj){
        if (dim == elements.length){
            resize();
        }
        elements[dim++]=obj;
    }
    @Override
    public E pop() {
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[--dim];
    }
    @Override
    public E peek() {
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[dim-1];
    }

    @Override
    public boolean isEmpty() {
        return dim==0;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = dim-1; i >= 0; i--) {
            stringBuilder.append(elements[i]).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1,  ']');
        return stringBuilder.toString();
    }

    private void resize(){
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }
}
