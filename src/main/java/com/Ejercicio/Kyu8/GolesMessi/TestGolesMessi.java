package com.Ejercicio.Kyu8.GolesMessi;

import org.junit.Test;

import static com.Ejercicio.Kyu8.GolesMessi.CalcularGolesMessi.totalGoals;
import static org.junit.Assert.assertEquals;
public class TestGolesMessi {
    public static void main(String[] args) {
        System.out.println("Test Saltamontes - Goles de Messi");
    }

    @Test
    public void BasicTests() {
        assertEquals(58, totalGoals);
    }
}
