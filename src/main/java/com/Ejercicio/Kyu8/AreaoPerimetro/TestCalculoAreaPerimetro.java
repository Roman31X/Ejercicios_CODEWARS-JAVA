package com.Ejercicio.Kyu8.AreaoPerimetro;

import static com.Ejercicio.Kyu8.AreaoPerimetro.CalcularAreaoPerimetro.areaOPerimetro;

public class TestCalculoAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("Test para calcular el area o perimetro");
        System.out.println("Largo y ancho [4,4] : "+areaOPerimetro(4,4));
        System.out.println("Largo y ancho [6,10] : "+areaOPerimetro(6,10));
        System.out.println("Largo y ancho [10,10] : "+areaOPerimetro(10,10));
    }
}
