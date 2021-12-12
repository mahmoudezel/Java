package com.company;

import java.util.Scanner;

class Rational {
    int a;
    int b;

    Rational(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int gcd() {
        int gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public void reduce() {
        int gcd = gcd();
        a /= gcd;
        b /= gcd;
    }

    public Rational add(Rational rational) {
        Rational add = new Rational(1, 1);
        add.a = (rational.b * a) + (rational.a * b);
        add.b = rational.b * b;
        return add;
    }

    public Rational subtract(Rational rational) {
        Rational subtract = new Rational(1, 1);
        subtract.a = (rational.b * a) - (rational.a * b);
        subtract.b = rational.b * b;
        return subtract;
    }

    public Rational multiply(Rational rational) {
        Rational multiply = new Rational(1, 1);
        multiply.a = rational.a * a;
        multiply.b = rational.b * b;
        return multiply;
    }

    public Rational divide(Rational rational) {
        Rational divide = new Rational(1, 1);
        divide.a = rational.b * a;
        divide.b = rational.a * b;
        return divide;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        Rational seriesSum = new Rational(0, 1);
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
            seriesSum = seriesSum.add(new Rational(1, i));
        System.out.printf("The summation of the series is %d/%d\n", seriesSum.a, seriesSum.b);
    }
}