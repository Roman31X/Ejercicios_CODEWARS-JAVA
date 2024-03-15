package com.Ejercicio.Kyu6.ClaseHexagonal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalaseHexagonal {
    public static void main(String[] args) {
        System.out.println("Test de Convertido a Hexagonal");
    }

    @Test
    public void SampleTests() {
        Hex FF = new Hex(255);
        assertEquals("0xFF",FF.toString());
        assertEquals(256 ,FF.valueOf() + 1);
        assertEquals( "0xFF",FF.toJSON());
        assertEquals(FF,new Hex(255));
        assertEquals("0xFE",FF.minus(1).toString());
        assertEquals("0x0",FF.minus(FF).toString());
        assertEquals("0xF",new Hex(10).plus(5).toString());
        assertEquals(32,Hex.parse("0x20"));
        assertEquals(512,Hex.parse("200"));
    }
}
