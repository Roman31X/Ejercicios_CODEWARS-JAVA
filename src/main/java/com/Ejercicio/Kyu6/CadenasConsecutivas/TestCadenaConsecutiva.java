package com.Ejercicio.Kyu6.CadenasConsecutivas;

import static com.Ejercicio.Kyu6.CadenasConsecutivas.CadenaArrayConsecutiva.tamanioConsecutivo;

public class TestCadenaConsecutiva {
    public static void main(String[] args) {
        System.out.println("Test para Cadena consecutiva delimitada por rango");
        System.out.println("Consecutivo es : "+tamanioConsecutivo(new String[]{}, 2));
        System.out.println("Consecutivo es : "+tamanioConsecutivo(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));

        //String[] arrayDeCadenas = {"Hola", "Bienvenido", "Java", "Programación", "Lenguaje"};


    }
}
