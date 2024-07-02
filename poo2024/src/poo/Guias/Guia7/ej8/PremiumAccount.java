package poo.Guias.Guia7.ej8;

public class PremiumAccount extends CheckingAccount{
    private final ShopDiscountsProvider shopDiscountsProvider;
    public PremiumAccount(int id, int overdraft, ShopDiscountsProvider shopDiscountsProvider){
        super(id, overdraft);
        this.shopDiscountsProvider=shopDiscountsProvider;
    }
    public double extract(double amount, String shop){
        return super.extract(new PremiumBankAccountMovement(BankAccountMovementType.EXTRACT,
                amount * (1 - shopDiscountsProvider.getDiscount(shop)), shop));
    }
}
