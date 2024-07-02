package poo.Guias.Guia4.ej15;

public enum ExtendedOperation2 implements Operation2{
    POTENCIA("^", (x,y) -> Math.pow(x,y)),
    MODULO("%", (x,y) -> x%y);
    private final String symbol;
    private final Operation2 operation;

    ExtendedOperation2(String symbol, Operation2 operation){
        this.operation=operation;
        this.symbol=symbol;
    }
    @Override
    public double apply(double x, double y){
        return operation.apply(x,y);
    }

    @Override
    public String toString(){
        return symbol;
    }
}
