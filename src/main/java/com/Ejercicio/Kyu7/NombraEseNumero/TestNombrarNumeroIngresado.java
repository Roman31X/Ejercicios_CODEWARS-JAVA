package com.Ejercicio.Kyu7.NombraEseNumero;

import static com.Ejercicio.Kyu7.NombraEseNumero.NombrarNumeroentero.nombreElNumero;

public class TestNombrarNumeroIngresado {
    public static void main(String[] args) {
        System.out.println("Test para nombrar numero ingresado ");
        System.out.println("Número [2] : "+nombreElNumero(2));
        System.out.println("Número [12] : "+nombreElNumero(12));
        System.out.println("Número [20] : "+nombreElNumero(20));
        System.out.println("Número [25] : "+nombreElNumero(25));
        System.out.println("Número [33] : "+nombreElNumero(33));
        System.out.println("Número [99] : "+nombreElNumero(99));
    }
}
