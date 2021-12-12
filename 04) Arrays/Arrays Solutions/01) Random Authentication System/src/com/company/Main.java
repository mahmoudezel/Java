package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String actualPIN = "69440";
        int[] PIN = new int[10];
        boolean rightPIN = false;
        System.out.print("PIN: ");
        for (int i = 0; i < PIN.length; i++)
            System.out.printf("%3d", i);
        System.out.println();
        for (int i = 0; i < PIN.length; i++)
            PIN[i] = random.nextInt(3) + 1;
        System.out.print("NUM: ");
        for (int i : PIN) System.out.printf("%3d", i);
        System.out.println();
        System.out.print("Enter the PIN: ");
        String userPIN = scanner.next();
        System.out.println("Please wait! Testing the entered PIN...");
        for (int i = 0; i < actualPIN.length(); i++) {
            if (Character.getNumericValue(userPIN.charAt(i)) == PIN[Character.getNumericValue(actualPIN.charAt(i))])
                rightPIN = true;
            else {
                rightPIN = false;
                break;
            }
        }
        if (rightPIN)
            System.out.println("Correct PIN! Welcome.");
        else
            System.out.println("Incorrect PIN! Please try again later.");
    }
}
