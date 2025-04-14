package com.pluralsight;

import java.util.Scanner;

class financialcalculators {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Starting Value");
        double principal = keyboard.nextDouble();

        System.out.println("Yearly Interest Rate");
        double annualInterestRate = keyboard.nextDouble();

        System.out.println("Year");
        int years = keyboard.nextInt();

        //Calculate

        double dailyInterestRate = (annualInterestRate /100) /365;
        double futureValue = principal * Math.pow(1 + dailyInterestRate, 365 * years);
        double totalInterest = futureValue - principal;

        System.out.printf("Value at Future: $%.2f%n", futureValue);
        System.out.printf("Gained Feature Interest: $%.2f%n", totalInterest);

        keyboard.close();
    } }