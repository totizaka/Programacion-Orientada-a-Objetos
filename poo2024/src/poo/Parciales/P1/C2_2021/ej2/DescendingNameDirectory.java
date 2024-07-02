package poo.Parciales.P1.C2_2021.ej2;

import java.util.Comparator;

public class DescendingNameDirectory extends Directory{
    public DescendingNameDirectory(int maxAmount){
        super(maxAmount);
    }
    @Override
    public Person[] persons(){
        return persons(Comparator.reverseOrder());
    }
}
