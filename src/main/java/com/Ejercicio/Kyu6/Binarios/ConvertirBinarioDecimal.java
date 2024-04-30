package com.Ejercicio.Kyu6.Binarios;

public class ConvertirBinarioDecimal {
    public static String code(String strng) {
        StringBuilder result = new StringBuilder();

        for (char c : strng.toCharArray()) {
            String binary = Integer.toBinaryString(Character.getNumericValue(c));
            int numBits = binary.length();

            result.append("0".repeat(numBits - 1)).append("1").append(binary);
        }

        return result.toString();
    }

    public static String decode(String strng) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < strng.length()) {
            int numZeroes = 0;

            while (strng.charAt(i) == '0') {
                numZeroes++;
                i++;
            }

            i++;

            String binary = strng.substring(i, i + numZeroes + 1);
            int decimal = Integer.parseInt(binary, 2);
            result.append(decimal);

            i += numZeroes + 1;
        }

        return result.toString();
    }
}
