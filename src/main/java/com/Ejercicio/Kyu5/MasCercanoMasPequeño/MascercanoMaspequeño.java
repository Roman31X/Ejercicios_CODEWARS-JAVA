package com.Ejercicio.Kyu5.MasCercanoMasPequeño;

import java.util.Arrays;

public class MascercanoMaspequeño {
    public static int[][] closest(String strng){
        if (strng == null || strng.isEmpty()) {
            return new int[0][];
        }

        String[] numbers = strng.split(" ");
        int[][] result = new int[2][3];
        int[] weights = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            weights[i] = calculateWeight(numbers[i]);
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int difference = Math.abs(weights[i] - weights[j]);
                if (difference < minDifference || (difference == minDifference && weights[j] < result[1][0])) {
                    minDifference = difference;
                    result[0] = new int[]{weights[i], i, Integer.parseInt(numbers[i])};
                    result[1] = new int[]{weights[j], j, Integer.parseInt(numbers[j])};
                }
            }
        }

        Arrays.sort(result, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        return result;
    }
    private static int calculateWeight(String number) {
        int weight = 0;
        for (char digit : number.toCharArray()) {
            weight += Character.getNumericValue(digit);
        }
        return weight;
    }
}
