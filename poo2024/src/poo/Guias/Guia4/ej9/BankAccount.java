package poo.Guias.Guia4.ej9;

public abstract class BankAccount {
    private final int id;
    protected double balance;

    protected BankAccount(int id) {
        this.id = id;
    }

    public double deposit(double amount){
        return this.balance += amount;
    }

    public double extract(double amount){
        if(!canExtract(amount)) {
            throw new RuntimeException("No cuenta con los fondos necesarios.");
        }
        return this.balance -=amount;
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }
}
