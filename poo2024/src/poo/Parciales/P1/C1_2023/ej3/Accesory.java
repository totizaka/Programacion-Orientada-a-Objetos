package poo.Parciales.P1.C1_2023.ej3;

public class Accesory extends Product{
    private final String description;
    public Accesory(String name, Brand brand, int price, String description) {
        super(name, brand, price);
        this.description = description;
    }
    @Override
    public String toString() {
        return "[Accessory] %s with feature: %s".formatted(super.toString(), description);
    }
}
