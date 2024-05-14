package com.Ejercicio.Kyu7.FiltrarElNumero;

public class FiltrarNumeroCadena {
    public static long filterString(final String value) {
        StringBuilder number = new StringBuilder();

        for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }
        }

        return Long.parseLong(number.toString());
    }
}
