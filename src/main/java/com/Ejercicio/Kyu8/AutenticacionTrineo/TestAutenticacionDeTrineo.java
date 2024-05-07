package com.Ejercicio.Kyu8.AutenticacionTrineo;

import org.junit.Test;

import static com.Ejercicio.Kyu8.AutenticacionTrineo.EncontrarSantaClaus.authenticate;
import static org.junit.Assert.assertEquals;

public class TestAutenticacionDeTrineo {
    public static void main(String[] args) {
        System.out.println("Test Autenticación de trineo");
    }

    @Test
    public void test_authentication() {
        assertEquals(true, authenticate("Santa Claus", "Ho Ho Ho!"));
        assertEquals(false, authenticate("Santa", "Ho Ho Ho!"));
        assertEquals(false, authenticate("Santa Claus", "Ho Ho Ho"));
    }
}
