package poo.Parciales.P1.C1_2022.ej1;

public enum Plan {
    CLUB_1000(1000, 950, 0, 0),
    CLUB_2000(2000, 1750, 1000, 2),
    CLUB_5000(5000, 4400, 2500, 5),
    CLUB_10000(10000, 144000, 10000, 6);
    private int milesPerMonth;
    private double costPerMonth;
    private int extraMiles;
    private int extraMilesDuration;
    Plan(int milesPerMonth, double costPerMonth, int extraMiles, int extraMilesDuration){
        this.costPerMonth=costPerMonth;
        this.milesPerMonth=milesPerMonth;
        this.extraMiles=extraMiles;
        this.extraMilesDuration=extraMilesDuration;
    }
    public int getMiles(int month){
        if (month >= 1 && month <= extraMilesDuration){
            return milesPerMonth+extraMiles;
        }
        return milesPerMonth;
    }
    public double getCostPerMonth(){
        return costPerMonth;
    }
}
