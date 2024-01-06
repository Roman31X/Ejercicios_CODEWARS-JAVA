package com.Ejercicio.Kyu7.Par_o_Impar;

public class VerificarSumaParImpar {
    public static String sumaParImpar(int[] array){
        int acumulador = 0;
        if(array.length == 0){
            return "even";
        }else {
            for (int i = 0; i < array.length; i++) {
                acumulador+=array[i];
            }
        }
        if(acumulador % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}
