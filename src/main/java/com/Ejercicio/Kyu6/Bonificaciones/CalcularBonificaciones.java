package com.Ejercicio.Kyu6.Bonificaciones;

import java.util.Arrays;

public class CalcularBonificaciones {
    public static long[] bonus(int[] arr, long s){
        long totalDays = 0;
        for (int days : arr) {
            totalDays += days;
        }

        long[] bonuses = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            bonuses[i] = Math.round((double) arr[i] * s / totalDays);
        }

        return bonuses;
    }
}
