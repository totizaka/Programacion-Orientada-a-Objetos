package poo.Guias.Guia5.ej3.parte1;

public class LinearListTester {
    public static void main(String[] args) {
        LinearList<Integer> IntegerList = new LinearListImp();
        IntegerList.add(1);
        IntegerList.add(3);
        IntegerList.add(5);
        IntegerList.add(15);
        IntegerList.get(2);
        IntegerList.add(20);
        IntegerList.set(2, 13);
        IntegerList.remove(1);
        IntegerList.indexOf(20);
        IntegerList.size();
        System.out.println(IntegerList.size());
        System.out.println(IntegerList.get(3));
    }
}
