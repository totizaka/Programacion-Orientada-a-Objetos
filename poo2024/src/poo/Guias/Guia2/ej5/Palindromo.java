package poo.Guias.Guia2.ej5;

public class Palindromo {
    public static void main(String[] args){
        String word="";
        for (int i = 0; i < args.length; i++) {
            word = word.concat(args[i]).toLowerCase();
        }
        if (esPalindromo(word)){
            System.out.println("es Palindromo");
        }
        else{
            System.out.println("no es Palindromo");
        }
    }

    private static boolean esPalindromo(String word){
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
