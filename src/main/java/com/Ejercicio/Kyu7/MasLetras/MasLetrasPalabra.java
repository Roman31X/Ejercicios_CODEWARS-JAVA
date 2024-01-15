package com.Ejercicio.Kyu7.MasLetras;

import java.util.Locale;

public class MasLetrasPalabra {
    public static String AumentadorLetras(String s){
        String nuevaPalabra = "";
        String mayuscula = "";
        for (int i = 0; i < s.length(); i++) {
            if(i <= s.length() ){
                for (int j = 0; j <= i; j++) {
                    if(j == 0){
                        mayuscula+=s.charAt(i);
                        nuevaPalabra+=mayuscula.toUpperCase();
                        mayuscula ="";
                    }else{
                        mayuscula+=s.charAt(i);
                        nuevaPalabra+=mayuscula.toLowerCase();
                        mayuscula ="";
                    }
                }
                if(i < (s.length()-1)){
                    nuevaPalabra+="-";
                }
            }

        }
        return nuevaPalabra;
    }
}
