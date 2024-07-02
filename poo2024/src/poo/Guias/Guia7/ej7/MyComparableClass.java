package poo.Guias.Guia7.ej7;

public class MyComparableClass implements Comparable<MyComparableClass>{
    private String name;
    public String sortableIdentifier;
    public MyComparableClass(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name + " - " + "(" + sortableIdentifier + ")";
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return sortableIdentifier.compareTo(o.sortableIdentifier);
    }
}
