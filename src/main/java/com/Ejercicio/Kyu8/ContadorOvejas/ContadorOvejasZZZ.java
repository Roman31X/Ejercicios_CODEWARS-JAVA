package com.Ejercicio.Kyu8.ContadorOvejas;
public class ContadorOvejasZZZ {
    public int contadorOvejas(Boolean[] arrayOfSheeps){
        int ovejas = 0;
        if(arrayOfSheeps == null){
            return ovejas;
        }else{
            for (Boolean posicion : arrayOfSheeps) {
                if(Boolean.TRUE.equals(posicion)){
                    ovejas++;
                }
            }
            return ovejas;
        }
    }
}
