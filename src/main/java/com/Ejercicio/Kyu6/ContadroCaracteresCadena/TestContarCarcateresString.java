package com.Ejercicio.Kyu6.ContadroCaracteresCadena;

import java.util.*;

import static com.Ejercicio.Kyu6.ContadroCaracteresCadena.ContarCarcateresString.contador;

public class TestContarCarcateresString {
    public static void main(String[] args) {
        System.out.println("Test para contar repeticiones de carácter en Cadena String");
        System.out.println("Palabra [a] caracteres y veces que se repite");
        Map<Character,Integer> palabra = contador("a");
        for (Map.Entry<Character,Integer> caracter : palabra.entrySet()) {
            System.out.println("'"+caracter.getKey()+"' : "+caracter.getValue()+" veces");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Palabra [aabbbac] caracteres y veces que se repite");
        Map<Character,Integer> palabra2 = contador("aabbbac");
        for (Map.Entry<Character,Integer> caracter : palabra2.entrySet()) {
            System.out.println("'"+caracter.getKey()+"' : "+caracter.getValue()+" veces");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Palabra [abc] caracteres y veces que se repite");
        Map<Character,Integer> palabra3 = contador("abc");
        for (Map.Entry<Character,Integer> caracter : palabra3.entrySet()) {
            System.out.println("'"+caracter.getKey()+"' : "+caracter.getValue()+" veces");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Palabra [aaaaa] caracteres y veces que se repite");
        Map<Character,Integer> palabra4 = contador("aaaaa");
        for (Map.Entry<Character,Integer> caracter : palabra4.entrySet()) {
            System.out.println("'"+caracter.getKey()+"' : "+caracter.getValue()+" veces");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Palabra [aabb] caracteres y veces que se repite");
        Map<Character,Integer> palabra5 = contador("aabb");
        for (Map.Entry<Character,Integer> caracter : palabra5.entrySet()) {
            System.out.println("'"+caracter.getKey()+"' : "+caracter.getValue()+" veces");
        }
    }
}
