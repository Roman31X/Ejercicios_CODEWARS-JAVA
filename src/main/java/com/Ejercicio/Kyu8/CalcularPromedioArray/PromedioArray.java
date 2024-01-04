package com.Ejercicio.Kyu8.CalcularPromedioArray;

public class PromedioArray {
    public static double encontrar_promedio(int[] array){
        int acumulador = 0;
        for (int i = 0; i < array.length; i++) {
            acumulador+=array[i];
        }
        return acumulador/array.length;
    }
}
