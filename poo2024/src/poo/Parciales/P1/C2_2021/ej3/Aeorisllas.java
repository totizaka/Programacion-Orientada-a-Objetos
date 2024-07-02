package poo.Parciales.P1.C2_2021.ej3;

public enum Aeorisllas {
    AMANCAY(true),
    HORSETOOTH(false),
    SIXFOLD(true);
    private boolean onlySki;
    Aeorisllas(boolean onlySki){
        this.onlySki=onlySki;
    }
    public boolean isForVisitor(){
        return !onlySki;
    }
}
