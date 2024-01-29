package com.Ejercicio.Kyu8.ReciboUnBono;

import static com.Ejercicio.Kyu8.ReciboUnBono.CalcularBono.calcularBonificacion;

public class TestCalculoBono {
    public static void main(String[] args) {
        System.out.println("Test para ver si recibirás un bono o no");
        System.out.println("Empleado 1 : "+calcularBonificacion(10000, true));
    }
}
