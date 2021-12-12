package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = scanner.nextLong();
        if (isValid(number))
            System.out.printf("%d is valid\n", number);
        else
            System.out.printf("%d is invalid\n", number);
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        return (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        String cardNumber = Long.toString(number);
        int sumOfDoubleEven = 0;
        for (int i = cardNumber.length() - 2; i >= 0; i -= 2)
            sumOfDoubleEven += getDigit(Character.getNumericValue(cardNumber.charAt(i)) * 2);
        return sumOfDoubleEven;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        return Integer.toString(number).length() == 1 ? number : Character.getNumericValue(Integer.toString(number).charAt(0)) + Character.getNumericValue(Integer.toString(number).charAt(1));
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        String cardNumber = Long.toString(number);
        int sumOfOdd = 0;
        for (int i = cardNumber.length() - 1; i >= 0; i -= 2)
            sumOfOdd += Character.getNumericValue(cardNumber.charAt(i));
        return sumOfOdd;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String cardNumber = number + "";
        return cardNumber.length() < k ? number : Long.parseLong(cardNumber.substring(0, k));
    }
}
