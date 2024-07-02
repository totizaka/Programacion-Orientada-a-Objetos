package poo.Guias.Guia6.ej7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej7_V1_Tester {
    public static void main(String[] args) {
        List<Integer> aux = List.of(1,6,7,5,4,3,2);
        System.out.println(new Ej7_V1<Integer>().mayor(aux));
    }
}
