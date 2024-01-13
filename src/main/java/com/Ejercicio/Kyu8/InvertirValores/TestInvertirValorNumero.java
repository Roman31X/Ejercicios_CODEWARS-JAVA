package com.Ejercicio.Kyu8.InvertirValores;

import static com.Ejercicio.Kyu8.InvertirValores.InvertirValorArraysNumeros.invertirValorArray;

public class TestInvertirValorNumero {
    public static void main(String[] args) {
        System.out.println("Test de Prueba de inversion de Números enteros");
        int[] invertido = invertirValorArray(new int[]{-1,-2,-3,-4,-5});
        System.out.println("Array [-1,-2,-3,-4,-5] : invertida símbolos : ");
        for (int numero:invertido) {
            System.out.println(numero);
        }
        System.out.println("|******************************************|");
        int[] invertido2 = invertirValorArray(new int[]{-1,2,-3,4,-5});
        System.out.println("Array [-1,2,-3,4,-5] : invertida símbolos : ");
        for (int numero:invertido2) {
            System.out.println(numero);
        }
        System.out.println("|******************************************|");
        int[] invertido3 = invertirValorArray(new int[]{0});
        System.out.println("Array [0] : invertida símbolos : ");
        for (int numero:invertido3) {
            System.out.println(numero);
        }
    }
}
