package com.company;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class CreditCard {
    private double balance;
    private String cardNumber;
    private final String nameOnCard;
    private YearMonth expiryDate;
    private String CVV;

    CreditCard(double balance, String cardNumber, String nameOnCard, YearMonth expiryDate, String CVV) {
        if (balance >= 0)
            this.balance = balance;

        if (isValid(cardNumber))
            this.cardNumber = cardNumber;

        if (expiryDate.isAfter(YearMonth.now()))
            this.expiryDate = expiryDate;

        if (CVV.length() == 3)
            this.CVV = CVV;

        this.nameOnCard = nameOnCard.toUpperCase();
    }

    public void withdraw(double balance) {
        System.out.println("Please wait while your transaction is processing...");
        if (balance > 0 && this.balance >= balance){
            this.balance -= balance;
            System.out.printf("Transaction Approved!\nYour new balance is: %.2f\n", this.balance);
        }
        else
            System.out.print("Transaction Denied!\n");
    }

    public void deposit(double balance) {
        System.out.println("Please wait while your transaction is processing...");
        if (balance > 0){
            this.balance += balance;
            System.out.printf("Transaction Approved!\nYour new balance is: %.2f\n", this.balance);
        }
        else
            System.out.print("Transaction Denied!\n");
    }

    public void remainingBalance() {
        System.out.println("Please wait while your transaction is processing...");
        System.out.printf("Your balance is: %.2f\n", this.balance);
    }

    public void cardInformation() {
        System.out.println("Please wait while your transaction is processing...");
        System.out.printf("Credit Card Information\n" +
                "Name on card: %s\n" +
                "Card number: %s\n" +
                "Expiry date: %s\n" +
                "CVV: %s\n" +
                "Balance: %.2f\n", this.nameOnCard, this.cardNumber, this.expiryDate, this.CVV, this.balance);
    }

    public void changeCardNumber() {
        String cardNumber;
        int[] cardPrefix = {4, 5, 37, 6};
        Random random = new Random();
        do {
            cardNumber = "";
            cardNumber += cardPrefix[random.nextInt(4)];
            while (cardNumber.length() < 16)
                cardNumber += random.nextInt(10);
        } while (!isValid(cardNumber));
        this.cardNumber = cardNumber;
        System.out.printf("Your new card number is: %s\n", this.cardNumber);
    }

    public boolean isValid(String cardNumber) {
        return (prefixMatched(cardNumber, 4) || prefixMatched(cardNumber, 5) ||
                prefixMatched(cardNumber, 37) || prefixMatched(cardNumber, 6)) &&
                ((sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber)) % 10 == 0);
    }

    /** Return true if the card number is valid */
    public void isValid() {
        if ((prefixMatched(cardNumber, 4) || prefixMatched(cardNumber, 5) ||
                prefixMatched(cardNumber, 37) || prefixMatched(cardNumber, 6)) &&
                ((sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber)) % 10 == 0))
            System.out.printf("%s is valid.\n", cardNumber);
        else
            System.out.printf("%s is not valid.\n", cardNumber);
    }

    /** Get the result from Step 2  */
    private int sumOfDoubleEvenPlace(String number) {
        int sumOfDoubleEven = 0;
        for (int i = number.length() - 2; i >= 0; i -= 2)
            sumOfDoubleEven += getDigit(Character.getNumericValue(number.charAt(i)) * 2);
        return sumOfDoubleEven;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    private int getDigit(int number) {
        return Integer.toString(number).length() == 1 ? number : Character.getNumericValue(Integer.toString(number).charAt(0)) + Character.getNumericValue(Integer.toString(number).charAt(1));
    }

    /** Return sum of odd-place digits in number  */
    private int sumOfOddPlace(String number) {
        int sumOfOdd = 0;
        for (int i = number.length() - 1; i >= 0; i -= 2)
            sumOfOdd += Character.getNumericValue(number.charAt(i));
        return sumOfOdd;
    }

    /** Return true if the digit d is a prefix for number */
    private boolean prefixMatched(String number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the number of digits in d */
    private int getSize(long d) {
        return Long.toString(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    private long getPrefix(String number, int k) {
        return number.length() < k ? Long.parseLong(number) : Long.parseLong(number.substring(0, k));
    }
}

public class Main {

    public static void main(String[] args) {
        double balance = 1000;
        String cardNumber = "4388576018410707";
        String nameOnCard = "mahmoud abas mohamed";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        YearMonth expiryDate = YearMonth.parse("10/25", formatter);
        String CVV = "198";
        CreditCard AhlyBankCard = new CreditCard(balance, cardNumber, nameOnCard, expiryDate, CVV);
        AhlyBankCard.withdraw(100);
        AhlyBankCard.deposit(50);
        AhlyBankCard.remainingBalance();
        AhlyBankCard.cardInformation();
        AhlyBankCard.isValid();
        AhlyBankCard.changeCardNumber();
        AhlyBankCard.isValid();
    }
}
