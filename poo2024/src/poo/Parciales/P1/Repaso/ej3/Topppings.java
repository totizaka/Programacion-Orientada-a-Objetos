package poo.Parciales.P1.Repaso.ej3;

public enum Topppings {
    TOMATE("Tomate", 30),
    EXTRAQUESO("Extra Queso", 20),
    CEBOLLA("Cebolla", 10);
    private final String name;
    private final double price;

    Topppings(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
