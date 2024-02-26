package com.Ejercicio.Kyu7.ErrorImpresora;

public class ErroresDeImpresora {
    public static String printerError(String s) {
        int errorCount = 0;
        int totalChars = s.length();

        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'm') {
                errorCount++;
            }
        }

        return errorCount + "/" + totalChars;
    }
}
