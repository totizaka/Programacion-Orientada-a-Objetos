package poo.Talleres.Taller6.ej1;

import java.util.HashSet;
import java.util.Set;

public class CitizenTester {
    public static void main(String[] args){
        Set<Citizen> lista = new HashSet<>();
        lista.add(new Citizen(2234, "Juan", "Perez"));
        lista.add(new Citizen(3234, "Mario", "Perez"));
        lista.add(new Citizen(4234, "Juana", "Perez"));
        lista.add(new Citizen(5234, "Lucia", "Perez"));
        lista.add(new Citizen(2234, "Juan", "Perez"));

        lista.forEach(c -> System.out.println(c.getDni()));
    }
}
