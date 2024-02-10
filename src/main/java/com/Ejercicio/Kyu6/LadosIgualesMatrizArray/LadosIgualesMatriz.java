package com.Ejercicio.Kyu6.LadosIgualesMatrizArray;

public class LadosIgualesMatriz {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isBalanceIndex(arr, i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isBalanceIndex(int[] arr, int index) {
        int leftSum = 0;
        int rightSum = 0;

        // Calculate the sum of elements to the left of the index
        for (int i = 0; i < index; i++) {
            leftSum += arr[i];
        }

        // Calculate the sum of elements to the right of the index
        for (int i = index + 1; i < arr.length; i++) {
            rightSum += arr[i];
        }

        // Check if the sums are equal
        return leftSum == rightSum;
    }
}
