package com.Ejercicio.Kyu6.ComprarUnCarro;

import java.util.Arrays;

import static com.Ejercicio.Kyu6.ComprarUnCarro.CalculoComprarVehiculo.nuevoCarro;

public class TestCompraUnCarro {
    public static void main(String[] args) {
        System.out.println("Test de meses y ahorros para comprar un carro");
        int[] datos = nuevoCarro(2000,8000,1000,1.5);
        System.out.println("DATOS [2000,8000,1000,1.5] : "+ Arrays.toString(datos));
    }
}
