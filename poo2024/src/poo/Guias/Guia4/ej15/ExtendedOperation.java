package poo.Guias.Guia4.ej15;

public enum ExtendedOperation implements Operation{
    POTENCIA("^"){
        @Override
        public double apply(double x, double y){
            return Math.pow(x,y);
        }
    },
    MODULO("%"){
        @Override
        public double apply(double x, double y){
            return x%y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol){
        this.symbol = symbol;
    }
    @Override
    public String toString(){
        return symbol;
    }
}
