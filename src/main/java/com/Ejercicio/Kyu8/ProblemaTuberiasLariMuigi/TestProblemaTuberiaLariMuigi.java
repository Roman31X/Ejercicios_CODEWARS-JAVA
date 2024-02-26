package com.Ejercicio.Kyu8.ProblemaTuberiasLariMuigi;

import java.util.Arrays;

import static com.Ejercicio.Kyu8.ProblemaTuberiasLariMuigi.ProblemaTuberiaCompletar.pipeFix;

public class TestProblemaTuberiaLariMuigi {
    public static void main(String[] args) {
        System.out.println("Test Sencillo de problema con tuberías de Lario y Mugio");
        int[] prueba = pipeFix(new int[] {6,9});
        System.out.println("Números "+ Arrays.toString(prueba));
    }
}
