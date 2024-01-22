package com.Ejercicio.Kyu8.MultiplicacionSencilla;

import static com.Ejercicio.Kyu8.MultiplicacionSencilla.MultiplicacionParesImpares.simpleMultiplicacion;

public class TestMultiplicacionesParesImpares {
    public static void main(String[] args) {
        System.out.println("Test de prueba Multiplicar si es par o impar");
        System.out.println("Número [1] : "+simpleMultiplicacion(1));
        System.out.println("Número [2] : "+simpleMultiplicacion(2));
        System.out.println("Número [3] : "+simpleMultiplicacion(3));
        System.out.println("Número [4] : "+simpleMultiplicacion(4));
        System.out.println("Número [21] : "+simpleMultiplicacion(21));
        System.out.println("Número [23] : "+simpleMultiplicacion(23));
    }
}
