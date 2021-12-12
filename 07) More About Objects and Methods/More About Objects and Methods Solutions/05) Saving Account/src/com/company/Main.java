package com.company;

class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double interestRate;
        interestRate = savingsBalance * annualInterestRate / 12;
        savingsBalance += interestRate;
        return interestRate;
    }

    public static void modifyInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
}

public class Main {

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.0);
        SavingAccount saver2 = new SavingAccount(3000.0);
        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        System.out.printf("Balance : %.2f\n", saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("Balance : %.2f\n", saver2.getSavingsBalance());
        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        System.out.printf("Balance : %.2f\n", saver1.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("Balance : %.2f\n", saver2.getSavingsBalance());
    }
}