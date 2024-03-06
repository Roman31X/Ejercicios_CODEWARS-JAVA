package com.Ejercicio.Kyu5.EnterosRecreacionUno;

import static com.Ejercicio.Kyu5.EnterosRecreacionUno.EnterosRecreacion.listSquared;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestEnterosRecreacionUno {
    public static void main(String[] args) {
        System.out.println("Enteros: Recreación Uno");
    }
    @Test
    public void test1() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", listSquared(1, 250));
    }
    @Test
    public void test2() {
        assertEquals("[[42, 2500], [246, 84100]]", listSquared(42, 250));
    }
    @Test
    public void test3() {
        assertEquals("[[287, 84100]]", listSquared(250, 500));
    }
}
