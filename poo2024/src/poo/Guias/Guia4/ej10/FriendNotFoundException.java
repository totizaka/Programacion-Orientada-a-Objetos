package poo.Guias.Guia4.ej10;

public class FriendNotFoundException extends Exception{
    private static final String MESSAGE = "Error for number %s: Friend not found";

    public FriendNotFoundException(String number) {
        super(MESSAGE.formatted(number));
    }
}
