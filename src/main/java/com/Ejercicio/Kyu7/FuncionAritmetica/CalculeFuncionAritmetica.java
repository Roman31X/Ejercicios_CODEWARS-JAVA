package com.Ejercicio.Kyu7.FuncionAritmetica;

public class CalculeFuncionAritmetica {
    public static int aritmetica(int a, int b, String operator){
        switch (operator){
            case "add": return a+b;
            case "subtract": return a-b;
            case "multiply": return a*b;
            case "divide": return a/b;
            default: return 0;
        }
    }
}
