package com.Ejercicio.Kyu7.ValorMasPequeñoArrays;

import static com.Ejercicio.Kyu7.ValorMasPequeñoArrays.ValorPequeñoArrays.PequellodelArreglo;

public class TestMenorNumeroArraysIndiceNumero {
    public static void main(String[] args) {
        System.out.println("Test de prueba de menor Numero de un Arrays por indice y Número");
        System.out.println("Test de array [1,2,3] INDICE : "+PequellodelArreglo(new int[]{1,2,3,1},"index") );
        System.out.println("Test de array [7, 12, 3, 2, 27] VALOR : "+PequellodelArreglo(new int[]{7, 12, 3, 2, 27,1},"value") );
        System.out.println("Test de array [7, 12, 3, 2, 27] INDICE : "+PequellodelArreglo(new int[]{7, 12, 3, 2, 27},"index") );
    }
}
