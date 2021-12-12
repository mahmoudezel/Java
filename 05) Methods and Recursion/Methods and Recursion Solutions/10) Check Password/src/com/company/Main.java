package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.next();
        if (checkPassword(password))
            System.out.print("Your password is valid.\n");
        else
            System.out.print("Your password is not valid.\n");
    }

    public static boolean checkPassword(String password) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)))
                continue;
            else if (Character.isDigit(password.charAt(i)))
                numberOfDigits++;
            else
                return false;
        }
        return password.length() >= 8 && numberOfDigits >= 2;
    }
}
