package com.Ejercicio.Kyu8.CalcularEdad2099;

public class CalculoEdadPhilip {
    public static String CalculoAños(int birth,int yearTo){
        int edad = 0;
        edad = yearTo - birth;
        return (edad == 0)?"You were born this very year!":
               (edad > 0)?
               (edad == 1)?"You are "+edad+" year old.":
                       "You are "+edad+" years old.":
               (edad == -1)?"You will be born in "+(edad * -1)+" year.":
                       "You will be born in "+(edad * -1)+" years.";
    }
}
