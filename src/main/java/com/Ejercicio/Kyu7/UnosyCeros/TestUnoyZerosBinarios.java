package com.Ejercicio.Kyu7.UnosyCeros;

import java.util.ArrayList;
import java.util.Arrays;

import static com.Ejercicio.Kyu7.UnosyCeros.ConvertirBinarios.ConvertidorBinarioArray;

public class TestUnoyZerosBinarios {
    public static void main(String[] args) {
        System.out.println("Test para convertir Ceros y Unos a Decimal de un Lis<>");
        System.out.println("List<0,0,0,1> : Decimal = "+ConvertidorBinarioArray(new ArrayList<>(Arrays.asList(0,0,0,1))));
        System.out.println("List<1,1,1,1> : Decimal = "+ConvertidorBinarioArray(new ArrayList<>(Arrays.asList(1,1,1,1))));
        System.out.println("List<0,1,1,0> : Decimal = "+ConvertidorBinarioArray(new ArrayList<>(Arrays.asList(0,1,1,0))));
        System.out.println("List<1,0,0,1> : Decimal = "+ConvertidorBinarioArray(new ArrayList<>(Arrays.asList(1,0,0,1))));

    }
}
