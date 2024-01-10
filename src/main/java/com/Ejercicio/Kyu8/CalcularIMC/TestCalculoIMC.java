package com.Ejercicio.Kyu8.CalcularIMC;

import static com.Ejercicio.Kyu8.CalcularIMC.CalculoDeIMC.BMI;

public class TestCalculoIMC {
    public static void main(String[] args) {
        System.out.println("Test para calculo de IMC de joven");
        System.out.println("Datos peso:80 - Talla: 1.80 su condición es : "+BMI(80,1.80));
        System.out.println("Datos peso:85 - Talla: 1.70 su condición es : "+BMI(85,1.70));
        System.out.println("Datos peso:75 - Talla: 1.75 su condición es : "+BMI(75,1.75));
    }
}
