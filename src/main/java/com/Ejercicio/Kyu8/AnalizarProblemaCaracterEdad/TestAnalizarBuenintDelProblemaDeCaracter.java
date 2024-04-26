package com.Ejercicio.Kyu8.AnalizarProblemaCaracterEdad;

import static com.Ejercicio.Kyu8.AnalizarProblemaCaracterEdad.ConvertirStringAIntEdad.howOld;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestAnalizarBuenintDelProblemaDeCaracter {
    public static void main(String[] args) {
        System.out.println("Analizar buen ont del problema de caracteres");

    }
    @Test
    public void test1() {
        assertEquals(5, howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, howOld("1 year old"));
    }
}
