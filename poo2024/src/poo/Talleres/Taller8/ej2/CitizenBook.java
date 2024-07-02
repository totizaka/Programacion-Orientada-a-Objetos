package poo.Talleres.Taller8.ej2;

import java.util.*;

public class CitizenBook {
    private Map<String, Set<Citizen>> personas = new HashMap<>();

    public void add(Citizen citizen){
        if (!personas.containsKey(citizen.getSurname())) {
            TreeSet<Citizen> newSet = new TreeSet<>();
            newSet.add(citizen);
            personas.put(citizen.getSurname(), newSet);
        }
        else
            personas.get(citizen.getSurname()).add(citizen);
    }
    public Set<Citizen> getByLastName(String lastName){
        if (personas.containsKey(lastName))
            return personas.get(lastName);
        return new TreeSet<>();
    }
}
