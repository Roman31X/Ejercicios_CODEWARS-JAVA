package com.Ejercicio.Kyu6.EscribirNumerosAmplia;

import org.junit.Test;
import static com.Ejercicio.Kyu6.EscribirNumerosAmplia.EscribirNumerosDeFomaAmplia.expandedForm;
import static org.junit.Assert.assertEquals;

public class testEscribirNumerosApliada {
    public static void main(String[] args) {
        System.out.println("TestEscribir números en forma ampliada ");
    }

    @Test
    public void testSomething() {
        assertEquals("10 + 2", expandedForm(12));
        assertEquals("40 + 2", expandedForm(42));
        assertEquals("70000 + 300 + 4", expandedForm(70304));
    }

}
