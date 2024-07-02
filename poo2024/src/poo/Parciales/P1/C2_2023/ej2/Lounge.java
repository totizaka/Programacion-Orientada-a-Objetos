package poo.Parciales.P1.C2_2023.ej2;

public class Lounge{
    private LoungeCentral aeropuerto;
    private final String nombre;
    private int ingresados;
    public Lounge(String nombre, LoungeCentral aeropuerto) {
        this.nombre=nombre;
        this.aeropuerto=aeropuerto;
    }

    public void enter(Passenger pasajero){
        if (!aeropuerto.isOpen()){
            throw new IllegalArgumentException();
        }
        if (pasajero.getPases()>0){
            pasajero.restarPase();
            ingresados++;
        }
        throw new IllegalArgumentException();
    }
    public void exit(){
        if (ingresados==0){
            throw new IllegalArgumentException();
        }
        ingresados--;
    }
    public void exit(int N){
        if (ingresados<N){
            throw new IllegalArgumentException();
        }
        ingresados-=N;
    }
    @Override
    public String toString(){
        return "%s Lounge has %d guests".formatted(aeropuerto, ingresados);
    }
}
