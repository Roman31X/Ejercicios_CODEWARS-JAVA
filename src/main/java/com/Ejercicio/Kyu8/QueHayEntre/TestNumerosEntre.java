package com.Ejercicio.Kyu8.QueHayEntre;

import org.junit.Test;
import static com.Ejercicio.Kyu8.QueHayEntre.NumerosEntre.entre;
import static org.junit.Assert.assertArrayEquals;

public class TestNumerosEntre {
    public static void main(String[] args) {
        System.out.println("Test para que números hay entre dos enteros");
    }
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, entre(1, 4));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, entre(-2, 2));
    }
}
