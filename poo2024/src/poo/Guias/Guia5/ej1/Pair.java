package poo.Guias.Guia5.ej1;

import java.util.Objects;

public class Pair<A,B> {
    private A var1;
    private B var2;

    public Pair(A var1, B var2){
        this.var1=var1;
        this.var2=var2;
    }

    public void setVar1(A var1){
        this.var1 = var1;
    }
    public void setVar2(B var2){
        this.var2 = var2;
    }

@Override
    public String toString(){
        return "[ %s, %s ]".formatted(var1,var2);
}
@Override
    public boolean equals(Object o){
        return o instanceof Pair<?, ?>pair &&
                this.var1.equals(pair.var1) &&
                this.var2.equals(pair.var2);
}
    @Override
    public int hashCode() {
        return Objects.hash(var1, var2);
    }

}
