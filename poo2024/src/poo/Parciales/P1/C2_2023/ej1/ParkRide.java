package poo.Parciales.P1.C2_2023.ej1;

import poo.Guias.Guia5.ej12.LocalDateInterval;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot>{
    private final String nombre;
    private final LocalTime apertura;
    private LocalTime cierre;
    private final long minSlot;

    public ParkRide(String nombre, LocalTime apertura, LocalTime cierre, long minSlot){
        if(apertura.isAfter(cierre)){
            throw new IllegalArgumentException();
        }
        if (minSlot<=0){
            throw new IllegalArgumentException();
        }
        this.apertura=apertura;
        this.nombre=nombre;
        this.cierre=cierre;
        this.minSlot=minSlot;
    }
    public void setCierre(LocalTime cierre){
        if (apertura.isAfter(cierre)){
            throw new IllegalArgumentException();
        }
        this.cierre=cierre;
    }

    @Override
    public Iterator<ParkSlot> iterator(){
        return new ParkSlotIterator();
    }
    private class ParkSlotIterator implements Iterator<ParkSlot>{
        private LocalTime actual = apertura;
        @Override
        public boolean hasNext(){
            return actual.isBefore(cierre);
        }
        @Override
        public ParkSlot next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            ParkSlot parkSlotToReturn = new ParkSlot(nombre, actual);
            actual = actual.plusMinutes(minSlot);
            return parkSlotToReturn;
        }
    }
}
