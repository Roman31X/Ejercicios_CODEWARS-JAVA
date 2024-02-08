package com.Ejercicio.Kyu8.QueHayEntre;

import java.util.*;

public class NumerosEntre {
    public static int[] entre(int a, int b){
        List<Integer> numeros = new ArrayList<>();
        for (int i = a; i <= b ; i++) {
            numeros.add(i);
        }
        int[] entre = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            entre[i] = numeros.get(i);
        }
        return entre;
    }
}
