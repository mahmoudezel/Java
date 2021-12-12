package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, reminder;
        String reversedNumber = "";
        System.out.print("Enter an integer number: ");
        number = scanner.nextInt();
        while (number > 0){
            reminder = number % 10;
            reversedNumber += Integer.toString(reminder);
            number /= 10;
        }
        System.out.printf("number is reversed to %s.\n", reversedNumber);
    }
}
