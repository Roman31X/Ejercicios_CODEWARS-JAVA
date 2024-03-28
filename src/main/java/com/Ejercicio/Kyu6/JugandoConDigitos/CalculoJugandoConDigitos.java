package com.Ejercicio.Kyu6.JugandoConDigitos;

public class CalculoJugandoConDigitos {
    public static long digPow(int n, int p) {
        String numStr = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numStr.charAt(i)), p + i);
        }
        if (sum % n == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }
}
