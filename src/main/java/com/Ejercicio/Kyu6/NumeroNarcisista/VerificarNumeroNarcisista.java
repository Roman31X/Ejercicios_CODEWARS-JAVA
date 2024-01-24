package com.Ejercicio.Kyu6.NumeroNarcisista;

public class VerificarNumeroNarcisista {
    public static boolean esNarcisista(int number){
        String numero = String.valueOf(number);
        int[] digitos = new int[numero.length()];
        int total = 0;
        for (int i = 0; i < numero.length(); i++) {
            digitos[i] = (int) Math.pow(Integer.parseInt(String.valueOf(numero.charAt(i))), numero.length());
        }
        for (int digito:digitos) {
            total+=digito;
        }
        if(number == total){
            return true;
        }else{
            return false;
        }
    }
}
