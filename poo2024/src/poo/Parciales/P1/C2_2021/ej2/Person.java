package poo.Parciales.P1.C2_2021.ej2;

public class Person implements Comparable<Person>{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return String.format("Person Name=%s, Age=%d", name, age);
    }
    @Override
    public int compareTo(Person o) {
        int nameCmp = name.compareTo(o.getName());
        if(nameCmp == 0) {
            return Integer.compare(o.getAge(), age);
        }
        return nameCmp;
    }
}
