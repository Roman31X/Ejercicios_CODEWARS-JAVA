package com.Ejercicio.Kyu6.SistemaContraseña;

import static com.Ejercicio.Kyu6.SistemaContraseña.VerificarContraseñaSistema.verificarContrasenia;

public class TestVerificacionContraseniaaSistema {
    public static void main(String[] args) {
        System.out.println("Test de prueba de Verificación de Contraseñas");
        System.out.println("Contraseña [1,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1] : es ["+verificarContrasenia(new int[]{1,1,0,12,0,0,0,1,1,0,0,0,1,0,1,1})+"]");
        System.out.println("Contraseña [1,1,0,0,0,0,1,1,0] : es ["+verificarContrasenia(new int[]{1,1,0,0,0,0,1,1,0})+"]");
    }
}
