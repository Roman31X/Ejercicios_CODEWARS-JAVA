package com.Ejercicio.Kyu6.ContadorCaritasSonrientes;

import java.util.*;

import static com.Ejercicio.Kyu6.ContadorCaritasSonrientes.ContarCaritasFelices.contadorFeliz;

public class TestContadorCaritasFelices {
    public static void main(String[] args) {
        System.out.println("Test para contar caritas dentro de un List");
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println("List [\":)\",\"XD\",\":0}\",\"x:-\",\"):-\",\"D:\"] : "+contadorFeliz(a));
    }
}
