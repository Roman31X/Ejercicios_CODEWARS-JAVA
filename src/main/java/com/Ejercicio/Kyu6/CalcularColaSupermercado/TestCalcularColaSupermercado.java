package com.Ejercicio.Kyu6.CalcularColaSupermercado;

import static com.Ejercicio.Kyu6.CalcularColaSupermercado.ColaDelSupermercado.solveSuperMarketQueue;

public class TestCalcularColaSupermercado {
    public static void main(String[] args) {
        System.out.println("Test Calcular tiempo en Cola de supermercado");
        int[] cola1 = {10,2,3,3};
        System.out.println("Tiempo de salida : "+
                solveSuperMarketQueue(cola1, 1));
        int[] cola2 = {2,2,3,3,4,4};
        System.out.println("Tiempo de salida : "+
                solveSuperMarketQueue(cola2, 2));
    }

}
