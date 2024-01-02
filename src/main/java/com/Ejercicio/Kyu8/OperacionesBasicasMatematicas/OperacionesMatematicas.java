package com.Ejercicio.Kyu8.OperacionesBasicasMatematicas;

public class OperacionesMatematicas {
    public static Integer matematicaBasica(String op,int valor1, int valor2){
        int resultado = 0;
        switch (op){
            case "+":
                resultado = (valor1 + valor2);
                break;
            case "-":
                resultado = (valor1 - valor2);
                break;
            case "*":
                resultado = (valor1 * valor2);
                break;
            case "/":
                resultado = (valor1 / valor2);
                break;
        }
        return resultado;
    }
}
