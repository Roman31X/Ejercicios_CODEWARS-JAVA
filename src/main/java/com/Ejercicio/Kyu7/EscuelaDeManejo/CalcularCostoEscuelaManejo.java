package com.Ejercicio.Kyu7.EscuelaDeManejo;

public class CalcularCostoEscuelaManejo {
    public static int costo(int mins){
        String precio = "";
        boolean estado = true;
        int total = 0, i = 0;
        while (estado){
            if(mins < 75 && i == 0){
                precio = "una";
                estado = false;
            }else if(mins >75 && i == 0){
                precio = "una";
            }else if(mins > 5){
                precio = "media";
            }else{
                precio = "salida";
            }
            switch (precio){
                case "una":total+=30;mins-=60;i=1;break;
                case "media":total+=10;mins-=30;break;
                case "salida":estado = false;
            }
            precio="";
        }
        return total;
    }
}
