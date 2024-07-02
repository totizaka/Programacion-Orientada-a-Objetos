package poo.Talleres.Taller3.ejSubway;

public class RechargeableSubwayCard extends SubwayCard{

    private double balance;

    public RechargeableSubwayCard(SubwayCentral sc){
        super(sc);
        this.balance = 0;
    }

    public void recharge(double amount){
        this.balance += amount;
    }

    protected double rideCost(){
        return super.getRideCost();
    }
    @Override
    protected boolean canRide() {
        return this.balance >= rideCost();
    }

    public void ride(){
        if (!(canRide())){
            System.out.println("msg error");
            return;
        }
        this.balance -= rideCost();
        System.out.println("viaja recargable");
    }
}
