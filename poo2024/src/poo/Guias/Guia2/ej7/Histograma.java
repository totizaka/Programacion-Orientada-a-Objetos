package poo.Guias.Guia2.ej7;

import com.sun.jdi.IntegerValue;

public class Histograma {
    public static void main(String[] args){
        int max=0;
        int[] decimalValues = new int[10];
        int value=0;
        for (String s : args) {
            int decimal = (Integer.parseInt(s)/10);
            if (decimal >= 10 || decimal < 0) {
                System.out.println("valor incorrecto");
                return;
            }
            decimalValues[decimal]++;
            if (decimalValues[decimal] > max){
                max = decimalValues[decimal];
            }
        }
        imprimirHist(decimalValues, max);
    }

    private static void imprimirHist(int[] decimalValues, int max){
        for (int i = max; i > 0; i--) {
            System.out.print("| ");
            for (int j = 0; j < decimalValues.length; j++) {
                if (decimalValues[j]>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
        for (int i = 0; i < decimalValues.length; i++) {
            System.out.print("+---");
        }
        System.out.println("+");
        for (int i = 0; i < decimalValues.length; i++) {
            System.out.print(i*10+"  ");
        }
        System.out.println("100");
    }
}

