package poo.Talleres.Taller7.ej2;

import java.util.ArrayList;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {
    @Override
    public <T> SimpleList<T> map(Mapper<E, T> mapper){
        SimpleList<T> listToReturn = new SimpleArrayList<>();
        for(E element : this){
            listToReturn.add(mapper.map(element));
        }
        return listToReturn;
    }
}
