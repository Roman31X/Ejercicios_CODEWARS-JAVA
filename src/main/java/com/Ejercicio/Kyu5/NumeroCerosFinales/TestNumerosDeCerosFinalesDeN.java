package com.Ejercicio.Kyu5.NumeroCerosFinales;

import org.junit.Test;

import static com.Ejercicio.Kyu5.NumeroCerosFinales.ContarCerosFinales.zeros;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TestNumerosDeCerosFinalesDeN {
    public static void main(String[] args) {
        System.out.println("Test Números de ceros finales de N!");
    }

    @Test
    public void testZeros() throws Exception {
        assertThat(zeros(0), is(0));
        assertThat(zeros(6), is(1));
        assertThat(zeros(14), is(2));
    }
}
