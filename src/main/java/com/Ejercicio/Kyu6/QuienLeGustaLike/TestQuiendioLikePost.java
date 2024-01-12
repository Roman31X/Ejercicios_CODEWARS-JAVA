package com.Ejercicio.Kyu6.QuienLeGustaLike;

import static com.Ejercicio.Kyu6.QuienLeGustaLike.VerificarQuiendaLike.quienLDioLike;

public class TestQuiendioLikePost {
    public static void main(String[] args) {
        System.out.println("Test para saber quien le dio like a mi publicación");
        System.out.println("Nombres [] : "+ quienLDioLike());
        System.out.println("Nombres [Peter] : "+ quienLDioLike("Peter"));
        System.out.println("Nombres [Jacob,Alex] : "+ quienLDioLike("Jacob", "Alex"));
        System.out.println("Nombres [Max, John, Mark] : "+ quienLDioLike("Max", "John", "Mark"));
        System.out.println("Nombres [Alex, Jacob, Mark, Max] : "+ quienLDioLike("Alex", "Jacob", "Mark", "Max"));

    }
}
