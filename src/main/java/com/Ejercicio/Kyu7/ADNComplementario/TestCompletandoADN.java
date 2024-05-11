package com.Ejercicio.Kyu7.ADNComplementario;

import org.junit.Test;

import static com.Ejercicio.Kyu7.ADNComplementario.CompletarADN.makeComplement;
import static org.junit.Assert.assertEquals;

public class TestCompletandoADN {
    public static void main(String[] args) {
        System.out.println("Test completando cadenas ADN");
    }

    @Test
    public void test01() {
        assertEquals("TTTT", makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", makeComplement("GTAT"));
    }
}
