package com.Ejercicio.Kyu8.Años_Gatos_Perros;

public class AñosGatosyPerros {
    public static int[] yearsHumanosGatosPerros(final int humanoAnios){
        int yearCat = 0,yearDog = 0;
        if(humanoAnios <= 0){
            System.out.println("Debe ingresar un numero entero mayor a 0");;
        }
        for (int i = 1; i <= humanoAnios; i++) {
            yearCat += (i==1)?15:(i==2)?9:(i>2)?4:0;
            yearDog += (i==1)?15:(i==2)?9:(i>2)?5:0;
        }
        return new int[]{humanoAnios,yearCat,yearDog};
    }
}
