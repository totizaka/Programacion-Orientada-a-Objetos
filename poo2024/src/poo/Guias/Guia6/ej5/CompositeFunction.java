package poo.Guias.Guia6.ej5;

import java.util.ArrayList;
import java.util.List;

public class CompositeFunction implements Function {

    private final List<Function> funciones = new ArrayList<>();
    public void addFunction(Function function){
        funciones.add(function);
    }
    @Override
    public double evaluate(double x){
        double toReturn = x;
        if(funciones.isEmpty()){
            throw new IllegalArgumentException();
        }
        for(Function f : funciones){
            toReturn = f.evaluate(toReturn);
        }
        return toReturn;
    }
}
