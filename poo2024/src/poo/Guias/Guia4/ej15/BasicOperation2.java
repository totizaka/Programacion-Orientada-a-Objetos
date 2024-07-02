package poo.Guias.Guia4.ej15;

public enum BasicOperation2 implements Operation2{
    SUMA("+", (x, y) -> x+y),
    RESTA("-", (x, y) -> x-y),
    MULTIPLICACION("*", (x, y) -> x*y),
    DIVISION("/", (x, y) -> x/y);
    private final String symbol;
    private final Operation2 operation;

    BasicOperation2(String symbol, Operation2 operation){
        this.symbol=symbol;
        this.operation=operation;
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
