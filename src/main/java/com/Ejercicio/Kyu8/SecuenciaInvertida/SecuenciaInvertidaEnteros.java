package com.Ejercicio.Kyu8.SecuenciaInvertida;

public class SecuenciaInvertidaEnteros {
    public static int[] reverso(int n){
        int[] inverso = new int[n];
        for (int i = n, j = 0; i > 0 ; i--,j++) {
            inverso[j] = i;
        }
        return inverso;
    }
}
