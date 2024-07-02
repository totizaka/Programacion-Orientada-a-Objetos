package poo.Guias.Guia6.ej8;


import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<T> implements Bag<T>{
    private Map<T, Integer> values = new HashMap<>();

    public void add(T element){
        if (!values.containsKey(element)){
            values.put(element, 1);
        }
        else
            values.put(element, values.get(element)+1);
    }
    //Otra opcion :
    //public void add(T elem) {
    //        values.merge(elem, 1, Integer::sum);
    //    }

    public int size(){
        if (values.isEmpty()){
            return 0;
        }
        int counter=0;
        for(int i : values.values()){
            counter+=i;
        }
        return counter;
    }
    public boolean contains(T element){
        return values.containsKey(element);
    }
    public void remove(T element){
        if (!values.containsKey(element)){
            throw new NoSuchElementException();
        }
        if (values.get(element)==1) {
            values.remove(element);
        }
        else
            values.put(element, values.get(element)-1);
        //otra opcion:
        //values.merge(elem, -1, Integer::sum);
    }
    public int count(T element){
        if (!values.containsKey(element)){
            return 0;
        }
        return values.get(element);
    }
    //Otra opcion:
    //@Override
    //    public int count(T elem) {
    //        return values.getOrDefault(elem, 0);
    //    }
    public int sizeDistinct(){
        return values.size();
    }
}
