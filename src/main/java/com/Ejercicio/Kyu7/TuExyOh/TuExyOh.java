package com.Ejercicio.Kyu7.TuExyOh;

public class TuExyOh {
    public static boolean getXO (String str) {
        if (str == null || str.isEmpty()) {
            return true; // Si la cadena está vacía, se considera que la cantidad de 'x' y 'o' es la misma.
        }

        int countX = 0;
        int countO = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'x') {
                countX++;
            } else if (c == 'o') {
                countO++;
            }
        }

        return countX == countO;
    }
}
