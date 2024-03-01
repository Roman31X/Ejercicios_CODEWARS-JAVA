package com.Ejercicio.Kyu8.QuitarSignosExclamación;

public class RemoverSignoCadena {
    public static String removeExclamationMarks(String s){
        String nuevCadena = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '!' ){
                nuevCadena+=s.charAt(i);
            }
        }
        return nuevCadena;
    }
}
