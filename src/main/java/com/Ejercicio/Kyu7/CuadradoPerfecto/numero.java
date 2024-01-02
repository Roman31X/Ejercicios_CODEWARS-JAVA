package com.Ejercicio.Kyu7.CuadradoPerfecto;

public class numero {
    public static boolean esCuadrado(int n){
        int numero = (int)(Math.sqrt(n));
        if(numero * numero == n){
            return true;
        }else{
            return false;
        }
    }
}
