package com.Ejercicio.Kyu7.ContadorDivisoresNumero;

public class ContarDivisoresNumero {
    public long numeroDivisibles(int n){
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                contador++;
            }
        }
        return contador;
    }
}
