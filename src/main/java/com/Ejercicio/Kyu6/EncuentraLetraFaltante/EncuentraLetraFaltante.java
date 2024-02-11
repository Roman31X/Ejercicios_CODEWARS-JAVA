package com.Ejercicio.Kyu6.EncuentraLetraFaltante;

public class EncuentraLetraFaltante {
    public static char letraFaltante(char[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        throw new IllegalArgumentException("Input array is invalid or does not contain a missing letter.");
    }
}
