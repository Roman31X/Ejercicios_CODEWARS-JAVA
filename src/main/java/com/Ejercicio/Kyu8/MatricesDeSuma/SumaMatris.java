package com.Ejercicio.Kyu8.MatricesDeSuma;

public class SumaMatris {
    public static double sumaMatrsi(double[] numbers){
        double suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma+=numbers[i];
        }
        return suma;
    }
}
