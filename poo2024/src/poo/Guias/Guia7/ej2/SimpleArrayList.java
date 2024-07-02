package poo.Guias.Guia7.ej2;

import java.util.ArrayList;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T>{
    @Override
    public <R> R reduce(R incialVal, Reducer<T, R> reducer) {
        R acumulador=incialVal;
        for(T element : this){
            acumulador = reducer.reduce(element, acumulador);
        }
        return acumulador;
    }
}
