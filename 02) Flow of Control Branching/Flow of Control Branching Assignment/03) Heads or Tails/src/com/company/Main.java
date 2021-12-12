package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please guess (0 for head/ 1 for tail): ");
        int userGuess = scanner.nextInt();
        Random random = new Random();
        int headOrTail = random.nextInt(2);
        if (userGuess == headOrTail)
            System.out.println("You guessed the right answer!");
        else
            System.out.println("You guessed the wrong answer!");
    }
}
