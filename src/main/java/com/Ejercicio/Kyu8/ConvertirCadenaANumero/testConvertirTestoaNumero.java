package com.Ejercicio.Kyu8.ConvertirCadenaANumero;

import static com.Ejercicio.Kyu8.ConvertirCadenaANumero.ConvertirCadena.StringNumero;

public class testConvertirTestoaNumero {
    public static void main(String[] args) {
        System.out.println("Los números ingresados en cadena de texto seran convertidos a texto");
        System.out.println("La cadena \"1234\" : "+StringNumero("1234"));
        System.out.println("La cadena \"605\" : "+StringNumero("605"));
        System.out.println("La cadena \"1405\" : "+StringNumero("1405"));
        System.out.println("La cadena \"-7\" : "+StringNumero("-7"));

    }
}
