package com.Ejercicio.Kyu6.CadenasConsecutivas;

public class CadenaArrayConsecutiva {
    public static String tamanioConsecutivo(String[] strarr, int k){
        String[] palabra = new String[k];
        if(strarr.length <= k || strarr.length == 0){
            return "";
        }else{
            for (int i = 0; i < k; i++) {
                int indiceCadenaMasLarga = 0;
                for (int j = 1; j < strarr.length; j++) {
                    if (strarr[j].length() > strarr[indiceCadenaMasLarga].length() && strarr[i] != strarr[indiceCadenaMasLarga]) {
                        indiceCadenaMasLarga = j;
                    }
                }
                System.out.println(strarr[indiceCadenaMasLarga]);
                for (int j = 0; j < palabra.length; j++) {
                    if(palabra[i] != strarr[indiceCadenaMasLarga]){
                        palabra[i] = strarr[indiceCadenaMasLarga];
                    }
                }
                // Evitar que la cadena más larga se considere en futuras iteraciones
                strarr[indiceCadenaMasLarga] = "";
            }
            //Creamos una variable para almacenar la nueva cadena
            String nuevo = "";
            //Recorremos en inversa para mantener el orden de la primera palabra larga
            for (int i = palabra.length-1; i >= 0; i--) {
                nuevo+= palabra[i];
            }
            return nuevo;
        }
    }
}
