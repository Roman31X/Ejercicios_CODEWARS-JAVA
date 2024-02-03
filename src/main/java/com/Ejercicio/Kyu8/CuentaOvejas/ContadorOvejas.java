package com.Ejercicio.Kyu8.CuentaOvejas;

public class ContadorOvejas {
    public static String contadorOvejas(int num){
        String ovejas = "";
        for (int i = 1; i <= num ; i++) {
            ovejas += i+" sheep...";
        }
        return ovejas;
    }
}
