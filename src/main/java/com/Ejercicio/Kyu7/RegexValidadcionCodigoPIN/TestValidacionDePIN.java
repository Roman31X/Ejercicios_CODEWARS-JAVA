package com.Ejercicio.Kyu7.RegexValidadcionCodigoPIN;

import java.sql.SQLOutput;

import static com.Ejercicio.Kyu7.RegexValidadcionCodigoPIN.ValidacionPIN.valiidarPin;

public class TestValidacionDePIN {
    public static void main(String[] args) {
        System.out.println("Teste de validación de ping NUMERICOS DE 4 y 6 DIGITOS");
        System.out.println("|| VALORES DENTRO DEL RANGO 4 Y 6 : TRUE ||");
        System.out.println("PIN : 1234 : es "+valiidarPin("1234"));
        System.out.println("PIN : 0000 : es "+valiidarPin("0000"));
        System.out.println("PIN : 1111 : es "+valiidarPin("1111"));
        System.out.println("PIN : 123456 : es "+valiidarPin("123456"));
        System.out.println("PIN : 098765 : es "+valiidarPin("098765"));
        System.out.println("PIN : 000000 : es "+valiidarPin("000000"));
        System.out.println("PIN : 090909 : es "+valiidarPin("090909"));
        //VALORES FALSOS
        System.out.println("|*****************************************|");
        System.out.println("|| VALORES CON CARACTERES PIN : FALSE ||");
        System.out.println("PIN : a234 : es "+valiidarPin("a234"));
        System.out.println("PIN : .234 : es "+valiidarPin(".234"));
        //VALORES RANDOM
        System.out.println("|*****************************************|");
        System.out.println("|| VALORES RANDOM DE PIN : FALSE ||");
        System.out.println("PIN : 1 : es "+valiidarPin("1"));
        System.out.println("PIN : 12 : es "+valiidarPin("12"));
        System.out.println("PIN : 123 : es "+valiidarPin("123"));
        System.out.println("PIN : 12345 : es "+valiidarPin("12345"));
        System.out.println("PIN : 1234567 : es "+valiidarPin("1234567"));
        System.out.println("PIN : -1234 : es "+valiidarPin("-1234"));
        System.out.println("PIN : 1.234 : es "+valiidarPin("1.234"));
        System.out.println("PIN : 00000000 : es "+valiidarPin("00000000"));
    }
}
