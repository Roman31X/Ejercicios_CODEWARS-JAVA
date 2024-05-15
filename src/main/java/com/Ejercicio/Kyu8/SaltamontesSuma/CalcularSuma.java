package com.Ejercicio.Kyu8.SaltamontesSuma;

public class CalcularSuma {
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
