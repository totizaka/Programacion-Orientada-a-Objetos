package poo.Guias.Guia5.ej8;
import java.util.Arrays;
import java.util.Comparator;

public class PairTester {
    public static void main(String[] args) {
        Pair<String, String> stringPair1 = new Pair<>("hola", "mundo");
        Pair<String, String> stringPair2 = new Pair<>("hola", "adiós");
        Pair<String, String> stringPair3 = new Pair<>("buen", "día");
        Pair[] pairArray = new Pair[]{stringPair1, stringPair2, stringPair3};
        Arrays.sort(pairArray, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                int var1Diff = o2.getVar1().compareTo(o1.getVar1());
                if (var1Diff != 0) {
                    return var1Diff;
                }
                return o2.getVar2().compareTo(o1.getVar2());
            }
        });
        System.out.println(Arrays.toString(pairArray));
    }
}
