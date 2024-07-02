package poo.Talleres.Taller7.ej1;

import java.util.ArrayList;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E>{
    @Override
    public SimpleList<E> map(Mapper<E> mapper){
        SimpleList<E> listToReturn = new SimpleArrayList<>();
        for(E element : this){
            listToReturn.add(mapper.map(element));
        }
        return listToReturn;
    }
}
