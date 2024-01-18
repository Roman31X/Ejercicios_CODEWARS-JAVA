package com.Ejercicio.Kyu8.ContadorOvejas;

public class TestContadorOvejas {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println("Test de prueba para contar Ovejas");
        ContadorOvejasZZZ oveja = new ContadorOvejasZZZ();
        System.out.println("Cuantas ovejas hay en este Array : "+oveja.contadorOvejas(array1));
    }
}
