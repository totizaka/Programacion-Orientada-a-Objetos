package poo.Guias.Guia4.ej6;

public abstract class BinaryExpression extends Expression{
    public abstract boolean evaluate();

    protected Expression expression1, expression2;

     public BinaryExpression(Expression expression1, Expression expression2){
         this.expression1=expression1;
         this.expression2=expression2;
     }
}
