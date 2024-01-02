package com.Ejercicio.Kyu7.CuadradoPerfecto;

import static com.Ejercicio.Kyu7.CuadradoPerfecto.numero.esCuadrado;

public class test {
    public static void main(String[] args) {
        System.out.println("El numero -1 es cuadrado perfecto : "+esCuadrado(-1));
        System.out.println("El numero 0 es cuadrado perfecto : "+esCuadrado(0));
        System.out.println("El numero 3 es cuadrado perfecto : "+esCuadrado(3));
        System.out.println("El numero 4 es cuadrado perfecto : "+esCuadrado(4));
        System.out.println("El numero 25 es cuadrado perfecto : "+esCuadrado(25));
        System.out.println("El numero 26 es cuadrado perfecto : "+esCuadrado(26));
    }
}
