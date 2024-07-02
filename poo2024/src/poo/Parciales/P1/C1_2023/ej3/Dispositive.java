package poo.Parciales.P1.C1_2023.ej3;

public class Dispositive extends Product{

    private final EnergyLabel energyLabel;
    public Dispositive(String name, Brand brand, int price, EnergyLabel energyLabel){
        super(name,brand,price);
        this.energyLabel=energyLabel;
    }
    @Override
    public double getFinalPrice(){
        return super.getFinalPrice()+energyLabel.getTax(getBasePrice());
    }
    @Override
    public String toString() {
        return "[Device] %s with %s".formatted(super.toString(), energyLabel);
    }
}
