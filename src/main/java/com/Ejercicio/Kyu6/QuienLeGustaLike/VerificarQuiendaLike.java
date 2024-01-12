package com.Ejercicio.Kyu6.QuienLeGustaLike;

public class VerificarQuiendaLike {
    public static String quienLDioLike(String... name){
        if(name.length == 0){
            return "no one likes this";
        }else{
            return (name.length == 1)?name[0]+" likes this":
                    (name.length == 2)?name[0]+" and "+name[1]+" like this":
                            (name.length == 3)?name[0]+", "+name[1]+" and "+name[2]+" like this":
                                    name[0]+", "+name[1]+" and "+(name.length - 2)+" others like this";
        }
    }
}
