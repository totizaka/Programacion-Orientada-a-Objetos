package poo.Guias.Guia5.ej8;

import java.util.Objects;
import java.util.Comparator;

public class Pair<A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair<A,B>>{
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

    public A getVar1() {
        return var1;
    }

    public B getVar2() {
        return var2;
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
    @Override
    public int compareTo(Pair<A,B> o) {
        int var1Diff = this.var1.compareTo(o.var1);
        if (var1Diff != 0) {
            return var1Diff;
        }
        return this.var2.compareTo(o.var2);
    }
}
