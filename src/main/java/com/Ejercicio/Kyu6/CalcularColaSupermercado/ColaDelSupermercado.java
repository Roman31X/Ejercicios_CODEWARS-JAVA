package com.Ejercicio.Kyu6.CalcularColaSupermercado;

import java.util.*;

public class ColaDelSupermercado {
    public static int solveSuperMarketQueue(int[] customers, int n){
        int[] queues = new int[n];

        for (int i = 0; i < customers.length; i++) {
            queues[0] += customers[i]; // Inicialmente, asigna cada cliente a la primera caja
            Arrays.sort(queues); // Ordena las colas para que la caja más ocupada esté al final
        }

        return queues[n - 1];
    }
}
