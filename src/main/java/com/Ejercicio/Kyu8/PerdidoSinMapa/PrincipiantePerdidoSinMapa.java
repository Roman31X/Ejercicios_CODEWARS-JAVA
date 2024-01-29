package com.Ejercicio.Kyu8.PerdidoSinMapa;

public class PrincipiantePerdidoSinMapa {
    public static int[] mapa(int[] arr){
        int[] nuevo = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nuevo[i] = arr[i] * 2;
        }
        return nuevo;
    }
}
