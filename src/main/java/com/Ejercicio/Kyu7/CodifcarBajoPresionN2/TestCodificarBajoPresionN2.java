package com.Ejercicio.Kyu7.CodifcarBajoPresionN2;

public class TestCodificarBajoPresionN2 {
    public static void main(String[] args) {
        //Ceamos un objeto del counter
        Counter mycounter = new Counter();

        //Utilizamos el objeto mediante el cual aremos el llamado
        //de la clase para incrementar el contador
        mycounter.increment();
        mycounter.increment();

        //PRUEBA CON MENSAJE
        System.out.println("El Valor del contador es de : "+mycounter.check());
    }
}
