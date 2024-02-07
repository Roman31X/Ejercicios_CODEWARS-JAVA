package com.Ejercicio.Kyu7.FuncionAritmetica;

import static com.Ejercicio.Kyu7.FuncionAritmetica.CalculeFuncionAritmetica.aritmetica;

public class TestFuncionAritmetrica {
    public static void main(String[] args) {
        System.out.println("Test para realizar operaciones aritméticas");
        System.out.println("Suma [5-2] : "+aritmetica(5, 2,"add"));
        System.out.println("Resta [5-2] : "+aritmetica(5, 2,"subtract"));
        System.out.println("Multiplicar [5-2] : "+aritmetica(5, 2,"multiply"));
        System.out.println("Division [5-2] : "+aritmetica(5, 2,"divide"));
    }
}
