package com.Ejercicio.Kyu6.QuitarRepetidosArray;

import static com.Ejercicio.Kyu6.QuitarRepetidosArray.QuitarRepetidos.quitarMatris;

public class TestQuitarRepetidosArray {
    public static void main(String[] args) {
        System.out.println("Test de Eliminar números repitentes");
        int[] unico = quitarMatris(new int[]{1,2,2},new int[]{1});
        System.out.println("Array [1,2,2] - Array [1] : ");
        for (int numero:unico) {
            System.out.println(numero);
        }
        System.out.println("|********************************|");
        int[] unico1 = quitarMatris(new int[]{1,2,2},new int[]{2});
        System.out.println("Array [1,2,2] - Array [2] : ");
        for (int numero:unico1) {
            System.out.println(numero);
        }
        System.out.println("|********************************|");
        int[] unico2 = quitarMatris(new int[]{1,2,2},new int[]{0});
        System.out.println("Array [1,2,2] - Array [0] : ");
        for (int numero:unico2) {
            System.out.println(numero);
        }
        System.out.println("|********************************|");
        int[] unico3 = quitarMatris(new int[]{1,1,2,2,3,4,5,6,5,5},new int[]{1,2,5});
        System.out.println("Array [0] - Array [1,2] : ");
        for (int numero:unico3) {
            System.out.println(numero);
        }
        System.out.println("|********************************|");
    }
}
