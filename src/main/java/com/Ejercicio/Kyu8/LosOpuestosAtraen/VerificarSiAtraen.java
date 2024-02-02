package com.Ejercicio.Kyu8.LosOpuestosAtraen;

public class VerificarSiAtraen {
    public static boolean esAmor(final int flower1,final int flower2){
        return (flower1%2==0 && flower2%2 != 0 || flower2%2==0 && flower1%2 != 0)?true:false;
    }
}
