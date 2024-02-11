package com.Ejercicio.Kyu4.NumeroMayorMismosDigitos;

import java.util.Arrays;

public class MayorNumeroMismoDigitos {
    public static long siguienteMayorDigito(long n){
        char[] digits = String.valueOf(n).toCharArray();

        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i == -1) {
            return -1;
        }

        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        reverse(digits, i + 1, digits.length - 1);

        long result = Long.parseLong(new String(digits));

        return result;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
