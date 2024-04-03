package com.Ejercicio.Kyu6.ReglaDivisibilidad13;

public class TestUnaReglaDeDivisibilidadPor13 {
    public static long thirt(long n) {
        int[] pattern = {1, 10, 9, 12, 3, 4}; // The repeating sequence

        long result = n;
        long lastResult = 0;

        while (result != lastResult) {
            lastResult = result;
            result = applyPattern(result, pattern);
        }

        return result;
    }

    public static long applyPattern(long n, int[] pattern) {
        long result = 0;
        String numberString = Long.toString(n);
        int patternIndex = 0;

        for (int i = numberString.length() - 1; i >= 0; i--) {
            char digitChar = numberString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            result += digit * pattern[patternIndex % pattern.length];
            patternIndex++;
        }

        return result;
    }
}
