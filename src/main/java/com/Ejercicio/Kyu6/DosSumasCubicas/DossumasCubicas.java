package com.Ejercicio.Kyu6.DosSumasCubicas;

public class DossumasCubicas {
    public static boolean hasTwoCubeSums(int n) {
        int limit = (int) Math.cbrt(n);

        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                int sum1 = a * a * a + b * b * b;

                for (int c = a + 1; c <= limit; c++) {
                    for (int d = c + 1; d <= limit; d++) {
                        int sum2 = c * c * c + d * d * d;

                        if (sum1 == n && sum2 == n && a != c && a != d && b != c && b != d) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
