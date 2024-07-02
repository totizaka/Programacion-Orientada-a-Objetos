package poo.Parciales.P1.C2_2023.ej2;

public class LoungeLimited extends Lounge {
    private final int pasajerosMax;
    private int ingresados;

    public LoungeLimited(String nombre, LoungeCentral aeropuerto, int pasajerosMax) {
        super(nombre, aeropuerto);
        this.pasajerosMax = pasajerosMax;
    }

    @Override
    public void enter(Passenger pasajero) {
        if (ingresados >= pasajerosMax) {
            throw new RuntimeException("cannot enter Lounge");
        }
        super.enter(pasajero);
    }
    @Override
    public String toString(){
        return "%s up to %d guests".formatted(super.toString(), pasajerosMax);
    }
}
