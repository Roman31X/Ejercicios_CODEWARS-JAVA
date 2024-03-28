package com.Ejercicio.Kyu6.JugandoConDigitos;

import static com.Ejercicio.Kyu6.JugandoConDigitos.CalculoJugandoConDigitos.digPow;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestJugandoConDigitos {
    public static void main(String[] args) {
        System.out.println("Test Jugando con dígitos");
    }

    @Test
    public void Test1() {
        assertEquals(1, digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, digPow(46288, 3));
    }

}
