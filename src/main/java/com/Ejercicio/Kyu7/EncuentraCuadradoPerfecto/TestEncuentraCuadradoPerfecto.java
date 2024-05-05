package com.Ejercicio.Kyu7.EncuentraCuadradoPerfecto;

import org.junit.Test;
import static com.Ejercicio.Kyu7.EncuentraCuadradoPerfecto.CalcularCuadradoPerfecto.findNextSquare;
import static org.junit.Assert.assertEquals;

public class TestEncuentraCuadradoPerfecto {
    public static void main(String[] args) {
        System.out.println("Test ¡Encuentra el siguiente cuadrado perfecto!");
    }
    @Test
    public void test1() {
        assertEquals(144, findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, findNextSquare(114));
    }
}
