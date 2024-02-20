package com.Ejercicio.Kyu7.TuExyOh;

import org.junit.jupiter.api.DisplayName;

import static com.Ejercicio.Kyu7.TuExyOh.TuExyOh.getXO;

public class TestTuExyOh {
    public static void main(String[] args) {
        System.out.println("Test para verificar si tu ex te miente o no siempre mienten");
        System.out.println(" EX [ooxx] : dice "+getXO ("ooxx"));
        System.out.println(" EX [xooxx] : dice "+getXO ("xooxx"));
        System.out.println(" EX [ooxXm] : dice "+getXO ("ooxXm"));
        System.out.println(" EX [zpzpzpp] : dice "+getXO ("zpzpzpp"));
        System.out.println(" EX [zzoo] : dice "+getXO ("zzoo"));
        System.out.println(" EX [xxxooo] : dice "+getXO ("xxxooo"));
        System.out.println(" EX [xxxXooOo] : dice "+getXO ("xxxXooOo"));
        System.out.println(" EX [xxx23424esdsfvxXXOOooo] : dice "+getXO ("xxx23424esdsfvxXXOOooo"));
        System.out.println(" EX [xXxxoewrcoOoo] : dice "+getXO ("xXxxoewrcoOoo"));
        System.out.println(" EX [XxxxooO] : dice "+getXO ("XxxxooO"));
        System.out.println(" EX [zssddd] : dice "+getXO ("zssddd"));
        System.out.println(" EX [Xxxxertr34] : dice "+getXO ("Xxxxertr34"));
        System.out.println(" EX [''] : dice "+getXO ("''"));
        System.out.println(" EX [] : dice "+getXO (""));

    }
}
