package poo.Guias.Guia4.ej6;

public class OrExpression extends BinaryExpression{
    public OrExpression(Expression expression1, Expression expression2){
        super(expression1, expression2);
    }
    @Override
    public boolean evaluate(){
        return (expression1.evaluate() || expression2.evaluate());
    }
}
