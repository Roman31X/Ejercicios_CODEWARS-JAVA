package com.Ejercicio.Kyu8.ContarPositivosSumarNegativos;

public class CalcularContadorSuma {
    public static int[] contadorSumador(int[] input){
        int contadorPositivo = 0, sumadorNegativos = 0;
        if(input == null || input.length == 0){
            return new int[]{};
        }else{
            for (int i = 0; i < input.length; i++) {
                if(input[i] > 0){
                    contadorPositivo++;
                }else if(input[i] < 0){
                    sumadorNegativos += input[i];
                }
            }
            return new int[]{contadorPositivo,sumadorNegativos};
        }
    }
}
