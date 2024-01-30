package com.Ejercicio.Kyu7.ContadorDivisoresNumero;

public class TestContadorNumerosDivisibles {
    public static void main(String[] args) {
        System.out.println("Test de por cuantos numero es divisible un numero entero");
        ContarDivisoresNumero division = new ContarDivisoresNumero();
        System.out.println("Numero [1] : "+division.numeroDivisibles(1));
        System.out.println("Numero [1] : "+division.numeroDivisibles(4));
        System.out.println("Numero [5] : "+division.numeroDivisibles(5));
        System.out.println("Numero [12] : "+division.numeroDivisibles(12));
        System.out.println("Numero [30] : "+division.numeroDivisibles(30));
    }
}
