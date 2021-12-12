package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int number;
        char choice;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number > largest)
                largest = number;
            if (number < smallest)
                smallest = number;
            System.out.print("Do you want to continue (Y/N)?: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.printf("Largest number is %d and the smallest number is %d.", largest, smallest);
    }
}
