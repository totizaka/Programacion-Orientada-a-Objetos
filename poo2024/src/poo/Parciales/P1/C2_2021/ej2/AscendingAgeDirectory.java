package poo.Parciales.P1.C2_2021.ej2;

import java.util.Comparator;

public class AscendingAgeDirectory extends Directory {
    public AscendingAgeDirectory(int maxAmount) {
        super(maxAmount);
    }

    @Override
    public Person[] persons() {
        return persons(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageCmp = Integer.compare(o1.getAge(), o2.getAge());
                if (ageCmp == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return ageCmp;
            }
        });
    }
}
