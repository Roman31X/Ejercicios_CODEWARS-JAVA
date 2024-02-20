package com.Ejercicio.Kyu5.SumaMaximaSubarreglo;

public class CulcularSumaMaximaSubarrego {
    public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return Math.max(maxSum, 0);
    }
}
