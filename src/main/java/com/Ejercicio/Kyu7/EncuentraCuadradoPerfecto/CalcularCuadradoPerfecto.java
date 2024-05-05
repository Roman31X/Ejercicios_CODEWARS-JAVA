package com.Ejercicio.Kyu7.EncuentraCuadradoPerfecto;

public class CalcularCuadradoPerfecto {
    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        if (root * root != sq) {
            return -1;
        }
        long nextRoot = root + 1;
        return nextRoot * nextRoot;
    }
}
