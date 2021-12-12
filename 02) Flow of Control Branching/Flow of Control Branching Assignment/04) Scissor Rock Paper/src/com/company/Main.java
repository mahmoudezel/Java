package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = scanner.nextInt();
        Random random = new Random();
        int scissorRockPaper = random.nextInt(3);
        if (userChoice == 0 && scissorRockPaper == 2)
            System.out.println("The computer is paper. You are scissor. You won");
        else if (userChoice == 2 && scissorRockPaper == 1)
            System.out.println("The computer is rock. You are paper. You won");
        else if (userChoice == 1 && scissorRockPaper == 0)
            System.out.println("The computer is scissor. You are rock. You won");
        else if (userChoice == 2 && scissorRockPaper == 0)
            System.out.println("The computer is scissor. You are paper. computer won");
        else if (userChoice == 1 && scissorRockPaper == 2)
            System.out.println("The computer is paper. You are rock. computer won");
        else if (userChoice == 0 && scissorRockPaper == 1)
            System.out.println("The computer is rock. You are scissor. computer won");
        else if (userChoice == 0)
            System.out.println("The computer is scissor. You are scissor. It is a draw");
        else if (userChoice == 1)
            System.out.println("The computer is rock. You are rock. It is a draw");
        else if (userChoice == 2)
            System.out.println("The computer is paper. You are paper. It is a draw");
    }
}
