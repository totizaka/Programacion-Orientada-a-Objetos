package poo.Guias.Guia6.ej7;

import java.util.Collection;

public class Ej7_V1<T extends Comparable<? super T>>{
    public T mayor(Collection<T> values){
        if (values.isEmpty()){
            return null;
        }
        T mayor = null;
        for(T elem : values){
            if (mayor==null || mayor.compareTo(elem)<0) {
                mayor = elem;
            }
        }
        return mayor;
    }
}
