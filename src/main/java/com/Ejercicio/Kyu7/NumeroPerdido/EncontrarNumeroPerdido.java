package com.Ejercicio.Kyu7.NumeroPerdido;

public class EncontrarNumeroPerdido {
    public static int stray(int[] numbers) {
        int result = 0;

        for (int num : numbers) {
            result ^= num;
        }

        return result;
    }
}
