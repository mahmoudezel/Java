package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double INTEREST_RATE = .0749;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your remaining loan balance: ");
        double balanceAmount = scanner.nextDouble();
        double monthlyInterest = ((balanceAmount * INTEREST_RATE)/12);
        System.out.print("Enter the amount of your monthly mortgage payment: ");
        double monthlyPaymentAmount = scanner.nextDouble();
        double monthlyPrincipleAmount = (monthlyPaymentAmount - monthlyInterest);
        System.out.printf("Payment Amount: %f\n", monthlyPaymentAmount);
        System.out.printf("Monthly Interest: %f\n", monthlyInterest);
        System.out.printf("Principle Amount: %f\n", monthlyPrincipleAmount);
    }
}
