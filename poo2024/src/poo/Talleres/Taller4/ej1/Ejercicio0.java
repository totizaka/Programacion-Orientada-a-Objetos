package poo.Talleres.Taller4.ej1;

public class Ejercicio0{
    public static void  main(String[] args){

        IntegerList iList = null;
        iList.add(1);
        iList.add(2);
        iList.add(3);

        StringList slist = null;
        slist.add("hola");

        ObjectList oList= null;
        oList.add("hola");
        oList.add(1.5);

        int pos = iList.getPosition(2);

        iList.remove(2);

        iList.isEmpty();

        List<Integer> list = null; //se le puede poner cualquier cosa
        list.add(3);
    }
}
