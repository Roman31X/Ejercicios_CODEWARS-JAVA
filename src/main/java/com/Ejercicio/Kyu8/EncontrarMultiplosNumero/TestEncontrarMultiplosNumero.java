package com.Ejercicio.Kyu8.EncontrarMultiplosNumero;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu8.EncontrarMultiplosNumero.CalcularMultiplosNumero.find;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestEncontrarMultiplosNumero {
    public static void main(String[] args) {
        System.out.println("Test encontrar múltiplos de un número");
    }
    @Test
    void testExamples() {
        assertArrayEquals(new int[] { 5, 10, 15, 20, 25 },
                find(5, 25), "Testing for base=5 and limit=25");
        assertArrayEquals(new int[] { 1, 2 },
                find(1, 2), "Testing for base=1 and limit=2");
        assertArrayEquals(new int[] { 5 },
                find(5, 7), "Testing for base=5 and limit=7");
        assertArrayEquals(new int[] { 4, 8, 12, 16, 20, 24 },
                find(4, 27), "Testing for base=4 and limit=27");
        assertArrayEquals(new int[] { 11, 22, 33, 44 },
                find(11, 54), "Testing for base=11 and limit=54");
    }
}
