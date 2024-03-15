package com.Ejercicio.Kyu6.EncuentraIntImpar;

import java.util.*;

public class EncontrarIntImpart {
    public static int findIt(int[] a) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : a) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
