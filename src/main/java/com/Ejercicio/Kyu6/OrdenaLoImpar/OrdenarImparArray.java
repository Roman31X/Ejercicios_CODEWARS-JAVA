package com.Ejercicio.Kyu6.OrdenaLoImpar;

import java.util.Arrays;

public class OrdenarImparArray {
    public static int[] ordenarImpar(int[] array){
        int contador = 0,p = 0, j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0){
                contador++;
            }
        }

        int[] auxiliar = new int[contador];
        for (int i=0;i < array.length; i++) {
            if(array[i]%2 !=0){
                auxiliar[p] = array[i];
                p++;
            }
        }

        Arrays.sort(auxiliar);
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0){
                array[i] = auxiliar[j];
                j++;
            }
        }
        return array;
    }
}
