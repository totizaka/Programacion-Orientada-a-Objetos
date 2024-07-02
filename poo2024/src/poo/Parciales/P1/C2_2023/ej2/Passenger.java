package poo.Parciales.P1.C2_2023.ej2;

public class Passenger {
    private final String nombre;
    private final String aerolinea;
    private int pases;
    public Passenger(String nombre, String aerolinea, int pases){
        this.nombre=nombre;
        this.aerolinea=aerolinea;
        this.pases=pases;
    }
    public int getPases(){
        return pases;
    }
    public void restarPase(){
        if (pases>0) {
            pases--;
        }
    }
    public String getAerolinea(){
        return aerolinea;
    }
}
