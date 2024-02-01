package com.Ejercicio.Kyu6.ConatruirTorre;

import java.util.Arrays;

import static com.Ejercicio.Kyu6.ConatruirTorre.ConstruirTorre.construirTorre;

public class TestConstruirTorre {
    public static void main(String[] args) {
        System.out.println("Test para construir torres con [*]");
        String[] torre1 = construirTorre(1);
        System.out.println("Torre de [*] pisos [1]: "+ Arrays.toString(torre1));
        System.out.println();
        String[] torre2 = construirTorre(2);
        System.out.println("Torre de [*] pisos [2]: "+ Arrays.toString(torre2));
        System.out.println();
        String[] torre3 = construirTorre(3);
        System.out.println("Torre de [*] pisos [3]: "+ Arrays.toString(torre3));
        System.out.println();
        String[] torre4 = construirTorre(4);
        System.out.println("Torre de [*] pisos [4]: "+ Arrays.toString(torre4));
    }
}
