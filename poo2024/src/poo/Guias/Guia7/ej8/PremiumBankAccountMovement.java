package poo.Guias.Guia7.ej8;

public class PremiumBankAccountMovement extends BankAccountMovement{
    private final String shopName;
    public PremiumBankAccountMovement(BankAccountMovementType type, double balance, String shopName){
        super(type, balance);
        this.shopName=shopName;
    }
    @Override
    public String toString() {
        return "%s for shop %s".formatted(super.toString(), shopName);
    }
}
