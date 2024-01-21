package com.Ejercicio.Kyu7.MenorMayorStringNumeros;

import static com.Ejercicio.Kyu7.MenorMayorStringNumeros.ObtenerMenorMayor.MayorMenorCadena;

public class TestMayorMenorCadenaCaracter {
    public static void main(String[] args) {
        System.out.println("Tes de prueba para capturar el Menor y el Mayor de una Cadena de Caracteres");
        System.out.println("Menor y Mayor de [1 -5 -26 8 9 -1] : "+MayorMenorCadena("1 -5 -26 8 9 -1"));
        System.out.println("Menor y Mayor de [8 3 -5 42 -1 0 0 -9 4 7 4 -4] : "+MayorMenorCadena("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println("Menor y Mayor de [1 2 3] : "+MayorMenorCadena("1 2 3"));
        System.out.println("Menor y Mayor de [1 -5 -6 4 50 -50] : "+MayorMenorCadena("1 -5 -6 4 50 -50"));
        System.out.println("Menor y Mayor de [5 4 8 9 15 20 -1] : "+MayorMenorCadena("5 4 8 9 15 20 -1"));


    }
}
