package com.Ejercicio.Kyu7.ArreglarCasoDeCuerda;

public class ArreglarCdaenaDeString {
    public static String solve(final String str) {
        int lowerCount = 0;
        int upperCount = 0;

        // Contamos las letras mayúsculas y minúsculas
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCount++;
            } else if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }

        // Decidimos si convertimos a minúsculas o mayúsculas
        if (lowerCount >= upperCount) {
            return str.toLowerCase();
        } else {
            return str.toUpperCase();
        }
    }
}
