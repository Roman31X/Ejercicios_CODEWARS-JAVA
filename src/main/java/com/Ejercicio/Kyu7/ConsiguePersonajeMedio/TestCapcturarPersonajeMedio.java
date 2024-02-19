package com.Ejercicio.Kyu7.ConsiguePersonajeMedio;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.Ejercicio.Kyu7.ConsiguePersonajeMedio.CapturarPersonajeMedio.getMiddle;

public class TestCapcturarPersonajeMedio {
    public static void main(String[] args) {
        System.out.println("Test para Capturar al personaje de al medio");
        System.out.println("palabra [testing] : "+getMiddle("testing"));
        System.out.println("palabra [middle] : "+getMiddle("middle"));
    }
    @Test
    public void evenTests() {
        assertEquals("es", getMiddle("test"));
        assertEquals("dd", getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }
}
