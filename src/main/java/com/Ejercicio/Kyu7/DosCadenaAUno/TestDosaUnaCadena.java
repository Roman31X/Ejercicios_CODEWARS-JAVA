package com.Ejercicio.Kyu7.DosCadenaAUno;

import static com.Ejercicio.Kyu7.DosCadenaAUno.SeleccionCadenasDosaUno.largCadena;

public class TestDosaUnaCadena {
    public static void main(String[] args) {
        System.out.println("Test uniendo cadenas sin repetir caracteres");
        System.out.println("Cadena [aretheyhere] - [yestheyarehere] : "+largCadena("aretheyhere", "yestheyarehere"));
        System.out.println("Cadena [loopingisfunbutdangerous] - [lessdangerousthancoding] : "+largCadena("loopingisfunbutdangerous", "lessdangerousthancoding"));

    }
}
