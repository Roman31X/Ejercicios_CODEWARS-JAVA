package com.Ejercicio.Kyu8.InvertirValores;

public class InvertirValorArraysNumeros {
    public static int[] invertirValorArray(int[] array){
        int[] invetido = new int[array.length];
        if(array.length == 0){
            return array;
        }else{
            for (int i = 0; i < array.length ; i++) {
                if(array[i] > 0){
                    invetido[i]=array[i] * -1;
                }else{
                    invetido[i]=array[i] * -1;
                }
            }
            return invetido;
        }
    }
}
