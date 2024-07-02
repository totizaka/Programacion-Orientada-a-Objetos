package poo.Parciales.P1.C2_2023.ej3;

import java.util.Comparator;

public class MaxToMinReport<R> extends MinToMaxReport<R>{
    
    public MaxToMinReport(Comparator<? super R> cmp){
        super(new Comparator<R>() {
            @Override
            public int compare(R o1, R o2) {
                return cmp.compare(o2, o1);
            }
        });
    }
}
