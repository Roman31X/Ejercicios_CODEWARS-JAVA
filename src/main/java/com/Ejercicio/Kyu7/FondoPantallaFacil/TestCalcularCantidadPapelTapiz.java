package com.Ejercicio.Kyu7.FondoPantallaFacil;

import static com.Ejercicio.Kyu7.FondoPantallaFacil.CalcularPapelTapiz.wallpaper;

public class TestCalcularCantidadPapelTapiz {
    public static void main(String[] args) {
        System.out.println("Test para calcular cuantos pliegos de papel tapiz necesito");
        System.out.println("Medidas [4,3.5,3] : "+wallpaper(4,3.5,3));
        System.out.println("Medidas [6.3,4.5,3.29] : "+wallpaper(6.3,4.5,3.29));
    }
}
