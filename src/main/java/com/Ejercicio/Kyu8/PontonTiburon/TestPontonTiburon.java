package com.Ejercicio.Kyu8.PontonTiburon;

import org.junit.jupiter.api.Test;

import static com.Ejercicio.Kyu8.PontonTiburon.CalcularPontonTiburon.shark;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPontonTiburon {
    public static void main(String[] args) {
        System.out.println("Test calculo distancia Pontón Tiburón");
    }
    @Test
    void testSomething() {
        assertEquals("Alive!", shark(12, 50, 4, 8, true));
        assertEquals("Alive!", shark(7, 55, 4, 16, true));
        assertEquals("Shark Bait!", shark(24, 0, 4, 8, true));
    }
}
