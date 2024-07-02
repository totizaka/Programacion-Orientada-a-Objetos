package poo.Talleres.Taller3.ejSubway;

public class DiscountRechargeableSubwayCard extends RechargeableSubwayCard{

    private double discountPercentage;

    public  DiscountRechargeableSubwayCard(SubwayCentral sc, double discountPercentage){
        super(sc);
        this.discountPercentage = discountPercentage;
    }
    @Override
    protected double rideCost() {
        return super.rideCost() * (1 - discountPercentage);
    }
}
