package com.pluralsight;

import java.util.Scanner;

class financialCalculators2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Main Money");
        double principal = keyboard.nextDouble();

        System.out.println("Interest Rate");
        double annualInterestRate = keyboard.nextDouble();

        System.out.println("Credit time");
        int years = keyboard.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

        // Monthly payment calculator
        double temp = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double monthlyPayment = principal * (monthlyInterestRate * temp) / (temp - 1);

        // Interest Maker
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest: $%.2f%n", totalInterest);

        keyboard.close();
    }
}