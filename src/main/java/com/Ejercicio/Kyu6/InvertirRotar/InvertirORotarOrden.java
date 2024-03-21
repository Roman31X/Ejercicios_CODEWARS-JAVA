package com.Ejercicio.Kyu6.InvertirRotar;

public class InvertirORotarOrden {
    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng.isEmpty() || sz > strng.length()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i + sz <= strng.length(); i += sz) {
            String chunk = strng.substring(i, i + sz);
            int sumOfCubes = 0;
            for (char c : chunk.toCharArray()) {
                int digit = Character.getNumericValue(c);
                sumOfCubes += digit * digit * digit;
            }
            if (sumOfCubes % 2 == 0) {
                result.append(new StringBuilder(chunk).reverse());
            } else {
                result.append(chunk.substring(1)).append(chunk.charAt(0));
            }
        }

        return result.toString();
    }
}
