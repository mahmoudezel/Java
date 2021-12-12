package com.company;

public class Main {

    public static void main(String[] args) {
        double speedInKilometer = (24 * 1.6) / (1.0 + (40.0 / 60) + (35.0 / (60 * 60)));
        System.out.printf("The average speed in kilometer per hour is %.2f\n", speedInKilometer);
    }
}
