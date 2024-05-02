package com.Ejercicio.Kyu8.BienvenidoACiudad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBienvenidaCiudad {
    public static void main(String[] args) {
        System.out.println("Test Bienvennido a la ciudad");
    }

    @Test
    public void test1() throws Exception {
        BienvenidaAlaCiudad h = new BienvenidaAlaCiudad();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}
