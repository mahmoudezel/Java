package com.company;

public class Main {

    public static void main(String[] args) {
        int firstPrime = 2;
        int temp;
        for (int secondPrime = 2; secondPrime <= 1000; secondPrime++) {
            if (isPrime(secondPrime)) {
                temp = firstPrime;
                firstPrime = secondPrime;
                secondPrime = temp;
            }
            if ((firstPrime - secondPrime) == 2)
                System.out.printf("(%d, %d)\n", secondPrime, firstPrime);
            if (isPrime(firstPrime) && isPrime(secondPrime))
                secondPrime = firstPrime;
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
}
