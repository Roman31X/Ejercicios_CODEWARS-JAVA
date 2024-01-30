package com.Ejercicio.Kyu6.NumerosDeLucas;

public class CalcularNumeroLucas {
    public static int lucasNumero(int n){
        if(n<0){
            if (n == -1) {
                return -1;
            }else {
                int a = 2;
                int b = 1;
                int lucas = 0;

                for (int i = -2; i >= n; i--) {
                    lucas = a + b;
                    a = b;
                    b = lucas;
                }
                if(n > -10 || n > -29) {
                    return lucas*-1;
                }else{
                    return lucas;
                }
            }
        }else{
            if (n == 0) {
                return 2;
            } else if (n == 1) {
                return 1;
            } else {
                int a = 2;
                int b = 1;
                int lucas = 0;

                for (int i = 2; i <= n; i++) {
                    lucas = a + b;
                    a = b;
                    b = lucas;
                }

                return lucas;
            }
        }
    }
}
