package poo.Guias.Guia5.ej11;
import java.util.Arrays;
import java.util.Comparator;

public class ContinentTester {
    public static void main(String[] args) {
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
        Arrays.sort(continents);
        for(Continent continent : continents) {
            System.out.println(continent);
        }
        Arrays.sort(continents, ((o1, o2) -> Double.compare(o1.getPopulationRatio(), o2.getPopulationRatio())));
        for (int i=0; i< continents.length; i++){
            System.out.println(continents[i]);
        }
    }
}
