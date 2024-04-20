package com.Ejercicio.Kyu7.MayoriaDigitos;

import org.junit.Test;

import static com.Ejercicio.Kyu7.MayoriaDigitos.CalcularDigitoMasLargo.findLongest;
import static org.junit.Assert.assertEquals;

public class TestLaMayoriaDeLosDigitos {
    public static void main(String[] args) {
        System.out.println("Test de la mayoría de los dígitos");
    }

    @Test
    public void exampleTest1() {
        assertEquals(100, findLongest(new int[] {1, 10, 100}));
    }

    @Test
    public void exampleTest2() {
        assertEquals(9000, findLongest(new int[] {9000, 8, 800}));
    }

    @Test
    public void exampleTest3() {
        assertEquals(900, findLongest(new int[]  {8, 900, 500}));
    }

    @Test
    public void exampleTest4() {
        assertEquals(40000, findLongest(new int[] {3, 40000, 100}));
    }

    @Test
    public void exampleTest5() {
        assertEquals(100000, findLongest(new int[] {1, 200, 100000}));
    }

    @Test
    public void exampleTest6() {
        assertEquals(-10, findLongest(new int[] {-10, 1, 0, 1, 10}));
    }
}
