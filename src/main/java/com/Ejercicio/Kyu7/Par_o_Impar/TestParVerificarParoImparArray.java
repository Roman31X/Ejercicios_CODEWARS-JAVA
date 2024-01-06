package com.Ejercicio.Kyu7.Par_o_Impar;

import static com.Ejercicio.Kyu7.Par_o_Impar.VerificarSumaParImpar.sumaParImpar;

public class TestParVerificarParoImparArray {
    public static void main(String[] args) {
        System.out.println("Test para verificar si la suma de los números de un Array es par o impar");
        System.out.println("Primer ejemplo Array[0] : "+sumaParImpar(new int[]{0}));
        System.out.println("Primer ejemplo Array[0,1,4] : "+sumaParImpar(new int[]{0,1,4}));
        System.out.println("Primer ejemplo Array[0,-1,-5] : "+sumaParImpar(new int[]{0,-1,-5}));
        System.out.println("Primer ejemplo Array[2,5,34,6] : "+sumaParImpar(new int[]{2,5,34,6}));

    }
}
