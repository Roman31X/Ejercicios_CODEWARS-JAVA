package com.Ejercicio.Kyu8.ConvertirCadenaMtriz;

import static com.Ejercicio.Kyu8.ConvertirCadenaMtriz.ConvertirCadena.cadenaArray;

public class TestConvertirCadenaEnArray {
    public static void main(String[] args) {
        System.out.println("Test para prueba de separación en palabras de una frase");
        String[] cadena = cadenaArray("Hola mundo");
        System.out.println("Frase [Hola mundo] : ");
        for (String texto: cadena) {
            System.out.println(texto);
        }
        System.out.println("|*****************************|");
        String[] cadena1 = cadenaArray("Robin Singh");
        System.out.println("Frase [Robin Singh] : ");
        for (String texto: cadena1) {
            System.out.println(texto);
        }
        System.out.println("|*****************************|");
        String[] cadena3 = cadenaArray("I love arrays they are my favorite");
        System.out.println("Frase [I love arrays they are my favorite] : ");
        for (String texto: cadena3) {
            System.out.println(texto);
        }
        System.out.println("|*****************************|");
    }
}
