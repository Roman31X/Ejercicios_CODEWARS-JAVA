package com.Ejercicio.Kyu8.ValoresMaximosMinimos;

import org.testng.annotations.Test;

import static com.Ejercicio.Kyu8.ValoresMaximosMinimos.EncontrarMaximoYminimo.*;
import static junit.framework.TestCase.assertEquals;

public class TestMaximoyMinimo {
    public static void main(String[] args) {
        System.out.println("Test para encontrar al mayor y menor numero de una Arrays List");
    }

    @Test
    public void testExamples() {
        assertEquals(-110, min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, max(new int[]{5}));
    }

}
