package com.Ejercicio.Kyu4.NumeroMayorMismosDigitos;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class MayorNumeroMismoDigitos {
    public static long siguienteMayorDigito(long n){
        int di = Long.valueOf(n).intValue();;
        char[] digits = Integer.toString(di).toCharArray();
        int nu = digits.length;

        // Encontrar el primer par de dígitos consecutivos en orden descendente
        int i;
        for (i = nu - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }

        // Si no hay tal par, entonces no se puede formar un número mayor
        if (i == -1) {
            return -1;
        }

        // Encontrar el dígito más pequeño a la derecha del dígito encontrado previamente
        int j;
        for (j = nu - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                break;
            }
        }

        // Intercambiar los dígitos encontrados
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Ordenar los dígitos a la derecha del dígito encontrado previamente en orden ascendente
        Arrays.sort(digits, i + 1, nu);

        // Construir el número resultante
        int result = Integer.parseInt(new String(digits));

        return result;
    }
}
