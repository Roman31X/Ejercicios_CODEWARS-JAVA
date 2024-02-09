package com.Ejercicio.Kyu8.EjercicioSemaforo;

import org.testng.annotations.Test;
import static com.Ejercicio.Kyu8.EjercicioSemaforo.LogicaSemaforo.actualizarLuz;
import static org.testng.Assert.assertEquals;

public class TestLogicaSemaforo {
    public static void main(String[] args) {
        System.out.println("Test Semáforo cambio de color");
        System.out.println("Semáforo en rojo : "+actualizarLuz("red"));
        System.out.println("Semáforo en amarillo : "+actualizarLuz("yellow"));
        System.out.println("Semáforo en verde : "+actualizarLuz("green"));

    }
    @Test
    public void update_light() {
        assertEquals("green", actualizarLuz("red"));
        assertEquals("yellow", actualizarLuz("green"));
        assertEquals("red", actualizarLuz("yellow"));
    }
}
