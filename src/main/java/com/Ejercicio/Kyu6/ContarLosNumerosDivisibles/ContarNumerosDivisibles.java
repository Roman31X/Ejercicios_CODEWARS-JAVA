package com.Ejercicio.Kyu6.ContarLosNumerosDivisibles;

public class ContarNumerosDivisibles {
    public static long divisibleContador(long x, long y, long k){
        long count = (y / k) - (x / k);
        if (x % k == 0) {
            count++;
        }
        return (long)count;
    }
}
