package com.Ejercicio.Kyu8.SumaDeCuadrados;

import static com.Ejercicio.Kyu8.SumaDeCuadrados.Suma_de_Cuadrados.SumaCuadrados;

public class TestSumaCuadradosArray {
    public static void main(String[] args) {
        System.out.println("Prueba de calculo los números al cuadrado d eun Array");
        System.out.println("Calculo primer Array [1,2,2] : "+SumaCuadrados(new int[]{1,2,2}));
        System.out.println("Calculo primer Array [1,2] : "+SumaCuadrados(new int[]{1,2}));
        System.out.println("Calculo primer Array [5,-3,4] : "+SumaCuadrados(new int[]{5,-3,4}));
        System.out.println("Calculo primer Array [] : "+SumaCuadrados(new int[]{}));


    }
}
