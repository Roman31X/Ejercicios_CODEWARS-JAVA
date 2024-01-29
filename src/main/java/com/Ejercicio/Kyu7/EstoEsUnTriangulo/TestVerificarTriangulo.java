package com.Ejercicio.Kyu7.EstoEsUnTriangulo;

import static com.Ejercicio.Kyu7.EstoEsUnTriangulo.VerificarTriangulo.esTriangulo;

public class TestVerificarTriangulo {
    public static void main(String[] args) {
        System.out.println("Test para verificar si es un triangulo");
        System.out.println("Lados [1,2,2] : "+esTriangulo(1,2, 2));
        System.out.println("Lados [7,2,2] : "+esTriangulo(7,2,2));
    }
}
