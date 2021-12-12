package com.company;

public class Main {

    public static void main(String[] args) {
        final long CURRENT_POPULATION = 312032486;
        double totalBirth = (5.0 * 365 * 24 * 60 * 60) / 7;
        double totalDeath = (5.0 * 365 * 24 * 60 * 60) / 13;
        double totalImmigrant = (5.0 * 365 * 24 * 60 * 60) / 45;
        long futurePopulation = (long) (CURRENT_POPULATION + totalBirth - totalDeath + totalImmigrant);
        System.out.printf("Population in the next five years is %d\n", futurePopulation);
    }
}
