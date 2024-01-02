package com.Ejercicio.Kyu8.OperacionesBasicasMatematicas;

import static com.Ejercicio.Kyu8.OperacionesBasicasMatematicas.OperacionesMatematicas.matematicaBasica;

public class testOperacionesBasicas {
    public static void main(String[] args) {
        System.out.println("La siguiente operación (\"+\",4,7) nos dara : "+ matematicaBasica("+",4,7));
        System.out.println("La siguiente operación (\"-\",15,18) nos dara : "+ matematicaBasica("-",15,18));
        System.out.println("La siguiente operación (\"*\",5,5) nos dara : "+ matematicaBasica("*",5,5));
        System.out.println("La siguiente operación (\"/\",49,7) nos dara : "+ matematicaBasica("/",49,7));
    }
}
