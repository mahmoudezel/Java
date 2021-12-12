package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons in the room: ");
        int persons = scanner.nextInt();
        System.out.printf("Total handshakes in the room is %d\n", handshake(persons));
    }

    public static int handshake(int persons) {
        if (persons == 1)
            return 0;
        else if (persons == 2)
            return 1;
        else
            return handshake(persons - 1) + (persons - 1);
    }
}
