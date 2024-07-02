package poo.Talleres.Taller8.ej1;

public class Citizen {
    private int dni;
    private String name;
    private String surname;

    public Citizen(int dni, String name, String surname){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }
    public int getDni() {
        return dni;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String toString(){
        return "%d, %s, %s".formatted(dni, name, surname);
    }
}
