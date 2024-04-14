package com.Ejercicio.Kyu8.DiferenciaVolumenesCuboides;

import org.junit.Test;

import static com.Ejercicio.Kyu8.DiferenciaVolumenesCuboides.CalcularVolumenCuboides.findDifference;
import static org.junit.Assert.assertEquals;

public class TestDiferenciaVolumenCuboides {
    public static void main(String[] args) {
        System.out.println("Test de Diferencias de volumen de cuboides");
    }

    @Test
    public void sampleTestCases() {
        assertEquals(14, findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}
