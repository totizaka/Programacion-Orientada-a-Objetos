package poo.Parciales.P1.C1_2022.ej3;

public class Attraction {
    private String name;
    public Attraction(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attraction attraction))
            return false;
        return name.equals(attraction.name);
    }
    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
