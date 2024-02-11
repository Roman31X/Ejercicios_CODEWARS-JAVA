package com.Ejercicio.Kyu4.AyudanteNumeroRomano;

import org.junit.Test;
import static com.Ejercicio.Kyu4.AyudanteNumeroRomano.AyudanteNumeroRomanoaEntero.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestAyudanteNumeroRomano {
    public static void main(String[] args) {
        System.out.println("Test para Ayudante de números romanos");
    }

    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", toRoman(1), is("I"));
        assertThat("2 converts to 'II'", toRoman(2), is("II"));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", fromRoman("I"), is(1));
        assertThat("'II' converts to 2", fromRoman("II"), is(2));
    }
}
