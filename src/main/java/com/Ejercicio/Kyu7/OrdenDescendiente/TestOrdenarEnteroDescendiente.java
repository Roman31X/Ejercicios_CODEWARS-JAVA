package com.Ejercicio.Kyu7.OrdenDescendiente;

import static com.Ejercicio.Kyu7.OrdenDescendiente.OrganizarEnteroDescendiente.ordenDesendente;

public class TestOrdenarEnteroDescendiente {
    public static void main(String[] args) {
        System.out.println("Test de organizar números descendientemente enteros positivos");
        System.out.println("Número [42145] : "+ordenDesendente(42145));
        System.out.println("Número [145263] : "+ordenDesendente(145263));
        System.out.println("Número [123456789] : "+ordenDesendente(123456789));
    }
}
