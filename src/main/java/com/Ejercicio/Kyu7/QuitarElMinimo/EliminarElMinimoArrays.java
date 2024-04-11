package com.Ejercicio.Kyu7.QuitarElMinimo;

public class EliminarElMinimoArrays {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length <= 1) {
            return new int[0];
        }

        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int[] result = new int[numbers.length - 1];

        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != minIndex) {
                result[j++] = numbers[i];
            }
        }

        return result;
    }
}
