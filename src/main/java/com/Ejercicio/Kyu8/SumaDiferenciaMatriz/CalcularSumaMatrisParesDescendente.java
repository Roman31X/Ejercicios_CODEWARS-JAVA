package com.Ejercicio.Kyu8.SumaDiferenciaMatriz;

import java.util.Arrays;

public class CalcularSumaMatrisParesDescendente {
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }

        return sum;
    }
}
