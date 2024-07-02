package poo.Talleres.Taller7.ej1;

public class SimpleArrayListTester {
    public static void main(String[] args) {
        SimpleList<Integer> list1 = new SimpleArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        SimpleList<Integer> list2 = list1.map(c->c*2);

        for(Integer e : list2){
            System.out.println(e);
        }
    }
}
