package com.Ejercicio.Kyu7.FondoPantallaFacil;

public class CalcularPapelTapiz {
    public static String wallpaper(double l, double w, double h){
        double areaTotal = 2 * (l + w) * h;  // Área total de papel tapiz necesaria en metros cuadrados
        double areaRollo = 0.52 * 10 * 1.15;   //5.98

        int rollosNecesarios = (int) Math.ceil(areaTotal / areaRollo);

        // Usa el array numbers para obtener la palabra en inglés para la cantidad de rollos
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

        // Asegúrate de que el índice esté dentro del rango válido
        int indice = (rollosNecesarios >= 0 && rollosNecesarios <= 20) ? rollosNecesarios : 0;

        return numbers[indice];
    }
}
