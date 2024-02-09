package com.Ejercicio.Kyu6.Bonificaciones;

import java.util.Arrays;

public class CalcularBonificaciones {
    public static long[] bonus(int[] arr, long s){
        long totalDays = Arrays.stream(arr).asLongStream().sum();
        long[] bonuses = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            bonuses[i] = (long) ((double) arr[i] * s / totalDays);
        }

        long sum = Arrays.stream(bonuses).sum();
        long diff = s - sum;
        // Ajustar la bonificación del primer elemento para corregir la diferencia
        bonuses[0] += diff;

        return bonuses;
    }
}
