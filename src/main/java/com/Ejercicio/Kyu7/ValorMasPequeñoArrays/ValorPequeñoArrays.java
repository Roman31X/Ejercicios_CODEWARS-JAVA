package com.Ejercicio.Kyu7.ValorMasPequeñoArrays;

public class ValorPequeñoArrays {
    public static int PequellodelArreglo(final int[] numbers,final String toReturn){
        int menor = 0;
        switch(toReturn){
            case "index":
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i] < numbers[menor]){
                        menor = i;
                    }
                }
                break;
            case "value":
                menor = numbers[0];
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i] < menor){
                        menor = numbers[i];
                    }
                }
                break;

        }
        return menor;
    }
}
