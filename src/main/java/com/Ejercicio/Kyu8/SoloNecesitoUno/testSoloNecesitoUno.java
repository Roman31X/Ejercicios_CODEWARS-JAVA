package com.Ejercicio.Kyu8.SoloNecesitoUno;

import static com.Ejercicio.Kyu8.SoloNecesitoUno.SoloNecesitoUno.Verificar;

public class testSoloNecesitoUno {
    public static void main(String[] args) {
        System.out.println("Verificar si el arreglo contiene el objeto");
        System.out.println("Primer Arreglo se busca (6) : [66,101] la respuesta es : "+
                Verificar(new Object[]{66,101},66));
        System.out.println("Primer Arreglo se busca (45) : [80,117,115,104,45,85,112,115] la respuesta es : "+
                Verificar(new Object[]{80,117,115,104,45,85,112,115},45));
        System.out.println("Primer Arreglo se busca (e) : ['t','e','s','t'] la respuesta es : "+
                Verificar(new Object[]{'t','e','s','t'},'e'));
        System.out.println("Primer Arreglo se busca (kat) : [\"what\",\"a\",\"great\",\"kata\"] la respuesta es : "+
                Verificar(new Object[]{"what","a","great","kata"},"kat"));
    }
}
