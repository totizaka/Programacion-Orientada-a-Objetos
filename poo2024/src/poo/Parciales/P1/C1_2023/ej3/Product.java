package poo.Parciales.P1.C1_2023.ej3;

public abstract class Product {
    private final String name;
    private final Brand brand;
    private final double price;
    public Product(String name, Brand brand, double price){
        this.brand=brand;
        this.name=name;
        this.price=price;
    }
    public double getFinalPrice(){
        return brand.applyDiscount(price);
    }
    public double getFinalPrice(Warranty warranty){
        return getFinalPrice()+ warranty.getCost(price);
    }
    public double getBasePrice(){
        return price;
    }
    @Override
    public String toString(){
        return "%s from %s with price $%.2f".formatted(name, brand, price);
    }
}
