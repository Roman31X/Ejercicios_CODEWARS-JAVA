package com.Ejercicio.Kyu8.RemoverPrimeroyUltimoCaracter;

public class RemoverPrimero_Ultimo {
    public static String remover(String cadena){
        //Con el método [.subtring] : nos permite extraer los caracteres
        //según la posición que queramos
        cadena = cadena.substring(1,cadena.length()-1);
        return cadena;
    }
}
