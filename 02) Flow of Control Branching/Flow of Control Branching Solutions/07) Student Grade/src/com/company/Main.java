package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student score (between 0 and 100): ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100)
            System.out.print("Please enter valid score (between 0 and 100).\n");
        else if (score >= 85)
            System.out.print("Grade A\n");
        else if (score >= 75)
            System.out.print("Grade B\n");
        else if (score >= 65)
            System.out.print("Grade C\n");
        else if (score >= 60)
            System.out.print("Grade D\n");
        else
            System.out.print("Grade F\n");
    }
}
