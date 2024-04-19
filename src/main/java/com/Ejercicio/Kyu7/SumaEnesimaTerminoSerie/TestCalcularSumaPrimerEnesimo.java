package com.Ejercicio.Kyu7.SumaEnesimaTerminoSerie;

import static com.Ejercicio.Kyu7.SumaEnesimaTerminoSerie.CalcularTerminoEnesimoSerie.seriesSum;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalcularSumaPrimerEnesimo {
    public static void main(String[] args) {
        System.out.println("Test Suma de primer enésimo termino de la Serie");
    }

    @Test
    public void test1() {
        assertEquals("1.57", seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", seriesSum(15));
    }
}
