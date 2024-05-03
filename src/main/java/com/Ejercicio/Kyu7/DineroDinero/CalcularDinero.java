package com.Ejercicio.Kyu7.DineroDinero;

public class CalcularDinero {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;

        while (principal < desired) {
            double interestEarned = principal * interest;
            double taxesPaid = interestEarned * tax;
            principal += interestEarned - taxesPaid;
            years++;
        }

        return years;
    }
}
