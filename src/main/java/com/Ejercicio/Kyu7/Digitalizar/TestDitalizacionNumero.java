package com.Ejercicio.Kyu7.Digitalizar;

import java.util.LinkedList;

import static com.Ejercicio.Kyu7.Digitalizar.DigitalizarNumero.digitalizar;

public class TestDitalizacionNumero {
    public static void main(String[] args) {
        System.out.println("Test para separar digitos d eun numero entero");
        int[] digito1 = digitalizar(123);
        System.out.println("Digitos del numero [123] : ");
        for (int numero : digito1) {
            System.out.println(numero);
        }
        System.out.println("|***************************************|");
        int[] digito2 = digitalizar(1);
        System.out.println("Digitos del numero [1] : ");
        for (int numero : digito2) {
            System.out.println(numero);
        }
        System.out.println("|***************************************|");
        int[] digito3 = digitalizar(0);
        System.out.println("Digitos del numero [0] : ");
        for (int numero : digito3) {
            System.out.println(numero);
        }
        System.out.println("|***************************************|");
        int[] digito4 = digitalizar(1230);
        System.out.println("Digitos del numero [1230] : ");
        for (int numero : digito4) {
            System.out.println(numero);
        }
        System.out.println("|***************************************|");
        int[] digito5 = digitalizar(8675309);
        System.out.println("Digitos del numero [8675309] : ");
        for (int numero : digito5) {
            System.out.println(numero);
        }
        System.out.println("|***************************************|");
    }
}
