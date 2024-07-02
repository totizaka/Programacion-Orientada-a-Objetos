package poo.Guias.Guia1.ej1;

public class Gear {

    private int chainring;
    private double cog;

    public Gear(int chainring, double cog){
        this.chainring = chainring;
        this.cog = cog;
    }

    public double ratio(){
        double ratio;
        ratio = chainring/cog;
        return ratio;
    }
}
