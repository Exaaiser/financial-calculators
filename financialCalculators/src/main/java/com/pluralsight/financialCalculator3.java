package com.pluralsight;

import java.util.Scanner;

public class financialCalculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Monthly Payment");
        double monthlyPayment = scanner.nextDouble();

        System.out.println("Approximately Yearly Interest Rate");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Pay Time");
        int years = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

        double presentValue = monthlyPayment *
                ((1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)) / monthlyInterestRate);

        System.out.printf("Value of today:%f", presentValue);




    }
}
