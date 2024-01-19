package com.Ejercicio.Kyu8.LosGolesDeMessi;

import org.junit.Test;

import static com.Ejercicio.Kyu8.LosGolesDeMessi.CalcularGolesDeMessi.goals;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestGolesMessi {
    public static void main(String[] args) {
        System.out.println("Grasshopper - Los goles de Messi funcionan");
    }

    @Test
    public void basicTests() {
        assertEquals(0, goals(0, 0, 0));
        assertEquals(58, goals(43, 10, 5));
    }

}
