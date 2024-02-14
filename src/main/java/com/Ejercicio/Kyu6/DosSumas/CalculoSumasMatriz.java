package com.Ejercicio.Kyu6.DosSumas;

import java.util.HashMap;
import java.util.Map;

public class CalculoSumasMatriz {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(numbers[i], i);
        }

        // No se espera que llegue a este punto debido a la garantía de entrada válida
        return null;
    }
}
