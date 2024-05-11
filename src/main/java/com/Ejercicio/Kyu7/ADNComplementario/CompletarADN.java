package com.Ejercicio.Kyu7.ADNComplementario;

public class CompletarADN {
    public static String makeComplement(String dna) {
        StringBuilder complement = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            char nucleotide = dna.charAt(i);
            char complementNucleotide = getComplement(nucleotide);
            complement.append(complementNucleotide);
        }

        return complement.toString();
    }

    private static char getComplement(char nucleotide) {
        switch (nucleotide) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
        }
    }
}
