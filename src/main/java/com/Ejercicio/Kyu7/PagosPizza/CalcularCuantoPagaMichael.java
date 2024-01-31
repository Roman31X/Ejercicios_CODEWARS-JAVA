package com.Ejercicio.Kyu7.PagosPizza;

public class CalcularCuantoPagaMichael {
    public static double michaelPaga(double cost){
        double kate = 0;
        if(cost < 5){
            return Math.round((cost)*100.0)/100.0;
        }else{
            kate = (cost*1)/3;
            if(kate < 10){
                return Math.round((cost-kate)*100.0)/100.0;
            }else{
                return Math.round((cost - 10)*100.0)/100.0;
            }
        }
    }
}
