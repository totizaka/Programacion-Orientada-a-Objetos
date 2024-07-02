package poo.Guias.Guia7.ej8;

public enum BankAccountMovementType {
    EXTRACT("Extract"),
    DEPOSIT("Deposit");

    private String name;
    BankAccountMovementType(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    }
}


