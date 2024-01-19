package com.Ejercicio.Kyu7.SumaCubos;

import static com.Ejercicio.Kyu7.SumaCubos.SumarCubos.sumaCubos;

public class TestSumarCubos {
    public static void main(String[] args) {
        System.out.println("Test para suma de cubos indicando por números enteros");
        System.out.println("La suma al buco de [1] es : "+sumaCubos(1));
        System.out.println("La suma al buco de [2] es : "+sumaCubos(2));
        System.out.println("La suma al buco de [3] es : "+sumaCubos(3));
        System.out.println("La suma al buco de [4] es : "+sumaCubos(4));
        System.out.println("La suma al buco de [10] es : "+sumaCubos(10));
        System.out.println("La suma al buco de [123] es : "+sumaCubos(123));



    }
}
