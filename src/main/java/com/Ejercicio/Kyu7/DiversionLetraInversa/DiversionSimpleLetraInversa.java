package com.Ejercicio.Kyu7.DiversionLetraInversa;

public class DiversionSimpleLetraInversa {
    public static String reverseLetter(final String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                reversed.append(c);
            }
        }

        return reversed.toString();
    }
}
