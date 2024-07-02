package poo.Parciales.P1.C2_2023.ej3;

public interface ReportCollection<R>{
    void add(R report);
    R get(int index);
    R[] reports();
}
