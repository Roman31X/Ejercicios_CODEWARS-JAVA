package com.Ejercicio.Kyu8.ContarporX;

import static com.Ejercicio.Kyu8.ContarporX.ContarPorX.ContarPor;

public class testContarPorX {
    public static void main(String[] args) {
        System.out.println("En este test se enviara el incremento y cuantos resultados se esperan");
        System.out.println("Para este primer ejemplo sera");
        System.out.println("Incremento en 2 pero solo 5 múltiplos : ");
        int[] lista = ContarPor(2, 5);
        for (int numero:lista) {
            System.out.print("|"+numero);
        }
        System.out.println();
        System.out.println("Incremento en 3 pero solo 7 múltiplos : ");
        int[] lista2 = ContarPor(3, 7);
        for (int numero:lista2) {
            System.out.print("|"+numero);
        }
        System.out.println();
        System.out.println("Incremento en 50 pero solo 5 múltiplos : ");
        int[] lista3 = ContarPor(50, 5);
        for (int numero:lista3) {
            System.out.print("|"+numero);
        }
        System.out.println();
        System.out.println("Incremento en 100 pero solo 6 múltiplos : ");
        int[] lista4 = ContarPor(100, 6);
        for (int numero:lista4) {
            System.out.print("|"+numero);
        }
    }
}
