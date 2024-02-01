package com.Ejercicio.Kyu8.RepeticionCuerda;

import static com.Ejercicio.Kyu8.RepeticionCuerda.RepeticionCuerdaString.repetirCuerda;

public class TestRepeticionCuerdaString {
    public static void main(String[] args) {
        System.out.println("Test para repetición de cuerda cadena String");
        System.out.println("Repetir [6] - Cadena [I] : "+repetirCuerda(6,"I"));
        System.out.println("Repetir [4] - Cadena [a] : "+repetirCuerda(4,"a"));
        System.out.println("Repetir [3] - Cadena [Hello] : "+repetirCuerda(3,"Hello"));
        System.out.println("Repetir [5] - Cadena [] : "+repetirCuerda(5,""));
        System.out.println("Repetir [0] - Cadena [kata] : "+repetirCuerda(0,"kata"));
    }
}
