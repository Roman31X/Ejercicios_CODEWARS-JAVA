package com.Ejercicio.Kyu6.ContarLosNumerosDivisibles;

import static com.Ejercicio.Kyu6.ContarLosNumerosDivisibles.ContarNumerosDivisibles.divisibleContador;

public class TestContarNumerosDivisibles {
    public static void main(String[] args) {
        System.out.println("Test para contar números divisiles entre X y Y pero divisibles entre K");
        System.out.println("X y y [6 - 11] k [2] : "+divisibleContador(6,11,2));
        System.out.println("X y y [11 - 345] k [17] : "+divisibleContador(11,345,17));
        System.out.println("X y y [0 - 1] k [7] : "+divisibleContador(0,1,7));
        System.out.println("X y y [20 - 20] k [2] : "+divisibleContador(20,20,2));
    }
}
