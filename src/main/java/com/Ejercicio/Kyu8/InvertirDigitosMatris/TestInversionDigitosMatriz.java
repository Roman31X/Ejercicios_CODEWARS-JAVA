package com.Ejercicio.Kyu8.InvertirDigitosMatris;

import java.util.Arrays;

import static com.Ejercicio.Kyu8.InvertirDigitosMatris.InvertirLosDigitosDeUnaMatriz.digitos;

public class TestInversionDigitosMatriz {
    public static void main(String[] args) {
        System.out.println("Test para inversion de dígitos de una matriz");
        int[] numero = digitos(35231);
        System.out.println("Numero [35231] : "+ Arrays.toString(numero));
    }
}
