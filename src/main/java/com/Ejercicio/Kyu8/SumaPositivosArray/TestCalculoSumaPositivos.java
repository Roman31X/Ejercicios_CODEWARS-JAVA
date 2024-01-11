package com.Ejercicio.Kyu8.SumaPositivosArray;

import static com.Ejercicio.Kyu8.SumaPositivosArray.CalcularSumaArray.sumarPositivos;

public class TestCalculoSumaPositivos {
    public static void main(String[] args) {
        System.out.println("Test de suma de positivos Array");
        System.out.println("Sumar positivos Array [1,2,3,4,5] : "+sumarPositivos(new int[]{1,2,3,4,5}));
        System.out.println("Sumar positivos Array [1,-2,3,4,5] : "+sumarPositivos(new int[]{1,-2,3,4,5}));
        System.out.println("Sumar positivos Array [0] : "+sumarPositivos(new int[]{}));
        System.out.println("Sumar positivos Array [-1,-2,-3,-4,-5] : "+sumarPositivos(new int[]{-1,-2,-3,-4,-5}));
        System.out.println("Sumar positivos Array [-1,2,3,4,-5] : "+sumarPositivos(new int[]{-1,2,3,4,-5}));
    }
}
