package poo.Guias.Guia4.ej15;

public enum BasicOperation implements Operation{

    SUMA("+"){
        @Override
        public double apply(double x, double y){
            return x+y;
        }
    },
    RESTA("-"){
        @Override
        public double apply(double x, double y){
            return x-y;
        }
    },
    DIVISION("/"){
        @Override
        public double apply(double x, double y){
            return x/y;
        }
    },
    MULTIPLICACION("*"){
        @Override
        public double apply(double x, double y){
            return x*y;
        }
    };
    private final String symbol;
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString(){
        return symbol;
    }
}
