package poo.Guias.Guia6.ej3;

public class Pair<E>{
    private final E left;
    private final E right;

    public Pair(E left, E right){
        this.left=left;
        this.right=right;
    }
    @Override
    public String toString(){
        return "# %s + %s #".formatted(left,right);
    }
}
