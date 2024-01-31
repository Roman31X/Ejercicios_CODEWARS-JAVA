package com.Ejercicio.Kyu7.SeriePrincipiantesSumaNumeros;

public class CalcularSumaEntreNumeros {
    public int respuestaSuma(int a, int b){
        int acumulador = 0;
        if(a<b){
            while(a<=b){
                acumulador+=a;
                a++;
            }
        }else{
            while(b<=a){
                acumulador+=b;
                b++;
            }
        }
        return acumulador;
    }
}
