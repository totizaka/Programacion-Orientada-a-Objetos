package poo.Guias.Guia4.ej11;

public class InvalidGradeException extends Exception{
    private static final String MESSAGE = "Grado Invalido";
    public InvalidGradeException(){
        super(MESSAGE);
    }
}
