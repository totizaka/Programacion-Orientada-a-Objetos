package poo.Guias.Guia3.ej6;

public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(12d, 5);
        ComplexNumber c2 = new ComplexNumber(10);
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equals(new ComplexNumber(12, 5))); // true
        System.out.println(c1.complexPlus(c2)); // 22.00 + 5.00
        System.out.println(c1.complexPlus(-3)); // 9.00 + 5.00
        System.out.println(c1.complexPlus((double) -3)); // 9.00 + 5.00
    }
}
