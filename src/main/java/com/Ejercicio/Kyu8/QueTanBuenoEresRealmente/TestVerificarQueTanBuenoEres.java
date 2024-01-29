package com.Ejercicio.Kyu8.QueTanBuenoEresRealmente;

import static com.Ejercicio.Kyu8.QueTanBuenoEresRealmente.CalcularPromedio.berificarPuntaje;

public class TestVerificarQueTanBuenoEres {
    public static void main(String[] args) {
        System.out.println("Test para verificar que tan bueno eres realmente");
        System.out.println("Salon [2, 3] - MI NOTA [5] : "+berificarPuntaje(new int[]{2,3},5));
        System.out.println("Salon [100, 40, 34, 57, 29, 72, 57, 88] - MI NOTA [75] : "+berificarPuntaje(new int[]{100, 40, 34, 57, 29, 72, 57, 88},75));
        System.out.println("Salon [12, 23, 34, 45, 56, 67, 78, 89, 90] - MI NOTA [69] : "+berificarPuntaje(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println("Salon [100,90] - MI NOTA [11] : "+berificarPuntaje(new int[]{100,90},11));
    }
}
