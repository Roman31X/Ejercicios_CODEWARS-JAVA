package com.Ejercicio.Kyu8.PlabraMasCorta;

import static com.Ejercicio.Kyu8.PlabraMasCorta.PalabraMasCorta.palabraCorta;

public class testPalabraMasCorta {
    public static void main(String[] args) {
        System.out.println("Test para buscar la palabra mas corta de una frase");
        System.out.println("Los perros comen carne : "+
                palabraCorta("Los perros comen carne"));
        System.out.println("bitcoin take over the world maybe who knows perhaps : "+
                palabraCorta("bitcoin take over the world maybe who knows perhaps"));
        System.out.println("turns out random test cases are easier than writing out basic ones : "+
                palabraCorta("turns out random test cases are easier than writing out basic ones"));
        System.out.println("Let's travel abroad shall we : "+
                palabraCorta("Let's travel abroad shall we"));
    }
}
