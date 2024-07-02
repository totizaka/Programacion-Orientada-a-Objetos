package poo.Talleres.Taller4.ej4;

import java.util.Comparator;

public class ComparatorPhones implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        int result = Integer.compare(o1.getAreaCode(), o2.getAreaCode());
        if(result==0) {
            result = Integer.compare(o1.getPrefix(), o2.getPrefix());
            if (result == 0) {
                result = Integer.compare(o1.getLineNumber(), o2.getLineNumber());
            }
        }
        return result;
    }
}
