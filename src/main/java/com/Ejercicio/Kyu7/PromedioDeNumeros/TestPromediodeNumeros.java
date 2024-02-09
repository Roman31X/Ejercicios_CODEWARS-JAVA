package com.Ejercicio.Kyu7.PromedioDeNumeros;

import org.testng.annotations.Test;
import java.util.Arrays;
import static com.Ejercicio.Kyu7.PromedioDeNumeros.CalcularPromedioNumeros.averages;
import static org.testng.Assert.assertEquals;

public class TestPromediodeNumeros {
    public static void main(String[] args) {
        System.out.println("Test de prueba ara calculo de promedio de Números");
    }

    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[] { 2, 2, 2, 2 }), Arrays.toString(averages(new int[] { 2, 2, 2, 2, 2 })));
        assertEquals(Arrays.toString(new double[] { 0, 0, 0, 0 }), Arrays.toString(averages(new int[] { 2, -2, 2, -2, 2 })));
        assertEquals(Arrays.toString(new double[] { 2, 4, 3, -4.5 }), Arrays.toString(averages(new int[] { 1, 3, 5, 1, -10 })));
    }
}
