package poo.Talleres.Taller6.ej2;

import java.util.Comparator;
import java.util.Objects;

public class Citizen implements Comparable<Citizen> {
    private final int dni;
    private final String name;
    private final String surname;
    public Citizen(int dni, String name, String surname){
        this.dni=dni;
        this.name=name;
        this.surname=surname;
    }

    public int getDni() {
        return dni;
    }

    public String getSurname() {
        return surname;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "%s %s %d".formatted(name,surname,dni);
    }

    @Override
    public int compareTo(Citizen o){
        return Integer.compare(getDni(), o.getDni());
    }
}
