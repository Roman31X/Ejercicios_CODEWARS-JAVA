package com.Ejercicio.Kyu6.CrearNumeroTelefonico;

import static com.Ejercicio.Kyu6.CrearNumeroTelefonico.NumeroTelifonico.crearNumeroTelefonico;

public class TestCrearNumeroTelefonico {
    public static void main(String[] args) {
        System.out.println("Test de creación numero telefonico");
        System.out.println("Array [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] : Numero :"+crearNumeroTelefonico(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println("Array [5, 0, 4, 7, 8, 5,15, 1, 0, 0] : Numero :"+crearNumeroTelefonico(new int[]{5, 0, 4, 7, 8, 5, 5, 1, 0, 0}));
    }
}
