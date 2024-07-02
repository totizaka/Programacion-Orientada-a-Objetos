package poo.Parciales.P1.C2_2021.ej2;

import java.util.Arrays;
import java.util.Comparator;

public class Directory{
    private final Person[] persons;
    private int index;
    public Directory(int maxAmount){
        persons = new Person[maxAmount];
    }
    public Directory addPerson(Person person){
        if (index == persons.length){
            throw new ReachedLimitedException(index);
        }
        persons[index++]=person;
        return this;
    }
    protected Person[] persons(Comparator<Person> cmp){
        Person[] personsCopy = Arrays.copyOf(persons, index);
        Arrays.sort(personsCopy, cmp);
        return personsCopy;
    }
    public Person[] persons(){
        return persons(Comparator.naturalOrder());
    }
}
