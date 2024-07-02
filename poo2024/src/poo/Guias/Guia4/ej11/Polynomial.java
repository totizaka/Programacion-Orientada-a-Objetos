package poo.Guias.Guia4.ej11;

public class Polynomial {
    private int grade;
    private double[] polynomial;

    public Polynomial(int grade) throws InvalidGradeException{
        if (grade<0){
            throw new InvalidGradeException();
        }
        this.polynomial = new double[grade+1];
    }
    public void set(int index, double value) throws InvalidIndexException{
        if (index<0 || index > polynomial.length){
            throw new InvalidIndexException();
        }
        polynomial[index]=value;
    }

    public double eval(int value){
        double answer=0;
        for (int i = 0; i < polynomial.length; i++) {
            answer += polynomial[i] * Math.pow(value, i);
        }
        return answer;
    }
}
