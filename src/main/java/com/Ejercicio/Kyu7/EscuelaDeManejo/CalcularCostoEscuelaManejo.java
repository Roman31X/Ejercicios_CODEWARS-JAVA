package com.Ejercicio.Kyu7.EscuelaDeManejo;

public class CalcularCostoEscuelaManejo {
    public static int costo(int mins){
        String precio = "";
        boolean estado = true;
        int total = 0, i = 0;
        while (estado){
            if(i == 0){
                if(mins < 75){
                    precio = "una";
                    estado = false;
                }
            }else if(i == 1){
                if(mins >75){
                    precio = "una";
                }else if(mins < 60){
                    precio = "media";
                }else{
                    precio = "salida";
                }
            }
            switch (precio){
                case "una":total+=30;mins-=60;break;
                case "media":total+=10;mins-=30;break;
                case "salida":estado = false;
            }
            precio="";
            i=1;
        }
        return total;
    }
}
