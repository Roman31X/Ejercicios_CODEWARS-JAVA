package com.Ejercicio.Kyu7.SumaDeUnaSeuencia;

public class CalcularSumaSecuencia {
    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }

        int sum = 0;

        for (int i = start; i <= end; i += step) {
            sum += i;
        }

        return sum;
    }
}
