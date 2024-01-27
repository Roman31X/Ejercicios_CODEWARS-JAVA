package com.Ejercicio.Kyu6.CrearNumeroTelefonico;

public class NumeroTelifonico {
    public static String crearNumeroTelefonico(int[] numbers){
        String numeroNuevo = "";
        for (int i = 0; i < numbers.length; i++) {
            numeroNuevo+=String.valueOf(numbers[i]);
            if(i==2){
                numeroNuevo="("+numeroNuevo+") ";
            }else if(i==5){
                numeroNuevo+="-";
            }
        }
        return numeroNuevo;
    }
}
