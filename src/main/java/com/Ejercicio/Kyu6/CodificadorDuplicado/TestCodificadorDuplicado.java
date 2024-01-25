package com.Ejercicio.Kyu6.CodificadorDuplicado;

import static com.Ejercicio.Kyu6.CodificadorDuplicado.CodificadorDuplicados.duplicadoCodigo;

public class TestCodificadorDuplicado {
    public static void main(String[] args) {
        System.out.println("Test para codificar cadenas con sus caracteres repetidos");
        System.out.println("Palabra [Prespecialized] : codificado a => "+duplicadoCodigo("Prespecialized"));
        System.out.println("Palabra [   ()(   ] : codificado a => "+duplicadoCodigo("   ()(   "));
        System.out.println("Palabra [din] : codificado a => "+duplicadoCodigo("din"));
        System.out.println("Palabra [recede] : codificado a => "+duplicadoCodigo("recede"));
        System.out.println("Palabra [Success] : codificado a => "+duplicadoCodigo("Success"));
        System.out.println("Palabra [(( @] : codificado a => "+duplicadoCodigo("(( @"));
    }
}
