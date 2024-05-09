package com.Ejercicio.Kyu6.MalditoPersistente;

import static com.Ejercicio.Kyu6.MalditoPersistente.CalcularPersistencia.persistence;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMalditoPersistente {
    public static void main(String[] args) {
        System.out.println("Test Maldito persistente");
    }
    @Test
    public void basicTests() {
        assertEquals(3, persistence( 39), "Incorrect answer for n=39" );
        assertEquals(0, persistence(  4), "Incorrect answer for n=4"  );
        assertEquals(2, persistence( 25), "Incorrect answer for n=25" );
        assertEquals(4, persistence(999), "Incorrect answer for n=999");
    }
}
