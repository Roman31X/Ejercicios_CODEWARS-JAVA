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
                    if(yearCat >= 15){
                        gato++;yearCat -= 15;
                    }else{
                        yearCat = 0;
                    }
                    if(yearDog >= 15){
                        perro++;  yearDog-= 15;
                    }else{
                        yearDog = 0;
                    }
                }else if (i == 1) {
                    if(yearCat >= 9){
                        gato++;yearCat -= 9;
                    }else{
                        yearCat = 0;
                    }
                    if(yearDog >= 9){
                        perro++;  yearDog-= 9;
                    }else{
                        yearDog = 0;
                    }
                }else{
                    if(yearCat >= 4){
                        gato++;
                        yearCat-= 4;
                    }else{
                        yearCat = 0;
                    }
                    if(yearDog >= 5){
                        perro++;
                        yearDog-= 5;
                    }else{
                        yearDog = 0;
                    }
                }
                i++;
            }while(yearCat > 0 || yearDog > 0);
        }
        return new int[]{gato,perro};
    }
}
