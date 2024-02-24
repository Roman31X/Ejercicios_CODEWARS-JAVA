package com.Ejercicio.Kyu6.EliminarOcurrenciasElementoNVeces;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class EliminarElementosConcurrentesNVeces {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences == 0) {
            return new int[0]; // Devolver un array vacío
        }

        Map<Integer, Integer> occurrences = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : elements) {
            if (!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
                resultList.add(num);
            } else if (occurrences.get(num) < maxOccurrences) {
                occurrences.put(num, occurrences.get(num) + 1);
                resultList.add(num);
            }
        }

        // Convertir la lista de resultados a un array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
