package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userGuess, counter = 0;
        int rightNumber = random.nextInt(101);
        do {
            System.out.print("Guess the right number to win (from 0 to 100): ");
            userGuess = scanner.nextInt();
            ++counter;
            if (userGuess > rightNumber)
                System.out.print("Too high, try again.\n");
            else if (userGuess < rightNumber)
                System.out.print("Too low, try again.\n");
            else
                System.out.printf("Congratulations! Your guess %d is right after %d tries.\n", userGuess, counter);
        } while (userGuess != rightNumber);
    }
}
