package poo.Talleres.Taller7.ej1;

import java.util.List;
import java.util.function.UnaryOperator;

public interface SimpleList<E> extends List<E> {
    SimpleList<E> map(Mapper<E> mapper);
}
