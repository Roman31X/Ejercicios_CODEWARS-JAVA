package com.Ejercicio.Kyu6.SumaDigitosRaizDigital;

public class SumaDigitalRaizDigital {
    public static int digital_root(int n){
        String numero = String.valueOf(n);
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            if(numero.charAt(i) == '-'){
                suma += Integer.parseInt(String.valueOf(numero.charAt(i+1)))*-1;
                i=1;
            }else{
                suma += Integer.parseInt(String.valueOf(numero.charAt(i)));
            }
        }
        numero = String.valueOf(suma);
        if(numero.length() > 1){
            suma = 0;
            while (numero.length() > 1){
                if(Integer.parseInt(numero) > 0){
                    for (int i = 0; i < numero.length(); i++) {
                        suma += Integer.parseInt(String.valueOf(numero.charAt(i)));
                    }
                    numero = String.valueOf(suma);
                }else{
                    return Integer.parseInt(numero)*-1;
                }
                suma = 0;
            }
        }
        return Integer.parseInt(numero);
    }
}
