package com.Ejercicio.Kyu8.EnteroMasPequeñoArray;

import static com.Ejercicio.Kyu8.EnteroMasPequeñoArray.EncontrarElMenor.MenorEnteroArray;

public class TestEncontrarEnteroMenorArray {
    public static void main(String[] args) {
        System.out.println("Test de prueba para encontrar al menor de un array");
        System.out.println("El menor de Array [78,56,232,12,11,43] : "+MenorEnteroArray(new int[]{78,56,232,12,11,43}));
        System.out.println("El menor de Array [78,56,-2,12,8,-33] : "+MenorEnteroArray(new int[]{78,56,-2,12,8,-33}));
        System.out.println("El menor de Array [0] : "+MenorEnteroArray(new int[]{0}));
    }
}
