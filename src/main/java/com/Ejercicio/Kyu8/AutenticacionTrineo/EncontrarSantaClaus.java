package com.Ejercicio.Kyu8.AutenticacionTrineo;

public class EncontrarSantaClaus {
    public static Boolean authenticate(String name, String password){
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}
