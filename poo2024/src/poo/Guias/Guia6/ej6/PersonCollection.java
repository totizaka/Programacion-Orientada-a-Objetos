package poo.Guias.Guia6.ej6;

import java.util.List;
public interface PersonCollection {
    void addPerson(Person aPerson);
    List<Person> findByLastName(String lastName);
    Person findByName(String firstName, String lastName);
}
