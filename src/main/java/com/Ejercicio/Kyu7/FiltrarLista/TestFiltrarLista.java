package com.Ejercicio.Kyu7.FiltrarLista;

import java.util.List;

import static com.Ejercicio.Kyu7.FiltrarLista.FiltrarLista.filtroLista;

public class TestFiltrarLista {
    public static void main(String[] args) {
        System.out.println("Prueba de Filtrado de lista");
        List<Object> Lista1 = filtroLista(List.of(1, 2, "a", "b"));
        System.out.println("List [1, 2, \"a\", \"b\"] : Filtrar : ");
        for (int i = 0; i < Lista1.size(); i++) {
            System.out.println(Lista1.get(i));
        }
        System.out.println("|*******************************|");
        List<Object> Lista2 = filtroLista(List.of(1, "a", "b", 0, 15));
        System.out.println("List [1, \"a\", \"b\", 0, 15] : Filtrar : ");
        for (int i = 0; i < Lista2.size(); i++) {
            System.out.println(Lista2.get(i));
        }
        System.out.println("|*******************************|");
        List<Object> Lista3 = filtroLista(List.of(1, 2, "aasf", "1", "123", 123));
        System.out.println("List [1, 2, \"aasf\", \"1\", \"123\", 123] : Filtrar : ");
        for (int i = 0; i < Lista3.size(); i++) {
            System.out.println(Lista3.get(i));
        }
    }
}
