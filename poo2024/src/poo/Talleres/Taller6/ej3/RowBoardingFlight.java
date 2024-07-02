package poo.Talleres.Taller6.ej3;

import java.util.Comparator;

public class RowBoardingFlight extends BoardingFlight{
    public RowBoardingFlight(){
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmpRow = Integer.compare(o1.getRow(),o2.getRow());
                if(cmpRow==0){
                    cmpRow = o1.getName().compareTo(o2.getName());
                }
                return cmpRow;
            }
        });
    }
}
