package com.Ejercicio.Kyu8.NoHayCerosParaHeroes;

public class QuitarUltimosCerosNumeros {
    public static int noBoringZeros(int n) {
        if (n == 0) {
            return 0;
        }

        while (n % 10 == 0) {
            n /= 10;
        }

        return n;
    }
}
