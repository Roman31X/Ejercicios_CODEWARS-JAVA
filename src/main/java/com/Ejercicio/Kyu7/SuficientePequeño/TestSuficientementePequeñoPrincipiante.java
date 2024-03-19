package com.Ejercicio.Kyu7.SuficientePequeño;

import static com.Ejercicio.Kyu7.SuficientePequeño.ComprobarNumerosDebajoLimite.smallEnough;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSuficientementePequeñoPrincipiante {
    public static void main(String[] args) {
        System.out.println("Test ¿Suficientemente pequeño? - Principiante");
    }
    @Test
    public void basicTests() {
        assertEquals(true, smallEnough(new int[] { 66, 101 }, 200));
        assertEquals(false, smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertEquals(true, smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertEquals(true, smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }
}
