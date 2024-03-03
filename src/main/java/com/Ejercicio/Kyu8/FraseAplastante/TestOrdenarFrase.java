package com.Ejercicio.Kyu8.FraseAplastante;

import static com.Ejercicio.Kyu8.FraseAplastante.OrdenarLaFrase.smash;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestOrdenarFrase {
    public static void main(String[] args) {
        System.out.println("Test Frase Aplastante");
    }
    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", smash(new String[] {}));
    }


    @Test
    public void validateOneWord() {
        assertEquals("Bilal", smash(new String[] {"Bilal"}));
    }
}
