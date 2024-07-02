package poo.Guias.Guia7.ej5;

public interface IterableBag<T> extends Bag<T>{
    /**
     * Para iterar, en orden descendente, por todos los elementos que hay en la bolsa.
     */
    Iterable<T> elements();

    /**
     * Para iterar, en orden descendente, por todos los elementos distintos
     * que hay en la bolsa.
     */
    Iterable<T> elementsDistinct();
}
