package com.Ejercicio.Kyu4.FuncionMisteriosa;

public class CalcularFuncionMisteriosa {
    public static long mystery(long n) {
        if (n == 0) {
            return 0;
        }
        int m = Long.toBinaryString(n).length();
        return generateGrayCode(n, m);
    }

    public static long mysteryInv(long n) {
        if (n == 0) {
            return 0;
        }
        int m = 1;
        while ((1L << m) <= n) {
            m++;
        }
        return generateInverseGrayCode(n, m);
    }

    public static String nameOfMystery() {
        return "Gray Code";
    }

    private static long generateGrayCode(long n, int m) {
        return n ^ (n >> 1);
    }

    private static long generateInverseGrayCode(long n, int m) {
        long inv = n;
        while ((n >>= 1) > 0) {
            inv ^= n;
        }
        return inv;
    }
}
