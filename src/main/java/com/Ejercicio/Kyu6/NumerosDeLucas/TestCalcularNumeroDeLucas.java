package com.Ejercicio.Kyu6.NumerosDeLucas;

import static com.Ejercicio.Kyu6.NumerosDeLucas.CalcularNumeroLucas.lucas;

public class TestCalcularNumeroDeLucas {
    public static void main(String[] args) {
        System.out.println("Test de calculo de los números de Lucas");
        System.out.println("Numero [-10] : "+lucas(-29));
        System.out.println("L(-10) = " + lucas(-10));
        System.out.println("L(-5) = " + lucas(-5));
        System.out.println("L(-1) = " + lucas(-1));
        System.out.println("L(0) = " + lucas(0));
        System.out.println("L(1) = " + lucas(1));
        System.out.println("L(5) = " + lucas(5));
        System.out.println("L(10) = " + lucas(10));
    }
}
