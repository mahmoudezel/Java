package com.company;

import java.util.Scanner;

import static com.sun.xml.internal.ws.util.StringUtils.capitalize;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text. No punctuation please.\n");
        String text = scanner.nextLine();
        String firstWord = text.split(" ", 2)[0];
        String restText = text.split(" ", 2)[1];
        String rephrasedText = capitalize(restText) + " " + firstWord;
        System.out.printf("I have rephrased that line to read:\n%s\n", rephrasedText);
    }
}
