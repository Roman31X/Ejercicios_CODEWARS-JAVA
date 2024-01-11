package com.Ejercicio.Kyu8.CalcularEdad2099;

import static com.Ejercicio.Kyu8.CalcularEdad2099.CalculoEdadPhilip.CalculoAños;

public class testCalcularEdad {
    public static void main(String[] args) {
        System.out.println("Test de prueba para calcular edad Philip");
        System.out.println("Entre los años [2012, 2016] : "+CalculoAños(2012,2016));
        System.out.println("Entre los años [1989, 2016] : "+CalculoAños(1989, 2016));
        System.out.println("Entre los años [2000, 2090] : "+CalculoAños(2000, 2090));
        System.out.println("Entre los años [2000, 1990] : "+CalculoAños(2000, 1990));
        System.out.println("Entre los años [3400, 3400] : "+CalculoAños(3400, 3400));
        System.out.println("Entre los años [900, 2900] : "+CalculoAños(900, 2900));
        System.out.println("Entre los años [2010, 1900] : "+CalculoAños(2010, 1900));
        System.out.println("Entre los años [2010, 1500] : "+CalculoAños(2010, 1500));
        System.out.println("Entre los años [2011, 2012] : "+CalculoAños(2011, 2012));
        System.out.println("Entre los años [2000, 1999] : "+CalculoAños(2000, 1999));
    }
}
