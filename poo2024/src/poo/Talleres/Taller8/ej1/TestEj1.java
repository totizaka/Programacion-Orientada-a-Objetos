package poo.Talleres.Taller8.ej1;

import java.util.*;

public class TestEj1 {
    public static void main(String[] args) {
        Citizen c1 = new Citizen(45233695, "Tomas", "Zakalik");
        Citizen c2 = new Citizen(47567890, "Florencia", "Pena");
        Citizen c3 = new Citizen(43576893, "carmen", "carrin");
        Citizen c4 = new Citizen(49233777, "Tomas", "Briolo");
        Citizen c5 = new Citizen(45233333, "Tomas", "Broly");
        Citizen c7 = new Citizen(34433695, "Tomas", "Zakalik");

        Map<Integer, Citizen> personasPorDni = new HashMap<>();

        personasPorDni.put(c1.getDni(), c1);
        personasPorDni.put(c2.getDni(), c2);
        personasPorDni.put(c3.getDni(), c3);

        System.out.println(personasPorDni.get(47567890));

        Map<String, List<Citizen>> personasPorNombre = new HashMap<>();

        personasPorNombre.put(c1.getName(), new ArrayList<>());
        personasPorNombre.put(c2.getName(), new ArrayList<>());
        personasPorNombre.put(c3.getName(), new ArrayList<>());
        personasPorNombre.get(c1.getName()).add(c1);
        personasPorNombre.get(c2.getName()).add(c2);
        personasPorNombre.get(c3.getName()).add(c3);
        personasPorNombre.get(c4.getName()).add(c4);
        personasPorNombre.get(c5.getName()).add(c5);

        System.out.println(personasPorNombre.get("Tomas"));

        Map<String, Map<String, List<Citizen>>> personasPorNombreApellido= new HashMap<>();

        personasPorNombreApellido.put(c1.getName(), new HashMap<>());
        personasPorNombreApellido.get(c1.getName()).put(c1.getSurname(), new ArrayList<>());
        personasPorNombreApellido.get(c1.getName()).get(c1.getSurname()).add(c1);
        personasPorNombreApellido.get(c7.getName()).get(c7.getSurname()).add(c7);

        System.out.println(personasPorNombreApellido.get("Tomas").get("Zakalik"));

        Map<Integer, Citizen> personasPorDniOrdenado = new TreeMap<>();

        personasPorDniOrdenado.put(c1.getDni(), c1);
        personasPorDniOrdenado.put(c2.getDni(), c2);
        personasPorDniOrdenado.put(c3.getDni(), c3);
        personasPorDniOrdenado.put(c4.getDni(), c4);

        System.out.println(personasPorDniOrdenado.values());
    }
}
