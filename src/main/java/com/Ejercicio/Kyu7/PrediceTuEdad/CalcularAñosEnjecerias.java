package com.Ejercicio.Kyu7.PrediceTuEdad;

import java.util.*;

public class CalcularAñosEnjecerias {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] agesSquared = {age1 * age1, age2 * age2, age3 * age3, age4 * age4, age5 * age5, age6 * age6, age7 * age7, age8 * age8};
        int sum = Arrays.stream(agesSquared).sum();

        double result = Math.sqrt(sum) / 2;

        return (int) Math.floor(result);
    }
}
