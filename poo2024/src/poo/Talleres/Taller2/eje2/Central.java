package poo.Talleres.Taller2.eje2;

public class Central {
    private double precioviaje;

    public void actualizaprecio(double precio){
        precio = precioviaje;
        return;
    }
    public Central(double precio){

    }
    public double consultaPrecio() {
        return precioviaje;
    }
}
