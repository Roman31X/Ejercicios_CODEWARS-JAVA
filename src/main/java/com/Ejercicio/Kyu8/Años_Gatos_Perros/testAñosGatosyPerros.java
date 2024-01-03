package com.Ejercicio.Kyu8.Años_Gatos_Perros;

import static com.Ejercicio.Kyu8.Años_Gatos_Perros.AñosGatosyPerros.yearsHumanosGatosPerros;

public class testAñosGatosyPerros {
    public static void main(String[] args) {
        System.out.println("Solución a calculo de años humanos en años gatos y perros");
        int[] yearCalculo1 = yearsHumanosGatosPerros(1);
        System.out.println("1 año humano equivale en Humano - Gato - Perro");
        for (int edad1 : yearCalculo1) {
            System.out.print("["+edad1+"]");
        }
        System.out.println();
        int[] yearCalculo2 = yearsHumanosGatosPerros(2);
        System.out.println("2 año humano equivale en Humano - Gato - Perro");
        for (int edad2 : yearCalculo2) {
            System.out.print("["+edad2+"]");
        }
        System.out.println();
        int[] yearCalculo3 = yearsHumanosGatosPerros(10);
        System.out.println("10 año humano equivale en Humano - Gato - Perro");
        for (int edad3 : yearCalculo3) {
            System.out.print("["+edad3+"]");
        }
    }
}
