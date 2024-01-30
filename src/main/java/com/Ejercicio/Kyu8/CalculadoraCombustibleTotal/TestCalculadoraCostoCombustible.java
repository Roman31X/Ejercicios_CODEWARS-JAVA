package com.Ejercicio.Kyu8.CalculadoraCombustibleTotal;

import static com.Ejercicio.Kyu8.CalculadoraCombustibleTotal.CalculoCostoCombustible.litrosPrecio;

public class TestCalculadoraCostoCombustible {
    public static void main(String[] args) {
        System.out.println("Test de costo de litros de combustible");
        System.out.println("LITROS - COSTO : [5,1.23d] : "+litrosPrecio(5,1.23d));
        System.out.println("LITROS - COSTO : [8,2.5d] : "+litrosPrecio(8,2.5d));
        System.out.println("LITROS - COSTO : [5,5.6d] : "+litrosPrecio(5,5.6d));
    }
}
