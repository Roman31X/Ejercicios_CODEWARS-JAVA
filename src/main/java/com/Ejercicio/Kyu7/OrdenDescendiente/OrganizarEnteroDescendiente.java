package com.Ejercicio.Kyu7.OrdenDescendiente;

import java.util.Arrays;

public class OrganizarEnteroDescendiente {
    public static int ordenDesendente(final int num){
        //Convertimos el número en una cadena
        String numStr = Integer.toString(num);

        //Convertimos la cadena a caracteres en una matriz
        char[] digits = numStr.toCharArray();

        //Ordenamos los caracteres en orden asendente
        Arrays.sort(digits);
        //Invertimos el orden de la cadena a desendiente
        StringBuilder reversed = new StringBuilder(new String(digits)).reverse();

        //Convertimos la cadena a número entero nuevamente
        int result = Integer.parseInt(reversed.toString());

        return result;
    }
}
