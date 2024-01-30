package com.Ejercicio.Kyu6.NumerosDeLucas;

public class CalcularNumeroLucas {
    public static int lucas(int n){
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            int sign = (n < 0 && n % 2 != 0) ? -1 : 1;
            n = Math.abs(n);

            int[] lucasArray = new int[n + 1];
            lucasArray[0] = 2;
            lucasArray[1] = 1;

            for (int i = 2; i <= n; i++) {
                lucasArray[i] = lucasArray[i - 1] + lucasArray[i - 2];
            }

            return sign * lucasArray[n];
        }
    }
}
