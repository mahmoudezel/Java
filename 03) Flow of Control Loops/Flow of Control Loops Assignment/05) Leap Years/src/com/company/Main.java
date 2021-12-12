package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int year = 101;
        for (int i = year; i <= 2100; i++) {
            if (i % 4 == 0 && (i % 400 == 0 || i % 100 != 0)) {
                System.out.printf("%6d", i);
                counter++;
                if (counter % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        System.out.printf("Number of leap years is %d\n", counter);
    }
}
