package com.Ejercicio.Kyu6.QueSigloEs;

import org.junit.Test;

import static com.Ejercicio.Kyu6.QueSigloEs.CalculoSigloEs.whatCentury;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestQueSigloEs {
    public static void main(String[] args) {
        System.out.println("Test ¿Que siglo es?");
    }

    @Test
    public void testSomething() {
        assertEquals("20th", whatCentury(1999));
        assertEquals("21st", whatCentury(2011));
        assertEquals("22nd", whatCentury(2154));
        assertEquals("23rd", whatCentury(2259));
    }
}
