package poo.Parciales.P1.C2_2023.ej1;

import java.time.LocalTime;
import java.util.Iterator;

public class ParkSlot{
    private final String nombre;
    private final LocalTime horaInicioSlot;

    public ParkSlot(String nombre, LocalTime horaInicioSlot){
        this.nombre=nombre;
        this.horaInicioSlot=horaInicioSlot;
    }
    @Override
    public String toString(){
        return "%s <> %s".formatted(nombre, horaInicioSlot);
    }
}
