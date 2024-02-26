package com.Ejercicio.Kyu8.ProblemaTuberiasLariMuigi;

import java.util.ArrayList;
import java.util.List;

public class ProblemaTuberiaCompletar {
    public static int[] pipeFix(int[] numbers){
        List<Integer> result = new ArrayList<>();

        if (numbers.length == 0) {
            return new int[0];
        }

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        for (int i = min; i <= max; i++) {
            result.add(i);
        }

        // Convertir la lista de resultados a un array
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
