package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a favorite color: ");
        String color = scanner.nextLine();
        System.out.print("Enter a favorite food: ");
        String food = scanner.nextLine();
        System.out.print("Enter a favorite animal: ");
        String animal = scanner.nextLine();
        System.out.print("Enter the first name of a friend or relative: ");
        String friend = scanner.nextLine();
        System.out.printf("I had a dream that \033[3m%s\033[0m ate a \033[3m%s\033[0m \033[3m%s\033[0m \n" +
                "and said it tasted like \033[3m%s\033[0m!\n", friend, color, animal, food);
    }
}
