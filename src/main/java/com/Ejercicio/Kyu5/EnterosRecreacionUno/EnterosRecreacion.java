package com.Ejercicio.Kyu5.EnterosRecreacionUno;

import java.util.*;

public class EnterosRecreacion {
    public static String listSquared(long m, long n) {
        List<long[]> result = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            long sumOfSquares = getSumOfSquares(i);
            long squareRoot = (long) Math.sqrt(sumOfSquares);

            if (squareRoot * squareRoot == sumOfSquares) {
                result.add(new long[]{i, sumOfSquares});
            }
        }

        return formatResult(result);
    }

    private static long getSumOfSquares(long num) {
        long sum = 0;
        for (long divisor = 1; divisor <= num; divisor++) {
            if (num % divisor == 0) {
                sum += divisor * divisor;
            }
        }
        return sum;
    }

    private static String formatResult(List<long[]> result) {
        StringBuilder formattedResult = new StringBuilder("[");
        for (long[] entry : result) {
            formattedResult.append("[").append(entry[0]).append(", ").append(entry[1]).append("], ");
        }
        if (formattedResult.length() > 1) {
            formattedResult.setLength(formattedResult.length() - 2); // Remove the trailing comma and space
        }
        formattedResult.append("]");
        return formattedResult.toString();
    }
}
