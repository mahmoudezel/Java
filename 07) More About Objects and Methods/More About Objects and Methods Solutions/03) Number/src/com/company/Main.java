
package com.company;

class Number {
    private final double number;

    Number(double number) {
        this.number = number;
    }

    public boolean isZero() {
        return number == 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public boolean isArmstrong() {
        double digit;
        double reminder;
        double armstrongNumber = 0;
        digit = number;
        while (digit != 0) {
            reminder = digit % 10;
            armstrongNumber += Math.pow(reminder, 3);
            digit /= 10;
        }
        return armstrongNumber == number;
    }

    public double getFactorial() {
        double factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        return factorial;
    }

    public double getSqrt() {
        return Math.sqrt(number);
    }

    public double getSqr() {
        return Math.pow(number, 2);
    }

    public double sumDigits() {
        double sumDigits = 0;
        double digit;
        double reminder;
        digit = number;
        while (digit != 0) {
            reminder = digit % 10;
            sumDigits += reminder;
            digit /= 10;
        }
        return sumDigits;
    }

    public double getReverse() {
        String reverseNumber = "";
        String digits;
        digits = Double.toString(number);
        for (int i = digits.length() - 1; i >= 0; i--)
            reverseNumber += digits.charAt(i);
        return Double.parseDouble(reverseNumber);
    }

    public void listFactor() {
        double digit = number;
        int i = 2;
        System.out.printf("Factors of number %.2f is : ", number);
        while (digit != 0 && digit >= i) {
            if (digit % i == 0) {
                System.out.print(i + "  ");
                digit /= i;
            } else
                i++;
        }
        System.out.println();
    }

    public void dispBinary() {
        int decimal = (int) number;
        System.out.printf("Binary number of number %.2f is : ", number);
        while (decimal != 0) {
            System.out.print((decimal % 2) + "  ");
            decimal /= 2;
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Number number = new Number(5);
        number.listFactor();
        number.dispBinary();
    }
}