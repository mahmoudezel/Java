package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text.\n");
        String text = scanner.nextLine();
        String rephrasedText = text.replaceFirst("hate", "love");
        System.out.printf("I have rephrased that line to read:\n%s\n", rephrasedText);
    }
}
