package poo.Parciales.P1.C2_2023.ej2;

public class LoungeUltraLimited extends LoungeLimited{
    private final String aerolinea;
    public LoungeUltraLimited(String nombre, LoungeCentral aeropuerto, String aeorlinea, int pasajerosMax){
        super(nombre,aeropuerto,pasajerosMax);
        this.aerolinea=aeorlinea;
    }
    @Override
    public void enter(Passenger pasajero){
        if ((aerolinea.compareTo(pasajero.getAerolinea()))!=0){
            throw new IllegalArgumentException();
        }
        super.enter(pasajero);
    }
}
