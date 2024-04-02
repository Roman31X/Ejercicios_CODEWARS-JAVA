package com.Ejercicio.Kyu7.SumaParMasGrandeMatriz;

import org.junit.Test;

import static com.Ejercicio.Kyu7.SumaParMasGrandeMatriz.CalcularSumaParMasGrandeMatriz.largestPairSum;
import static org.junit.Assert.assertEquals;

public class TestSumaDelParMasGrandeEnMatriz {
    public static void main(String[] args) {
        System.out.println("Test de la suma de pares mas grandes de la matriz");
    }

    @Test
    public void basicTestCases(){
        assertEquals("Failed test case [10, 14, 2, 23, 19]:", 42, largestPairSum(new int[]{10,14,2,23,19}));
        assertEquals("Failed test case [-100, -29, -24, -19, 19]:", 0, largestPairSum(new int[]{-100,-29,-24,-19,19}));
        assertEquals("Failed test case [1, 2, 3, 4, 6, -1, 2]:", 10, largestPairSum(new int[]{1,2,3,4,6,-1,2}));
        assertEquals("Failed test case [-10, -8, -16, -18, -19]:", -18, largestPairSum(new int[]{-10,-8,-16,-18,-19}));
    }
}
