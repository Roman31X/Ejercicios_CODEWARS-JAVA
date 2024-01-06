package com.Ejercicio.Kyu8.MultiplicarNumerosDeArray;

public class MultiplicarArrays {
    public static int multiplicarArrays(int[] x){
        int acumulador = 1;
        for (int i = 0; i < x.length; i++) {
            acumulador = acumulador * x[i];
        }
        return acumulador;
   }
}
