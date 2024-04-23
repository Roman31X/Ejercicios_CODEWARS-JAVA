package com.Ejercicio.Kyu8.EnceuntraPrimerNumeroConsecutivo;

public class CalcularNumeroConsecutivo {
    public static Integer find(final int[] array) {
        if (array.length <= 1) {
            return null; // Retorna null si el array está vacío o tiene un solo elemento
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i]; // Retorna el primer elemento no consecutivo encontrado
            }
        }

        return null;
    }
}
