package com.Ejercicio.Kyu7.SumaEnesimaTerminoSerie;

public class CalcularTerminoEnesimoSerie {
    public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        double result = 1.0;
        double denominator = 4.0;

        for (int i = 2; i <= n; i++) {
            result += 1.0 / denominator;
            denominator += 3.0;
        }

        return String.format("%.2f", result);
    }
}
