package com.Ejercicio.Kyu7.NombraEseNumero;

public class NombrarNumeroentero {
    public static String nombreElNumero(int x){
        String[] unDigito = {"one","two","three","four","five","six","seven","eight","nine"};
        String[] dosDigitos = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] decimales = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(x == 0){
            return "zero";
        }else if(x < 10){
            return unDigito[x-1];
        }else if (x >= 10 && x < 20){
            return dosDigitos[x-10];
        }else{
            String numero = String.valueOf(x);
            char[] digito = numero.toCharArray();
            String nombre = "";
            for (int i = 0; i < digito.length; i++) {
                if(i == 0){
                    nombre += decimales[Integer.parseInt(String.valueOf(digito[i]))-2];
                }else if(Integer.parseInt(String.valueOf(digito[i])) != 0){
                    nombre += " "+unDigito[Integer.parseInt(String.valueOf(digito[i]))-1];
                }
            }
            return nombre;
        }
    }
}
