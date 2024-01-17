package com.Ejercicio.Kyu7.CalcularaniosPerrosGatos;

public class CalcularaniosPerrosGatos {
    public static int[] CalcularGatosPerros(final int catYears,final int dogYears){
        int yearCat = catYears, yearDog = dogYears;
        int gato = 0, perro = 0;
        if(yearCat == 0 && yearDog == 0){
            System.out.println("Debe ingresar un numero entero mayor a 0");
        }else{
            int i = 1;
            do{
                if(i == 1){
                    gato++; perro++; yearCat -= 15; yearDog-= 15;
                } else if (i == 2) {
                    gato++; perro++; yearCat -= 9; yearDog-= 9;
                }else {
                    if(yearCat >= 0){
                        gato++;
                    }else{

                    }
                    yearCat -= 4; yearDog-= 5;
                }
                i++;
            }while(yearCat == 0 && yearDog == 0);
        }
        return new int[]{gato,perro};
    }
}
