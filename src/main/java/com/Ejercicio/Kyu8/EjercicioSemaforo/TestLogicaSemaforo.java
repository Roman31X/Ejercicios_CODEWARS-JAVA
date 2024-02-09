package com.Ejercicio.Kyu8.EjercicioSemaforo;

import static com.Ejercicio.Kyu8.EjercicioSemaforo.LogicaSemaforo.actualizarLuz;

public class TestLogicaSemaforo {
    public static void main(String[] args) {
        System.out.println("Test Semáforo cambio de color");
        System.out.println("Semáforo en rojo : "+actualizarLuz("red"));
        System.out.println("Semáforo en amarillo : "+actualizarLuz("yellow"));
        System.out.println("Semáforo en verde : "+actualizarLuz("green"));

    }
}
