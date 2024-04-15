package com.Ejercicio.Kyu7.PrediceTuEdad;

import org.junit.Test;
import static com.Ejercicio.Kyu7.PrediceTuEdad.CalcularAñosEnjecerias.predictAge;
import static org.junit.Assert.assertEquals;

public class TestPrediciendoTuEdad {
    public static void main(String[] args) {
        System.out.println("Test ¡Predice tu edad!");
    }

    @Test
    public void FixedTests() {
        assertEquals(86, predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, predictAge(32,54,76,65,34,63,64,45));
    }
}
