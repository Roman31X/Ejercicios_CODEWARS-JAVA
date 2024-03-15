package com.Ejercicio.Kyu6.Palabra10nAbreviatura;

import static com.Ejercicio.Kyu6.Palabra10nAbreviatura.AbreviaturaPalabra10N.abbreviate;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPalabra10NAbreviatura {
    public static void main(String[] args) {
        System.out.println("Test Palabra a10n (Abreviatura)");
    }

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbreviate("internationalization"));
    }
}
