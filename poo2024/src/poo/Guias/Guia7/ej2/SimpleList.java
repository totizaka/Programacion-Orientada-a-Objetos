package poo.Guias.Guia7.ej2;

import java.util.List;
import java.util.function.Function;

public interface SimpleList<T> extends List<T>{
    <R> R reduce(R incialVal, Reducer<T, R> reducer);
}
