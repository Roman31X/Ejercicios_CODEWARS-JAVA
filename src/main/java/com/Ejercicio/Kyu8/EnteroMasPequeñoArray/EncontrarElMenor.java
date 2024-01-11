package com.Ejercicio.Kyu8.EnteroMasPequeñoArray;

public class EncontrarElMenor {
    public static int MenorEnteroArray(int[] args){
        int menor = args[0];
        for (int i = 0; i < args.length; i++) {
            if(args[i] < menor){
                menor = args[i];
            }
        }
        return menor;
    }
}
