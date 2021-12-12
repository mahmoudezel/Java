package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        System.out.printf("First string is: %s and it's length is: %d\n", string1, string1.length());
        System.out.printf("Second string is: %s and it's length is: %d\n", string2, string2.length());
        String string3 = string1 + " " + string2;
        System.out.printf("The new string is: %s and it's length is: %d", string3, string3.length());
    }
}
