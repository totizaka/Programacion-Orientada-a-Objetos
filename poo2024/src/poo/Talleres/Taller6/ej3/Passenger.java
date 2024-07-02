package poo.Talleres.Taller6.ej3;

public class Passenger {
    private final String name;
    private final int row;
    private final PassengerCategory category;

    public Passenger(String name, int row, PassengerCategory category) {
        this.category = category;
        this.name = name;
        this.row = row;
    }
    public int getRow() {
        return row;
    }
    public String getName() {
        return name;
    }
    public PassengerCategory getCategory() {
        return category;
    }
}
