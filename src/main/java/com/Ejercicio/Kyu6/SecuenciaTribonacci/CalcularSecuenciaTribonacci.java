package com.Ejercicio.Kyu6.SecuenciaTribonacci;

public class CalcularSecuenciaTribonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[0];
        }

        double[] result = new double[n];
        if (n >= 1) {
            result[0] = s[0];
        }
        if (n >= 2) {
            result[1] = s[1];
        }
        if (n >= 3) {
            result[2] = s[2];
        }

        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        return result;
    }
}
