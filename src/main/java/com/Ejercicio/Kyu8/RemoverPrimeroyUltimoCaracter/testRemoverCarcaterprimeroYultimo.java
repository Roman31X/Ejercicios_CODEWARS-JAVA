package com.Ejercicio.Kyu8.RemoverPrimeroyUltimoCaracter;

import static com.Ejercicio.Kyu8.RemoverPrimeroyUltimoCaracter.RemoverPrimero_Ultimo.remover;

public class testRemoverCarcaterprimeroYultimo {
    public static void main(String[] args) {
        System.out.println("Extraer la primer y ultimo carácter de las siguientes palabras");
        System.out.println("[1 - eloquent] : "+remover("eloquent"));
        System.out.println("[2 - country] : "+remover("country"));
        System.out.println("[3 - person] : "+remover("person"));
        System.out.println("[4 - place] : "+remover("place"));
        System.out.println("[5 - switch] : "+remover("switch"));
    }
}
