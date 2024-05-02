package com.Ejercicio.Kyu8.BienvenidoACiudad;

public class BienvenidaAlaCiudad {
    public String sayHello(String [] name, String city, String state){
        String fullName = String.join(" ", name);
        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }
}
