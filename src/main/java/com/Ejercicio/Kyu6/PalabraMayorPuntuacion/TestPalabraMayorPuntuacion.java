package com.Ejercicio.Kyu6.PalabraMayorPuntuacion;

import org.junit.Test;

import static com.Ejercicio.Kyu6.PalabraMayorPuntuacion.CalcularPalabraMayorPuntuacion.high;
import static org.junit.Assert.assertEquals;

public class TestPalabraMayorPuntuacion {
    public static void main(String[] args) {
        System.out.println("Test para calcular la Palabra con mayor puntuación");
    }

    @Test
    public void sampleTests() {
        assertEquals("taxi", high("man i need a taxi up to ubud"));
        assertEquals("volcano", high("what time are we climbing up to the volcano"));
        assertEquals("semynak", high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", high("aa b"));
        assertEquals("b", high("b aa"));
        assertEquals("bb", high("bb d"));
        assertEquals("d", high("d bb"));
        assertEquals("aaa", high("aaa b"));
    }
}
