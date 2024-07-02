package poo.Parciales.P1.Repaso.ej3;

public class Pizzatester {
    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate
        Topppings[] topppings1 = new Topppings[1];
        topppings1[0]=Topppings.TOMATE;
        Pizza pizza1 = new PizzaParrilla(topppings1);
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Topppings[] topppings2 = new Topppings[3];
        topppings2[0]=Topppings.CEBOLLA;
        topppings2[1]=Topppings.EXTRAQUESO;
        topppings2[2]=Topppings.TOMATE;
        Pizza pizza2 = new PizzaParrilla(topppings2);
        // Pizza al horno con Cebolla con Extra queso
        Topppings[] topppings3 = new Topppings[2];
        topppings3[0]=Topppings.CEBOLLA;
        topppings3[1]=Topppings.EXTRAQUESO;
        Pizza pizza3 = new PizzaHorno(topppings3);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
