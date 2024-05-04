package com.Ejercicio.Kyu7.EvaporadorDesodorante;

import static com.Ejercicio.Kyu7.EvaporadorDesodorante.CalcularGatoDesodorante.evaporator;
import static org.junit.Assert.*;
import org.junit.*;

public class TestEvaporadorDeDesodorante {
    public static void main(String[] args) {
        System.out.println("Test para calcular el evaporador de desodorante");
    }
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , evaporator(10, 10, 10));
    }
}
