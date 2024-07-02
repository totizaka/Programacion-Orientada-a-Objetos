package poo.Guias.Guia2.ej3;

public class Deletrear {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++) {
            int j=0;
            for (; j < args[i].length()-1; j++) {
                System.out.print(args[i].charAt(j) + "-");
            }
            System.out.println(args[i].charAt(j));
        }
    }
}
