package com.Ejercicio.Kyu8.MultiplicarNumerosDeArray;

import static com.Ejercicio.Kyu8.MultiplicarNumerosDeArray.MultiplicarArrays.multiplicarArrays;

public class testMultiplicarArrays {
    public static void main(String[] args) {
        System.out.println("Test de multiplicación de los números del Arrays");
        System.out.println("Resultado del Arrays [1,2,3] : "+multiplicarArrays(new int[] {1,2,3}));
        System.out.println("Resultado del Arrays [4,1,1,1,4] : "+multiplicarArrays(new int[] {4,1,1,1,4}));
        System.out.println("Resultado del Arrays [2,2,2,2,2,2] : "+multiplicarArrays(new int[] {2,2,2,2,2,2}));

    }
}
