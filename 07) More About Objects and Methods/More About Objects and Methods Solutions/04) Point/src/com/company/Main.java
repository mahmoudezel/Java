package com.company;

class Point {
    private double x;
    private double y;
    private double z;

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void negate() {
        x *= -1;
        y *= -1;
        z *= -1;
    }

    public Point norm() {
        double length = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
        return new Point(this.x / length, this.y / length, this.z / length);
    }

    public void print() {
        System.out.printf("The point is (%.2f, %.2f, %.2f)\n", x, y, z);
    }
}

public class Main {

    public static void main(String[] args) {
        Point point = new Point(10, 25, 30.5);
        point.print();
        point.negate();
        point.print();
        point.norm().print();
    }
}