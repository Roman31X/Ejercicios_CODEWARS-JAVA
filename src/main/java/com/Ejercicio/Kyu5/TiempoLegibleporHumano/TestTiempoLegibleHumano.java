package com.Ejercicio.Kyu5.TiempoLegibleporHumano;

import org.junit.Test;
import static com.Ejercicio.Kyu5.TiempoLegibleporHumano.InterpretacionTiempoHumano.makeReadable;
import static org.junit.Assert.assertEquals;

public class TestTiempoLegibleHumano {
    public static void main(String[] args) {
        System.out.println("Test Tiempo legible por humanos");
    }
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", makeReadable(359999));
    }
}
