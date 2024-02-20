package com.Ejercicio.Kyu7.CuerdasCarcasaJaden;

import static com.Ejercicio.Kyu7.CuerdasCarcasaJaden.ConvertirCuerdasCarcasaJaden.toJadenCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestCuerdasCarcasaJaden {
    public static void main(String[] args) {
        System.out.println("Test de Cuerdas de carcasa Jaden");
    }
    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is empty string",toJadenCase(""));
    }

}
