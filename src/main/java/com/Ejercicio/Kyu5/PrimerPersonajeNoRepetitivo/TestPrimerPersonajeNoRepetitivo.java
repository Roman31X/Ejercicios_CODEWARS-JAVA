package com.Ejercicio.Kyu5.PrimerPersonajeNoRepetitivo;

import org.junit.jupiter.api.*;
import static com.Ejercicio.Kyu5.PrimerPersonajeNoRepetitivo.PersonajeNoRepetitivo.firstNonRepeatingLetter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimerPersonajeNoRepetitivo {
    public static void main(String[] args) {
        System.out.println("Test Primer personaje no repetitivo");
    }

    @Test @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("a", firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("", firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
    }

}
