package com.Ejercicio.Kyu8.ContarPositivosSumarNegativos;

import java.util.Arrays;

import static com.Ejercicio.Kyu8.ContarPositivosSumarNegativos.CalcularContadorSuma.contadorSumador;

public class TestPositivosSumaNegativos {
    public static void main(String[] args) {
        System.out.println("Test de conteo de positivos y suma de Negativos Array");
        int[] resultado = contadorSumador(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14,});
        System.out.println("Array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15] : "+ Arrays.toString(resultado));
        System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++|");
        int[] resultado2 = contadorSumador(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14});
        System.out.println("Array [0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14] : "+ Arrays.toString(resultado2));
    }
}
