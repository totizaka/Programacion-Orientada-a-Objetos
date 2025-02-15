package poo.Talleres.Taller6.ej3;

import java.util.Comparator;

public class CategoryBoardingFlight extends BoardingFlight{
    public CategoryBoardingFlight(){
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmpCategory = o1.getCategory().compareTo(o2.getCategory());
                if(cmpCategory==0){
                    cmpCategory = o1.getName().compareTo(o2.getName());
                }
                return cmpCategory;
            }
        });
    }
}
