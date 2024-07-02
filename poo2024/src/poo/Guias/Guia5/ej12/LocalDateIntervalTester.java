package poo.Guias.Guia5.ej12;
import java.time.LocalDate;
import java.util.Iterator;

public class LocalDateIntervalTester {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase LocalDate
        LocalDate today = LocalDate.of(2020, 3, 1);
        System.out.println(today);
        LocalDate todayPlus10 = today.plusDays(10);
        System.out.println(todayPlus10);
        System.out.println(todayPlus10.isAfter(today));
        System.out.println("----------");
        // Ejemplo de uso de la clase LocalDateInterval
        LocalDateInterval localDateInterval = new LocalDateInterval(today, todayPlus10, 3);
        for(LocalDate localDate : localDateInterval) {
            System.out.println(localDate);
        }
        System.out.println("----------");
        Iterator<LocalDate> localDateIterator = new LocalDateInterval(today, today.plusDays(2), 1).iterator();
        while(localDateIterator.hasNext()) {
            System.out.println(localDateIterator.next());
        }
    }
}
