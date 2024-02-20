package com.Ejercicio.Kyu6.RanaSaltando;

public class CalcularRanaSaltante {
    public static int solution(int[] a) {
        int currentPosition = 0;
        int jumps = 0;

        while (currentPosition >= 0 && currentPosition < a.length) {
            int jumpLength = a[currentPosition];

            if (jumpLength == 0) {
                return -1;
            }

            currentPosition += jumpLength;
            jumps++;

            if (jumps > a.length) {
                return -1;
            }
        }

        return jumps;
    }
}
