package com.Ejercicio.Kyu7.SuficientePequeño;

public class ComprobarNumerosDebajoLimite {
    public static boolean smallEnough(int[] a, int limit) {
        for (int num : a) {
            if (num > limit) {
                return false;
            }
        }
        return true;
    }
}
