package com.Ejercicio.Kyu8.NumeroOpuesto;

import static com.Ejercicio.Kyu8.NumeroOpuesto.ConvertirNumeroOpuesto.opuesto;

public class TestConversionOpuestoNumero {
    public static void main(String[] args) {
        System.out.println("Test para inversion de numero");
        System.out.println("Invertir [-1] : "+opuesto(-1));
        System.out.println("Invertir [-10] : "+opuesto(-10));
        System.out.println("Invertir [1] : "+opuesto(1));
        System.out.println("Invertir [10] : "+opuesto(10));
    }
}
