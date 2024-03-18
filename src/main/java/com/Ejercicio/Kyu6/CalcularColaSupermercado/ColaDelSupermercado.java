package com.Ejercicio.Kyu6.CalcularColaSupermercado;

import java.util.*;

public class ColaDelSupermercado {
    public static int solveSuperMarketQueue(int[] customers, int n){
        int time = 0;
        if(n == 1){
            for (int i = 0; i < customers.length; i++) {
                time+=customers[i];
            }
        }else{
            int mayor = 0, contador = 0;
            for (int i = 0; i < customers.length; i++) {
                if(mayor < customers[i]){
                    mayor = customers[i];
                }else{
                    contador+=customers[i];
                }
            }
            System.out.println(mayor+" - "+contador);
        }
        return time;
    }
}
