package com.Ejercicio.Kyu8.TablaMultiplicarN;

public class TablaMultiplicarNumeros {
    public static String multiTable(int num){
        String cadena = "";
        for (int i = 1; i <= 10; i++) {
            int multi = i * num;
            cadena+=i+" * "+num+" = "+multi+"\n";
        }
        return cadena;
    }
}
