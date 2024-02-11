package com.Ejercicio.Kyu6.EncuentraLetraFaltante;

import org.junit.Test;

import static com.Ejercicio.Kyu6.EncuentraLetraFaltante.EncuentraLetraFaltante.letraFaltante;
import static org.junit.Assert.assertEquals;

public class TestEncontrarLetraFaltante {
    public static void main(String[] args) {
        System.out.println("Test para encontrar letra faltante");
    }
    @Test
    public void exampleTests() {
        assertEquals('e', letraFaltante(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', letraFaltante(new char[] { 'O','Q','R','S' }));
    }
}
