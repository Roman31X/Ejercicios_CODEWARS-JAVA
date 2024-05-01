package com.Ejercicio.Kyu8.EncontrarMultiplosNumero;

import java.util.*;

public class CalcularMultiplosNumero {
    public static int[] find(int base, int limit) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = base; i <= limit; i += base) {
            multiples.add(i);
        }

        int[] result = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            result[i] = multiples.get(i);
        }

        return result;
    }
}
