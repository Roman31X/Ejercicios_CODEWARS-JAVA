package com.Ejercicio.Kyu7.LaMiseriaDePablo;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.Ejercicio.Kyu7.LaMiseriaDePablo.CalcularPuntosPablo.paul;

public class TestMiseriaPablo {
    public static void main(String[] args) {
        //DATA
        String[] a1 = new String[]{"life", "eating", "life"};
        String a1s = Arrays.stream(a1).collect(Collectors.joining(", "));
        String[] a2 = new String[]{"life", "Petes kata", "Petes kata", "Petes kata", "eating"};
        String a2s = Arrays.stream(a2).collect(Collectors.joining(", "));
        String[] a3 = new String[]{"Petes kata", "Petes kata", "eating", "Petes kata", "Petes kata", "eating"};
        String a3s = Arrays.stream(a3).collect(Collectors.joining(", "));
        String[] a4 = new String[]{"Petes kata", "Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","Petes kata","kata", "eating", "eating", "eating", "eating"};
        String a4s = Arrays.stream(a4).collect(Collectors.joining(", "));

        //TEST
        System.out.println("Test de prueba de calculo de Miseria Pablo");
        System.out.println("Primer dia fue : "+paul(a1));
        System.out.println("Segundo dia fue : "+paul(a2));
        System.out.println("Tercer dia fue : "+paul(a3));
        System.out.println("Cuarto dia fue : "+paul(a4));

    }
}
