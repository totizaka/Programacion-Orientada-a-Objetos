package poo.Talleres.Taller6.ej1;

import java.util.Objects;

public class Citizen {
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
    public boolean equals(Object o){
        return o instanceof Citizen c &&
                Integer.compare(getDni(), c.getDni())==0 &&
                getName().compareTo(c.getName())==0 &&
                getSurname().compareTo(c.getSurname())==0;
    }
    @Override
    public int hashCode(){
        return Objects.hash(getDni(), getName(), getSurname());
    }
}
