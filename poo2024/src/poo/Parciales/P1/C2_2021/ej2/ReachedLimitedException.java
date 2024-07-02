package poo.Parciales.P1.C2_2021.ej2;

public class ReachedLimitedException extends RuntimeException{
    public ReachedLimitedException(int maxAmount){
        super(String.format("Reached limit of %d people", maxAmount));
    }
}
