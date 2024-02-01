package com.Ejercicio.Kyu8.RepeticionCuerda;

public class RepeticionCuerdaString {
    public static String repetirCuerda(final int repeat, final String string){
        String nueva = "";
        for (int i = 0; i < repeat; i++) {
            nueva+=string;
        }
        return nueva;
    }
}
