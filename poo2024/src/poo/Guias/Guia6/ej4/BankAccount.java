package poo.Guias.Guia6.ej4;

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
        if(canExtract(amount)) {
            return this.balance -=amount;
        }
        return balance;
    }

    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return "Cuenta %d con saldo %.2f".formatted(id, balance);
    }

    @Override
    public boolean equals(Object o){
        return o instanceof BankAccount that &&
                id == that.id;
    }
}
