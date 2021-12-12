package com.company;

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        reset(hours, minutes, seconds);
    }

    public void normalize() {
        while (hours < 0 || hours > 23) {
            if (hours < 0)
                hours *= -1;
            else
                hours -= 24;
        }
        while (minutes < 0 || minutes > 59) {
            if (minutes < 0)
                minutes *= -1;
            else
                minutes -= 60;
        }
        while (seconds < 0 || seconds > 59) {
            if (seconds < 0)
                seconds *= -1;
            else
                seconds -= 60;
        }
    }

    public void advance(int h, int m, int s) {
        hours += h;
        minutes += m;
        seconds += s;
        normalize();
    }

    public void reset(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
        normalize();
    }

    public void print() {
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}

public class Main {

    public static void main(String[] args) {
        Time time = new Time(4, 25, 3);
        time.print();
        time.advance(25, 60, 59);
        time.print();
        time.normalize();
        time.print();
        time.reset(2, 5, 20);
        time.print();
    }
}