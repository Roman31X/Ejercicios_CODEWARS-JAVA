package com.Ejercicio.Kyu8.EntrenamientoIfElse;

import org.junit.Test;

import static com.Ejercicio.Kyu8.EntrenamientoIfElse.EntrenandoConIfElse.saleHotdogs;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class TestEntrenandoConIfELSE {
    public static void main(String[] args) {
        System.out.println("Test de Entrenamiento JS #7: if...else y operadores ternarios");
    }

    @Test
    public void BasicTests() {
        assertEquals(100,saleHotdogs(1));
        assertEquals(400,saleHotdogs(4));
        assertEquals(475,saleHotdogs(5));
        assertEquals(855,saleHotdogs(9));
        assertEquals(900,saleHotdogs(10));
        assertEquals(9000,saleHotdogs(100));
    }
}
