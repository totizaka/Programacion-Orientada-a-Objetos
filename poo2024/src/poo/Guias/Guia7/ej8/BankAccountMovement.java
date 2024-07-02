package poo.Guias.Guia7.ej8;

public class BankAccountMovement {
    private BankAccountMovementType bankAccountMovementType;
    private final double balance;

    public BankAccountMovement(BankAccountMovementType type, double balance){
        this.balance=balance;
        this.bankAccountMovementType=type;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "%s $%.2f".formatted(bankAccountMovementType, Math.abs(balance));
    }
}
