package poo.Parciales.P1.C1_2023.ej3;

public enum EnergyLabel {
    LEVEL_A(0.0),
    LEVEL_B(0.10),
    LEVEL_C(0.20);
    private final double rate;
    EnergyLabel(double rate){
        this.rate=rate;
    }
    public double getTax(double price){
        return price*rate;
    }
    @Override
    public String toString() {
        return "Energy Label %s".formatted(super.toString());
    }
}
