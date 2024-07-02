package poo.Guias.Guia4.ej10;

public class AlreadyExistsFriendException extends Exception{
    private static final String MESSAGE = "Error for number %s: Friend already exists";

    public AlreadyExistsFriendException(String number) {
        super(MESSAGE.formatted(number));
    }
}
