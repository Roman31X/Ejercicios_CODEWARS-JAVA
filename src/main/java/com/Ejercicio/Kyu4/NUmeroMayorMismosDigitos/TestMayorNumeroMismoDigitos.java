package com.Ejercicio.Kyu4.NUmeroMayorMismosDigitos;

import java.util.Scanner;

public class TestMayorNumeroMismoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int number = Integer.parseInt(num);
        int[] digitos = new int[num.length()];
        int i = digitos.length - 1;
        while (number > 0) {
            //System.out.println( number % 10); //el residuo es tu número empezando por el último, osea en reversa, lo puedes ir guardando en un array de integers empezando por el último.
            digitos[i] = number%10;
            number = number / 10;
            i--;
        }

        for(int j=0; j < digitos.length; j++){
            System.out.println(digitos[j]);
        }
    }
}
