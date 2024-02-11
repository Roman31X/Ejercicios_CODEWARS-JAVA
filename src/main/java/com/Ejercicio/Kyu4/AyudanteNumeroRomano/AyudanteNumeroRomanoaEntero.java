package com.Ejercicio.Kyu4.AyudanteNumeroRomano;

import java.util.HashMap;
import java.util.Map;

public class AyudanteNumeroRomanoaEntero {

    private static final Map<Character, Integer> ROMAN_TO_INT = new HashMap<>();
    static {
        ROMAN_TO_INT.put('I', 1);
        ROMAN_TO_INT.put('V', 5);
        ROMAN_TO_INT.put('X', 10);
        ROMAN_TO_INT.put('L', 50);
        ROMAN_TO_INT.put('C', 100);
        ROMAN_TO_INT.put('D', 500);
        ROMAN_TO_INT.put('M', 1000);
    }

    public static String toRoman(int n) {
        if (n < 1 || n >= 4000) {
            throw new IllegalArgumentException("Input out of range");
        }

        StringBuilder roman = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumeral.charAt(i);
            int currentValue = ROMAN_TO_INT.get(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}
