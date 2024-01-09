package com.Ejercicio.Kyu8.ConvertirAMayusculas;

import static com.Ejercicio.Kyu8.ConvertirAMayusculas.ConvertirMayusculas.ConvertirMayusculasCadena;

public class TestConversionCadenaMayusculas {
    public static void main(String[] args) {
        System.out.println("Test para conversión de una cadena a MAYUSCULAS");
        System.out.println("La cadena \"Hola Mundo\" : "+ConvertirMayusculasCadena("Hola Mundo"));
        System.out.println("La cadena \"ejercicios codewars\" : "+ConvertirMayusculasCadena("ejercicios codewars"));
    }
}
