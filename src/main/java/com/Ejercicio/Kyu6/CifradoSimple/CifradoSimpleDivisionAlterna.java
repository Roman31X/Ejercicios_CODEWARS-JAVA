package com.Ejercicio.Kyu6.CifradoSimple;

public class CifradoSimpleDivisionAlterna {

    public static String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty() || n <= 0) {
          return text;
        }

        String result = text;
            for (int i = 0; i < n; i++) {
            result = encryptOnce(result);
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty() || n <= 0) {
            return encryptedText;
        }

        String result = encryptedText;
        for (int i = 0; i < n; i++) {
            result = decryptOnce(result);
        }
        return result;
    }

    private static String encryptOnce(final String text) {
        StringBuilder oddChars = new StringBuilder();
        StringBuilder evenChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                evenChars.append(text.charAt(i));
            } else {
                oddChars.append(text.charAt(i));
            }
        }

        return oddChars.toString() + evenChars.toString();
    }

    private static String decryptOnce(final String encryptedText) {
        int halfLength = encryptedText.length() / 2;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < halfLength; i++) {
            result.append(encryptedText.charAt(halfLength + i));
            result.append(encryptedText.charAt(i));
        }

        if (encryptedText.length() % 2 != 0) {
            result.append(encryptedText.charAt(encryptedText.length() - 1));
        }

        return result.toString();
    }
}
