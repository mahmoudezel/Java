package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.printf("%d ", number);
                counter++;
                if (counter % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean prime = true;
        int i = 2;
        while (number / 2 >= i) {
            if (number % i == 0) {
                prime = false;
                break;
            }
            ++i;
        }
        return prime;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static int reverse(int number) {
        String num = Integer.toString(number);
        String reversedNumber = "";
        for (int i = num.length() - 1; i >= 0; i--)
            reversedNumber += num.charAt(i);
        return Integer.parseInt(reversedNumber);
    }
}
