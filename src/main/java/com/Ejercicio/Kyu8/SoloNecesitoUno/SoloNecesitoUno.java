package com.Ejercicio.Kyu8.SoloNecesitoUno;

public class SoloNecesitoUno {
    public static boolean Verificar(Object[] a,Object x){
        boolean respuesta = false;
        for (int i = 0; i < a.length; i++) {
            if (x.equals(a[i])){
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }
}
