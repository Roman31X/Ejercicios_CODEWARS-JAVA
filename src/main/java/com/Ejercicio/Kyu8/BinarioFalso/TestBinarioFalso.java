package com.Ejercicio.Kyu8.BinarioFalso;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBinarioFalso {
    public static void main(String[] args) {
        System.out.println("Test identificar el binario falso");
    }
    @Test
    public void testSomething() {
        IdentificarBinarioFalso fakeBinary = new IdentificarBinarioFalso();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }
}
