package com.Ejercicio.Kyu8.EnceuntraPrimerNumeroConsecutivo;

import org.junit.Test;

import static com.Ejercicio.Kyu8.EnceuntraPrimerNumeroConsecutivo.CalcularNumeroConsecutivo.find;
import static org.junit.Assert.assertEquals;

public class TestEncuentraPrimerNumeroConsecutivo {
    public static void main(String[] args) {
        System.out.println("Test Encuentra el primer número no consecutivo");
    }
    @Test public void basicTests() {
        assertEquals(Integer.valueOf(6), find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), find(new int[]{-5, -4, -3, -1}));
    }
}
