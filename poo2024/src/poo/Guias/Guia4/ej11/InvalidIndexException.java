package poo.Guias.Guia4.ej11;

public class InvalidIndexException extends Exception{
    private static final String MESSAGE = "Indice Invalido";
    public InvalidIndexException(){
        super(MESSAGE);
    }
}
