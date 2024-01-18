package com.Ejercicio.Kyu7.CalcularaniosPerrosGatos;

public class CalcularaniosPerrosGatos {
    public static int[] CalcularGatosPerros(final int catYears,final int dogYears){
        int yearCat = catYears, yearDog = dogYears;
        int gato = 0, perro = 0;
        int i = 0;
        if(yearCat == 0 && yearDog == 0){
            System.out.println("Debe ingresar un numero entero mayor a 0");
        }else{
            do{
                if(i == 0){
                    gato++; perro++; yearCat -= 15; yearDog-= 15;
                }else if (i == 1) {
                    gato++; perro++; yearCat -= 9; yearDog-= 9;
                }else if(i >= 2){
                    if(yearCat >= 4){
                        gato++;
                        yearCat-= 4;
                    }else{
                        yearCat=0;
                    }
                    if(yearDog >= 5){
                        perro++;
                        yearDog-= 5;
                    }else{
                        yearDog=0;
                    }
                    System.out.println(yearCat+" - "+yearDog);
                }
                i++;
            }while(yearCat == 0 && yearDog == 0);
        }
        return new int[]{gato,perro};
    }
}
