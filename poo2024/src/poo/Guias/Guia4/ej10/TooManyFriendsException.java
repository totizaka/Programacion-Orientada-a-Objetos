package poo.Guias.Guia4.ej10;

public class TooManyFriendsException extends Exception{
    private static final String MESSAGE = "Error for number %s: Too many friends";

    public TooManyFriendsException(String number) {
        super(MESSAGE.formatted(number));
    }
}
