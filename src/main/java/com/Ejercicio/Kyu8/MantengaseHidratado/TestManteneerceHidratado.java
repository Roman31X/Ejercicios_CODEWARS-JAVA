package com.Ejercicio.Kyu8.MantengaseHidratado;

public class TestManteneerceHidratado {
    public static void main(String[] args) {
        System.out.println("Test de prueba para hidratación al menor numero");
        MantengaseHidratadoCiclista ciclista = new MantengaseHidratadoCiclista();
        System.out.println("Tiempo [2] : "+ ciclista.litros(2));
        System.out.println("Tiempo [0.97] : "+ ciclista.litros(0.97));
        System.out.println("Tiempo [14.64] : "+ ciclista.litros(14.64));
        System.out.println("Tiempo [1600.20] : "+ ciclista.litros(1600.20));
        System.out.println("Tiempo [80] : "+ ciclista.litros(80));
        System.out.println("Tiempo [80] : "+(int)(80.58/2));
    }
}
