package com.Ejercicio.Kyu7.ArreglarCasoDeCuerda;

import org.junit.Test;

import static com.Ejercicio.Kyu7.ArreglarCasoDeCuerda.ArreglarCdaenaDeString.solve;
import static org.junit.Assert.assertEquals;

public class TestArreglarCasoCadena {
    public static void main(String[] args) {
        System.out.println("test Arreglar caso de cuerda");
    }
    @Test
    public void BasicTests() {
        assertEquals("code", solve("code"));
        assertEquals("CODE", solve("CODe"));
        assertEquals("code", solve("COde"));
        assertEquals("code", solve("Code"));
        assertEquals("", solve(""));
    }
}
