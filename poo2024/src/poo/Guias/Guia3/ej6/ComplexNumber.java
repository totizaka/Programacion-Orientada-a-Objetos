package poo.Guias.Guia3.ej6;

import java.util.Objects;
public class ComplexNumber {
    private final double real, imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(Number real){
        this(real.doubleValue(), 0);
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public ComplexNumber complexPlus(ComplexNumber complex){
        return new ComplexNumber(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public ComplexNumber complexPlus(Number n){
        return complexPlus(new ComplexNumber(n));
    }

    @Override
    public String toString(){
        return "%.2f %c %.2f".formatted(real, imaginary > 0 ? '+' : '-', Math.abs(imaginary));
    }

    @Override
    public boolean equals(Object o){
        return o instanceof ComplexNumber that &&
                Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
