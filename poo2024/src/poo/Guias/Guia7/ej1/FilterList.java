package poo.Guias.Guia7.ej1;

import poo.Talleres.Taller4.ej2.ListEj2;

import java.util.List;

public interface FilterList<T> extends List<T> {
    FilterList<T> applyCriteria(Criteria<T> criteria);
}
