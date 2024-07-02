package poo.Parciales.P1.C2_2021.ej1;

import java.util.function.Predicate;

public class MatchElement<T>{
    private T element;
    private boolean match;
    public MatchElement(T element, boolean match){
        this.element=element;
        this.match=match;
    }
    public boolean matches(){
        return match;
    }
    @Override
    public String toString(){
        return "### %s : %s ###".formatted(element, match ? "Match" : "No match");
    }
}
