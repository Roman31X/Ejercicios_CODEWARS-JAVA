package com.Ejercicio.Kyu6.RomaperCamelCase;

import static com.Ejercicio.Kyu6.RomaperCamelCase.RomperCamelCase.camelCase;

public class TestPruebaRomperCamelCase {
    public static void main(String[] args) {
        System.out.println("Tes de prueba para romper camelCase - camel Case");
        System.out.println("Palabra [camelCase] : "+camelCase("camelCase"));
        System.out.println("Palabra [camelCasingTest] : "+camelCase("camelCasingTest"));
        System.out.println("Palabra [camelcasingtest] : "+camelCase("camelcasingtest"));
        System.out.println("Palabra [promedioTotal] : "+camelCase("promedioTotal"));


    }
}
