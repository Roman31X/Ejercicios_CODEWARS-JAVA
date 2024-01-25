package com.Ejercicio.Kyu6.CadenasConsecutivas;

public class CadenaArrayConsecutiva {
    public static String tamanioConsecutivo(String[] strarr, int k){
        int n = strarr.length;

        if (n == 0 || k > n || k <= 0) {
            return "";
        }

        String longestString = "";

        for (int i = 0; i <= n - k; i++) {
            StringBuilder currentConcatenation = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                currentConcatenation.append(strarr[j]);
            }

            if (currentConcatenation.length() > longestString.length()) {
                longestString = currentConcatenation.toString();
            }
        }

        return longestString;
    }
}
