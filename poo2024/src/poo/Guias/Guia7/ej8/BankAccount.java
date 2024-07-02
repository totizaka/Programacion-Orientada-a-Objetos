package poo.Guias.Guia7.ej8;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private final int id;
    protected double balance;
    private final List<BankAccountMovement> movements;

    protected BankAccount(int id) {
        this.id = id;
        this.movements = new ArrayList<>();
    }

    public double deposit(double amount){
        movements.add(new BankAccountMovement(BankAccountMovementType.DEPOSIT, amount));
        return balance += amount;
    }

    public double extract(double amount) {
        return extract(new BankAccountMovement(BankAccountMovementType.EXTRACT, amount));
    }
    protected double extract(BankAccountMovement movement) {
        if(!canExtract(movement.getBalance())) {
            throw new IllegalArgumentException("No cuenta con los fondos necesarios");
        }
        movements.add(movement);
        return balance -= movement.getBalance();
    }


    protected abstract boolean canExtract(double amount);

    public double getBalance(){
        return this.balance;
    }

    public void showMovements(){
        System.out.printf("Movements for Account %d%n", id);
        for(BankAccountMovement bankAccountMovement : movements){
            System.out.println(bankAccountMovement);
        }
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
