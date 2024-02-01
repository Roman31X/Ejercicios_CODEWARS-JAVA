package com.Ejercicio.Kyu8.SecuenciaInvertida;

import java.util.Arrays;

import static com.Ejercicio.Kyu8.SecuenciaInvertida.SecuenciaInvertidaEnteros.reverso;

public class TestSecuenciaInvertidaEnteros {
    public static void main(String[] args) {
        System.out.println("Test para secuencia invertida enteros");
        int[] invertido1 = reverso(5);
        System.out.println("Números de 5 : "+ Arrays.toString(invertido1));
    }
}
