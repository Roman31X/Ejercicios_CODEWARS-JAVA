package com.Ejercicio.Kyu8.CuadrarCadaDigito;

import static com.Ejercicio.Kyu8.CuadrarCadaDigito.CuadrarDigitos.cuadrarDigito;

public class TestCuadrarDigitosEntero {
    public static void main(String[] args) {
        System.out.println("Test para cuadrar dígitos de un número entero");
        System.out.println("Número [9119] : "+cuadrarDigito(9119));
        System.out.println("Número [0] : "+cuadrarDigito(0));
    }
}
