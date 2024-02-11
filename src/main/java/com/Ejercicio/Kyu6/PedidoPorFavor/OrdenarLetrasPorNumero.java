package com.Ejercicio.Kyu6.PedidoPorFavor;

import java.util.*;

public class OrdenarLetrasPorNumero {
    public static String order(String words){
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] wordArray = words.split(" ");
        Arrays.sort(wordArray, Comparator.comparing(s -> s.replaceAll("[^0-9]", "")));

        return String.join(" ", wordArray);
    }
}
