package poo.Guias.Guia5.ej15;
import java.util.Arrays;

public class CyclicWindowIteratorTester {
    public static void main(String[] args) {
        String[] words = new String[]{"hola", "que", "tal"};
        CyclicWindowIterator<String> iterator = new CyclicWindowIterator<>(words, 2);
        for(int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(iterator.next()));
        }
        Integer[] empty = new Integer[0];
        CyclicWindowIterator<Integer> emptyIterator = new CyclicWindowIterator<>(empty, 2);
        System.out.println(emptyIterator.hasNext());
        try {
            emptyIterator.next();
        } catch (Exception ex) {
            System.out.println(ex.getClass());
        }
    }
}
