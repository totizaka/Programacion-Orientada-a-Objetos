package poo.Talleres.Taller6.ej2;

import java.util.Set;
import java.util.TreeSet;

public class CitizenTester {
    public static void main(String[] args) {
        Set<Citizen> lista1 = new TreeSet<>();

        lista1.add(new Citizen(2234, "Juan", "Perez"));
        lista1.add(new Citizen(3234, "Mario", "Perez"));
        lista1.add(new Citizen(4234, "Juana", "Perez"));
        lista1.add(new Citizen(1122, "Lucia", "Perez"));
        lista1.add(new Citizen(2234, "Juan", "Perez"));

        lista1.forEach(c -> System.out.println(c.getDni()));

        Set<Citizen> lista2 = new TreeSet<>(((o1, o2) -> o2.getDni()- o1.getDni()));

        lista2.add(new Citizen(2234, "Juan", "Perez"));
        lista2.add(new Citizen(3234, "Mario", "Perez"));
        lista2.add(new Citizen(4234, "Juana", "Perez"));
        lista2.add(new Citizen(1122, "Lucia", "Perez"));
        lista2.add(new Citizen(2234, "Juan", "Perez"));

        lista2.forEach(c -> System.out.println(c.getDni()));

    }
}
