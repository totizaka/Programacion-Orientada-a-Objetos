package poo.Guias.Guia7.ej1;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T>{
    @Override
    public FilterList<T> applyCriteria(Criteria<T> criteria) {
        FilterList<T> listToReturn = new ArrayFilterList<>();
        for(T element : this){
            if (criteria.satisfies(element)){
                listToReturn.add(element);
            }
        }
        return listToReturn;
    }
}
