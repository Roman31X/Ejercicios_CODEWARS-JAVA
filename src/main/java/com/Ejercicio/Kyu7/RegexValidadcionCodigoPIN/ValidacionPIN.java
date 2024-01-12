package com.Ejercicio.Kyu7.RegexValidadcionCodigoPIN;

public class ValidacionPIN {
    public static boolean valiidarPin(String pin){
        boolean resultado = true;
        if(pin.matches("[0-9]*")){
            int tamaño = pin.length();
            if(tamaño == 4 || tamaño == 6){
                return resultado = true;
            }else{
                return resultado = false;
            }
        }else{
            return resultado = false;
        }
    }
}
