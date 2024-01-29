package com.Ejercicio.Kyu7.EstoEsUnTriangulo;

public class VerificarTriangulo {
    public static boolean esTriangulo(int a, int b, int c){
        return (a+b > c && a+c > b && b+c > a)?true:false;
    }
}
