package com.Ejercicio.Kyu8.SumaDiferenciaMatriz;

import org.junit.Test;

import static com.Ejercicio.Kyu8.SumaDiferenciaMatriz.CalcularSumaMatrisParesDescendente.sumOfDifferences;
import static org.junit.Assert.assertEquals;

public class TestSumaDiferenciasMatriz {
    public static void main(String[] args) {
        System.out.println("Test suma de diferencias en matriz");
    }

    @Test
    public void basicTests() {
        assertEquals(9, sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, sumOfDifferences(new int[0]));
        assertEquals(0, sumOfDifferences(new int[]{0}));
        assertEquals(0, sumOfDifferences(new int[]{-1}));
        assertEquals(0, sumOfDifferences(new int[]{1}));
    }
}
