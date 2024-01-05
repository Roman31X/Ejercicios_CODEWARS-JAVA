package com.Ejercicio.Kyu8.PlabraMasCorta;

public class PalabraMasCorta {
    public static int palabraCorta(String s){
        //Implementamos las funcion [.split("\\s+")] : para dividir la cadena
        //basado en los espacios en blanco o espacios en la frase
        String[] frase = s.split("\\s+");
        String palabraCorta = frase[0];
        for (String palabra : frase) {
            if(palabra.length() < palabraCorta.length()){
                palabraCorta = palabra;
            }
        }
        return (int) palabraCorta.length();
    }
}
