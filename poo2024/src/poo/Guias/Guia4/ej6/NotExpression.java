package poo.Guias.Guia4.ej6;

public class NotExpression extends Expression{
    private Expression expression;
    public NotExpression(Expression expression){
        this.expression = expression;
    }
    @Override
    public boolean evaluate(){
        return !expression.evaluate();
    }
}
