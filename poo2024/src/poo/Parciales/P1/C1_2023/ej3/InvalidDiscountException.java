package poo.Parciales.P1.C1_2023.ej3;

public class InvalidDiscountException extends RuntimeException{
    private static final String MESSAGE = "Invalid Discount for Brand %s";
    public InvalidDiscountException(String brand) {
        super(MESSAGE.formatted(brand));
    }
}
