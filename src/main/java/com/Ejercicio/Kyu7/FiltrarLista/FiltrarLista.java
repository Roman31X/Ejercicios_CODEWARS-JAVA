package com.Ejercicio.Kyu7.FiltrarLista;

import java.util.List;
import java.util.stream.Collectors;

public class FiltrarLista {
    public static List<Object> filtroLista(final List<Object> list){
        List<Object> filteredList = list.stream()
                .filter(element -> element instanceof Integer)
                .map(element -> (Integer) element)
                .collect(Collectors.toList());
        return filteredList;
    }
}
