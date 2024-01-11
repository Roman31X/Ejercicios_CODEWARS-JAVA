package com.Ejercicio.Kyu8.SumaPositivosArray;

public class CalcularSumaArray {
    public static int sumarPositivos(int[] arr){
        int sumaPositiva = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                sumaPositiva += arr[i];
            }
        }
        return sumaPositiva;
    }
}
