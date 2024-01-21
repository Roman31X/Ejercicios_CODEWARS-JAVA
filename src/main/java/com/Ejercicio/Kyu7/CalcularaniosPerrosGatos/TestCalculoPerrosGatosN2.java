package com.Ejercicio.Kyu7.CalcularaniosPerrosGatos;

import static com.Ejercicio.Kyu7.CalcularaniosPerrosGatos.CalcularaniosPerrosGatos.CalcularGatosPerros;

public class TestCalculoPerrosGatosN2 {
    public static void main(String[] args) {
        System.out.println("Test para calcular los años Humanos entre perros y gatos");
        int[] pruebaN1 = CalcularGatosPerros(15,15);
        System.out.println("Gatos : [15] - Perro : [15] : al lado de Humano es : ");
        for (int edad :pruebaN1) {
            System.out.print("["+edad+"] ");
        }
        System.out.println();
        System.out.println("|*****************************************|");
        int[] pruebaN2 = CalcularGatosPerros(24,24);
        System.out.println("Gatos : [24] - Perro : [24] : al lado de Humano es : ");
        for (int edad :pruebaN2) {
            System.out.print("["+edad+"] ");
        }
        System.out.println();
        System.out.println("|*****************************************|");
        int[] pruebaN3 = CalcularGatosPerros(56,64);
        System.out.println("Gatos : [56] - Perro : [64] : al lado de Humano es : ");
        for (int edad :pruebaN3) {
            System.out.print("["+edad+"] ");
        }
        System.out.println();
        System.out.println("|*****************************************|");
        int[] pruebaN4 = CalcularGatosPerros(64,49);
        System.out.println("Gatos : [64] - Perro : [49] : al lado de Humano es : ");
        for (int edad :pruebaN4) {
            System.out.print("["+edad+"] ");
        }
        System.out.println();
        System.out.println("|*****************************************|");
        int[] pruebaN5 = CalcularGatosPerros(58,83);
        System.out.println("Gatos : [58] - Perro : [83] : al lado de Humano es : ");
        for (int edad :pruebaN5) {
            System.out.print("["+edad+"] ");
        }
    }
}
