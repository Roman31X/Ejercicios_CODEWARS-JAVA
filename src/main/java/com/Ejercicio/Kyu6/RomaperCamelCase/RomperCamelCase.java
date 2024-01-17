package com.Ejercicio.Kyu6.RomaperCamelCase;

public class RomperCamelCase {
    public static String camelCase(String input){
        String nuevaCadena = "";
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){
                nuevaCadena+= " "+input.charAt(i);
            }else{
                nuevaCadena+= input.charAt(i);
            }
        }
        return nuevaCadena;
    }
}
