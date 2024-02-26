package com.Ejercicio.Kyu7.PalabraInversa;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import static com.Ejercicio.Kyu7.PalabraInversa.InvertirPalabra.reversoPalabra;

public class TestInvertiPalabra {
    public static void main(String[] args) {
        System.out.println("Test de inversion de palabra");
        System.out.println("\"!Los perros ladran¡\" : "+reversoPalabra("!Los perros ladran¡"));
        System.out.println("\"...jumps over the lazy [dog.]\" : "+reversoPalabra("...jumps over the lazy [dog.]"));
        System.out.println("\"   \" : "+reversoPalabra("   "));
        System.out.println("\"Texto con espacio\" : "+reversoPalabra("Texto con espacio"));
    }
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", reversoPalabra("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", reversoPalabra("apple"));
        assertEquals("a b c d", reversoPalabra("a b c d"));
        assertEquals("elbuod  decaps  sdrow", reversoPalabra("double  spaced  words"));
    }

}
