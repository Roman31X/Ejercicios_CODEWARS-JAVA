package com.Ejercicio.Kyu8.EliminandoElementos;

public class EliminarElementoLista {
    public static Object[] removeEveryOther(Object[] arr) {
        int newSize = (arr.length + 1) / 2;

        Object[] result = new Object[newSize];

        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            result[j] = arr[i];
        }

        return result;
    }
}
