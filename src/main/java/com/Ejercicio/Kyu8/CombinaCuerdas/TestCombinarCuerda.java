package com.Ejercicio.Kyu8.CombinaCuerdas;

import static com.Ejercicio.Kyu8.CombinaCuerdas.JuntarCadenasNombre.combineNames;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCombinarCuerda {
    public static void main(String[] args) {
        System.out.println("Test ");
    }
    @Test
    void test() {
        assertEquals("James Stevens",
                combineNames("James","Stevens"));
    }
}
