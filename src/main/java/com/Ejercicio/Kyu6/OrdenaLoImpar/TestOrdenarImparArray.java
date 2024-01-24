package com.Ejercicio.Kyu6.OrdenaLoImpar;

import java.util.Arrays;

import static com.Ejercicio.Kyu6.OrdenaLoImpar.OrdenarImparArray.ordenarImpar;

public class TestOrdenarImparArray {
    public static void main(String[] args) {
        System.out.println("Test de prueba para Ordenar solo números impares en Arrays");
        int[] nuevo  = ordenarImpar(new int[]{5, 8, 6, 3, 4});
        System.out.println("Array [5, 8, 6, 3, 4]] : "+ Arrays.toString(nuevo));

    }
}
