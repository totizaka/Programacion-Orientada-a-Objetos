package poo.Parciales.P1.C1_2023.ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T>{
    private T[] elementos;
    private int indicePrimero;
    private int indiceUltimo;
    private UnaryOperator<Integer> operador;

    public CustomIndex(T[] elementos, int indicePrimero, int indiceUltimo, UnaryOperator<Integer> operador){
        if(indicePrimero>indiceUltimo){
            throw new IllegalArgumentException();
        }
        this.elementos=elementos;
        this.indicePrimero=indicePrimero;
        this.indiceUltimo=indiceUltimo;
        this.operador=operador;
    }

    private void setNextIndex(UnaryOperator<Integer> nuevo){
        this.operador=nuevo;
    }

    public Iterator<T> iterator(){
        return new CollectionIterator();
    }
    private class CollectionIterator implements Iterator<T>{
        private int currentIndice = indicePrimero;
        private final UnaryOperator<Integer> operadorIt = operador;

        public boolean hasNext(){
            return currentIndice<indiceUltimo;
        }
        public T next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            T toReturn = elementos[currentIndice];
            currentIndice = operadorIt.apply(currentIndice);
            return toReturn;
        }
    }
}
