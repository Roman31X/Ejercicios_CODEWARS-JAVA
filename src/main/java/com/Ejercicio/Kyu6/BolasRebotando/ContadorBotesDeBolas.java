package com.Ejercicio.Kyu6.BolasRebotando;

public class ContadorBotesDeBolas {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int count = 0;
        while (h > window) {
            count++;

            h *= bounce;
            if (h > window) {
                count++;
            }
        }

        return count;
    }
}
