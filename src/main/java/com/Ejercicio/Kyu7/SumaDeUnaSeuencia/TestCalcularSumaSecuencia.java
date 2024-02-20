package com.Ejercicio.Kyu7.SumaDeUnaSeuencia;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu7.SumaDeUnaSeuencia.CalcularSumaSecuencia.sequenceSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcularSumaSecuencia {
    public static void main(String[] args) {
        System.out.println("Test para calcular suma de una secuencia");
    }
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertEquals(12, sequenceSum( 2,  6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, sequenceSum( 1,  5, 1), "sequenceSum(1, 5, 1)");
        assertEquals( 5, sequenceSum( 1,  5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, sequenceSum( 0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals( 0, sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }
}
