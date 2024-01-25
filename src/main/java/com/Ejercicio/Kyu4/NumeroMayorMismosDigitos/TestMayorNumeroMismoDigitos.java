package com.Ejercicio.Kyu4.NumeroMayorMismosDigitos;

import static com.Ejercicio.Kyu4.NumeroMayorMismosDigitos.MayorNumeroMismoDigitos.siguienteMayorDigito;

public class TestMayorNumeroMismoDigitos {
    public static void main(String[] args) {
        System.out.println("Test de prueba inversion de últimos dígitos si es mayor o -1");
        System.out.println("Número [12] : "+siguienteMayorDigito(12));
        System.out.println("Número [513] : "+siguienteMayorDigito(513));
        System.out.println("Número [2017] : "+siguienteMayorDigito(2017));
        System.out.println("Número [414] : "+siguienteMayorDigito(414));
        System.out.println("Número [144] : "+siguienteMayorDigito(144));
        System.out.println("Número [10990] : "+siguienteMayorDigito(10990));
        System.out.println("Número [9] : "+siguienteMayorDigito(9));
        System.out.println("Número [111] : "+siguienteMayorDigito(111));
        System.out.println("Número [531] : "+siguienteMayorDigito(531));
    }
}
