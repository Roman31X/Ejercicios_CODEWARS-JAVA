package com.Ejercicio.Kyu7.PoderDeDos;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu7.PoderDeDos.CalcularPoder.isPowerOfTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoderDeDos {
    public static void main(String[] args) {
        System.out.println("Test poder de dos");
    }
    @Test
    void testPowerOfTwo() {
        assertEquals(true, isPowerOfTwo(   2));
        assertEquals(true, isPowerOfTwo(4096));
    }

    @Test
    void testNotPowersOfTwo() {
        assertEquals(false, isPowerOfTwo(333));
        assertEquals(false, isPowerOfTwo(  0));
    }
}
