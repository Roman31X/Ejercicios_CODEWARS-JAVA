package com.Ejercicio.Kyu7.NumeroPerdido;

import org.junit.Test;

import static com.Ejercicio.Kyu7.NumeroPerdido.EncontrarNumeroPerdido.stray;
import static org.junit.Assert.assertEquals;

public class TestEncontrarNumeroPerdido {
    public static void main(String[] args) {
        System.out.println("Test Encuentra al número perdido");
    }
    @Test
    public void threeElements1() {
        assertEquals(2, getActualFor(2, 1, 1));
    }

    @Test
    public void threeElements2() {
        assertEquals(2, getActualFor(1, 2, 1));
    }

    @Test
    public void threeElements3() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return stray(numbers);
    }
}
