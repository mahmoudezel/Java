package com.company;

enum Month {
    January, February, March,
    April, May, June, July, August,
    September, October, November, December;
}

class Date {
    private int year;
    private Month month;
    private int day;

    Date(int year, Month month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate() {
        System.out.printf("%d/%s/%d\n", day, month, year);
    }
}

public class Main {

    public static void main(String[] args) {
        Date date = new Date(2017, Month.December, 31);
        date.displayDate();
    }
}