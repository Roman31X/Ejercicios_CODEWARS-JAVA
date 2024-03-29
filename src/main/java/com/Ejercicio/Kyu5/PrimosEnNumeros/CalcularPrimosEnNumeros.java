package com.Ejercicio.Kyu5.PrimosEnNumeros;

import java.util.*;

public class CalcularPrimosEnNumeros {
    public static String factors(int n) {
        List<String> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                if (count == 1) {
                    factors.add("(" + i + ")");
                } else {
                    factors.add("(" + i + "**" + count + ")");
                }
            }
        }

        return String.join("", factors);
    }
}
