package com.Ejercicio.Kyu6.ContadorCaritasSonrientes;

import java.util.List;

public class ContarCaritasFelices {
    public static int contadorFeliz(List<String> arr){
        String carita = "";
        int contador = 0;
        for (int i = 0; i < arr.size(); i++) {
            carita = arr.get(i);
            if(carita.equals(":)") || carita.equals(":-)") || carita.equals(":~)") ||
                carita.equals(":D") || carita.equals(":-D") || carita.equals(":~D") ||
                 carita.equals(";D") || carita.equals(";-D") || carita.equals(";~D") ||
                  carita.equals(";)") || carita.equals(";-)") || carita.equals(";~)")){
                contador++;
            }
            carita = "";
        }
        return contador;
    }
}
