package com.Ejercicio.Kyu7.PoderDeDos;

public class CalcularPoder {
    public static boolean isPowerOfTwo(long n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
