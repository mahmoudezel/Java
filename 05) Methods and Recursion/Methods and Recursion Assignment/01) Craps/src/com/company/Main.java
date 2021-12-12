package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int firstDice = rollDice();
        int secondDice = rollDice();
        int sum = firstDice + secondDice;
        if (sum == 2 || sum == 3 || sum == 12)
            System.out.printf("You rolled %d + %d = %d\nYou lose\n", firstDice, secondDice, sum);
        else if (sum == 7 || sum == 11)
            System.out.printf("You rolled %d + %d = %d\nYou win\n", firstDice, secondDice, sum);
        else {
            System.out.printf("You rolled %d + %d = %d\npoint is %d\n", firstDice, secondDice, sum, sum);
            while ((firstDice + secondDice) != 7) {
                firstDice = rollDice();
                secondDice = rollDice();
                if ((firstDice + secondDice) == 7) {
                    System.out.printf("You rolled %d + %d = %d\nYou lose\n", firstDice, secondDice, (firstDice + secondDice));
                    break;
                }
                else if (sum == (firstDice + secondDice)) {
                    System.out.printf("You rolled %d + %d = %d\nYou win\n", firstDice, secondDice, sum);
                    break;
                }
            }
        }
    }

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
