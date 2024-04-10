package com.Ejercicio.Kyu8.RegresarElDia;

import org.junit.jupiter.api.Test;
import static com.Ejercicio.Kyu8.RegresarElDia.QueDiaEsHoy.getDay;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQueDiaEs {
    public static void main(String[] args) {
        System.out.println("Test de Que día es o Regresar el día");
    }

    @Test
    void testSomething() {
        assertEquals("Sunday",getDay(1));
        assertEquals("Monday",getDay(2));
        assertEquals("Tuesday",getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",getDay(20));
    }

}
