package com.Ejercicio.Kyu8.ConvertirBooleanString;

import static com.Ejercicio.Kyu8.ConvertirBooleanString.ConvertirBooleanCadena.convert;

public class TestConvertirBooleanString {
    public static void main(String[] args) {
        System.out.println("Test Convertir un Boolean a String");
        System.out.println("Convertir [true] : "+convert(true));
        System.out.println("Convertir [false] : "+convert(false));
    }
}
