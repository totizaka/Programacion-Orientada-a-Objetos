package poo.Guias.Guia4.ej15;

public class OperationTester {
    public static void main(String[] args) {
    double x = 4;
    double y = 2;
    for(BasicOperation operation : BasicOperation.values()) {
        System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
    }
    for(ExtendedOperation operation : ExtendedOperation.values()) {
        System.out.printf("%.2f %s %.2f = %.2f\n", x, operation, y, operation.apply(x,y));
    }
}
}
