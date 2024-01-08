package com.Ejercicio.Kyu7.ValorMasPequeñoArrays;

public class ValorPequeñoArrays {
    public static int PequellodelArreglo(final int[] numbers,final String toReturn){
        int numero = 0, menor = 10;
        switch(toReturn){
            case "index":
                for (int i = 0; i < numbers.length; i++) {
                    if(menor>numbers[i]){
                        menor = numbers[i];
                        numero = i;
                    }
                }
                break;
            case "value":
                for (int i = 0; i < numbers.length; i++) {
                    if(menor>numbers[i]){
                        numero = numbers[i];
                    }
                }
                break;

        }
        return numero;
    }
}
