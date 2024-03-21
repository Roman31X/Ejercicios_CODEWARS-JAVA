package com.Ejercicio.Kyu5.ProductoNumeroConsecutivo;

public class CalcularFibConsecutivo {
    public static long[] productFib(long prod) {
        long fib1 = 0;
        long fib2 = 1;

        while (fib1 * fib2 < prod) {
            long nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }

        if (fib1 * fib2 == prod) {
            return new long[]{fib1, fib2, 1};
        } else {
            return new long[]{fib1, fib2, 0};
        }
    }
}
