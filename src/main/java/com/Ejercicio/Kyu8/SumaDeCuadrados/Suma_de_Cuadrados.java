package com.Ejercicio.Kyu8.SumaDeCuadrados;

public class Suma_de_Cuadrados {
    public static int SumaCuadrados(int[] n){
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma+= (int) Math.pow(n[i],2);
        }
        return suma;
    }
}
