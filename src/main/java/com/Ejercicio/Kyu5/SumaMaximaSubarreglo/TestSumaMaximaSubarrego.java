package com.Ejercicio.Kyu5.SumaMaximaSubarreglo;

import org.junit.Test;
import static com.Ejercicio.Kyu5.SumaMaximaSubarreglo.CulcularSumaMaximaSubarrego.sequence;
import static org.junit.Assert.assertEquals;

public class TestSumaMaximaSubarrego {
    public static void main(String[] args) {
        System.out.println("Test para el calculo de suma maxima de Subarreglo");
    }
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0,sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6,sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
