package com.Ejercicio.Kyu8.DesafioAllStarCode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import static com.Ejercicio.Kyu8.DesafioAllStarCode.DesafioStarCode.StrCount;

public class TestDesafioStarCode {
    public static void main(String[] args) {
        System.out.println("Test de Desafío All Star Code #18");
        System.out.println("Palabra [Hello] - Letra [o] : repite : "+StrCount("Hello", 'o'));
        System.out.println("Palabra [Hello] - Letra [l] : repite : "+StrCount("Hello", 'l'));
        System.out.println("Palabra [Hello] - Letra [o] : repite : "+StrCount("", 'z'));
    }

    @Test
    public void testSomething() {
        assertEquals(1, StrCount("Hello", 'o'));
        assertEquals(2, StrCount("Hello", 'l'));
        assertEquals(0, StrCount("",'z'));
    }
}
