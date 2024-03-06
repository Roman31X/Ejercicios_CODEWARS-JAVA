package com.Ejercicio.Kyu5.NumeroCerosFinales;

public class ContarCerosFinales {
    public static int zeros(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
