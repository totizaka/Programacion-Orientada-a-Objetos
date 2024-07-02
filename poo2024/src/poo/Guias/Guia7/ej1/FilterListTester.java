package poo.Guias.Guia7.ej1;

import poo.Guias.Guia6.ej5.Function;

import java.util.List;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<Integer> list = new ArrayFilterList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(13);
        list.add(14);

        List<Integer> list2 = list.applyCriteria(x -> x%2==0);

        for(Integer num : list2)
            System.out.println(num);
    }

}
