package com.Ejercicio.Kyu7.TrollsDesvocacionales;

public class IdentificarTrollsDesvocacionales {
    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
