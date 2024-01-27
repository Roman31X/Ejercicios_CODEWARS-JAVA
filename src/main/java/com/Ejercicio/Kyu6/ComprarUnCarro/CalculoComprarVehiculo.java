package com.Ejercicio.Kyu6.ComprarUnCarro;

public class CalculoComprarVehiculo {
    public static int[] nuevoCarro(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth){
        double precioViejo = startPriceOld, precioNuevo = startPriceNew, ahorroMes = 0;
        int mes = 0;
        while((precioViejo + ahorroMes) < precioNuevo){
            mes++;
            if (mes % 2 == 0) {
                percentLossByMonth = percentLossByMonth +  0.5;
            }

            precioViejo = (precioViejo - precioViejo * (percentLossByMonth/100));
            precioNuevo = (precioNuevo - precioNuevo * (percentLossByMonth/100));
            ahorroMes += savingperMonth;
        }
        int restanteDinero = (int) Math.round(precioViejo + ahorroMes - precioNuevo);

        return new int[]{mes, restanteDinero};
    }
}
