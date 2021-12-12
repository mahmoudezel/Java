package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean prime = true;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int i = 2;
        while (number / 2 >= i){
            if (number % i == 0){
                prime = false;
                break;
            }
            ++i;
        }
        if (prime)
            System.out.printf("number %d is prime.\n", number);
        else
            System.out.printf("number %d is not prime.\n", number);
    }
}
