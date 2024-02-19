package com.Ejercicio.Kyu4.ExtraccionRango;

import org.junit.Test;

import static com.Ejercicio.Kyu4.ExtraccionRango.ExtraccionRangoArray.rangeExtraction;
import static org.junit.Assert.assertEquals;

public class TestExtraccionDeRango {
    public static void main(String[] args) {
        System.out.println("Test de extracción de Rango");
    }

    @Test
    public void test_BasicTests() {
        assertEquals("-6,-3-1,3-5,7-11,14,15,17-20", rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        assertEquals("-3--1,2,10,15,16,18-20", rangeExtraction(new int[] {-3,-2,-1,2,10,15,16,18,19,20}));
    }
}
