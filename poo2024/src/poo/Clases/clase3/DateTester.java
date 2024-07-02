package poo.Clases.clase3;

public class DateTester {

    public static void main(String[] args){
        Date d1 = new Date(1,2,2018);
        Date d2 = new Date(1,2,2018);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals("Hola"));

        System.out.println(d1);
        System.out.println(d2);
    }
}
