package com.Ejercicio.Kyu7.SumaParMasGrandeMatriz;

public class CalcularSumaParMasGrandeMatriz {
    public static int largestPairSum(int[] numbers){
        if (numbers.length < 2) {
            throw new IllegalArgumentException("La secuencia debe contener al menos dos elementos.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Encontrar los dos números más grandes en la secuencia
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        // Sumar los dos números más grandes
        return largest + secondLargest;
    }
}
