package poo.Guias.Guia7.ej8;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> list = new ArrayList<>();
    public void addAccount(BankAccount bankAccount){
        list.add(bankAccount);
    }
    public void removeAccount(BankAccount bankAccount){
        list.remove(bankAccount);
    }
    public int accountSize(){
        return list.size();
    }
    public double totalAmount(){
        double totalAmount=0;
        for (BankAccount account : list){
            totalAmount+=account.getBalance();
        }
        return totalAmount;
    }
}
