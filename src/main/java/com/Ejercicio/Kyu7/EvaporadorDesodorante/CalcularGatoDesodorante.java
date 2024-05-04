package com.Ejercicio.Kyu7.EvaporadorDesodorante;

public class CalcularGatoDesodorante {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double remainingPercentage = 100.0;
        double thresholdContent = content * (threshold / 100);

        while (content > thresholdContent) {
            content -= content * (evap_per_day / 100);
            days++;
        }

        return days;
    }
}
