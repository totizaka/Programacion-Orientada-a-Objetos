package poo.Parciales.P1.Repaso.ej3;

public abstract class  Pizza {
    private final String descripcion;
    private double precio;
    private Topppings[] topppings;

    public Pizza(String descripcion, double precio, Topppings[] topppings){
        this.descripcion=descripcion;
        this.precio=precio;
        this.topppings = topppings;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("Pizaa a la ").append(descripcion);
        double totalPrice = precio;
        for (Topppings toppping: topppings){
            stringBuilder.append(String.format("con %s ", toppping));
            totalPrice+=toppping.getPrice();
        }
        stringBuilder.append(String.format(": $%.2f", totalPrice));
        return stringBuilder.toString();
    }
}

