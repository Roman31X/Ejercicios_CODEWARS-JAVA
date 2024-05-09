package com.Ejercicio.Kyu6.MalditoPersistente;

public class CalcularPersistencia {
    public static int persistence(long n) {
        int count = 0;

        while (n >= 10) {
            long product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            n = product;
            count++;
        }

        return count;
    }
}
