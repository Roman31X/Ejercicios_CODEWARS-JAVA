package com.Ejercicio.Kyu8.CalcularPromedioArray;

import static com.Ejercicio.Kyu8.CalcularPromedioArray.PromedioArray.encontrar_promedio;

public class testCalculoPromedioArray {
    public static void main(String[] args) {
        System.out.println("Promedio de array [1,1,1] :"+
                (int)encontrar_promedio(new int[]{1,1,1}));
        System.out.println("Promedio de array [1,2,3] :"+
                (int)encontrar_promedio(new int[]{1,2,3}));
    }
}
