package com.Ejercicio.Kyu8.RanaDeBocaAncha;

import org.junit.Test;

import static com.Ejercicio.Kyu8.RanaDeBocaAncha.RanaBocaAncha.mouthSize;
import static org.junit.Assert.assertEquals;

public class TestLaRanaBocaAncha {
    public static void main(String[] args) {
        System.out.println("Test de !La rana de boca ancha!");
    }

    @Test
    public void fixedTests() {
        assertEquals("wide", mouthSize("toucan"));
        assertEquals("wide",mouthSize("ant bear"));
        assertEquals("small", mouthSize("alligator"));
    }
}
