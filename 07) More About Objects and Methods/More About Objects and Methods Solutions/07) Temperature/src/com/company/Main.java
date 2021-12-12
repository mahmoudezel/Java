package com.company;

class Temperature {
    private double temperature;
    private char scale;

    Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }

    Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    Temperature(char scale) {
        this.scale = scale;
    }

    Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double degreeInCelsius() {
        return scale == 'C' ? temperature : 5 * (temperature- 32) / 9;
    }

    public double degreeInFahrenheit() {
        return scale == 'F' ? temperature : 9 * (temperature / 5) + 32;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public boolean isEqual(Temperature temperature) {
        return this.degreeInCelsius() == temperature.degreeInCelsius();
    }

    public boolean isGreater(Temperature temperature) {
        return this.degreeInCelsius() > temperature.degreeInCelsius();
    }

    public boolean isLesser(Temperature temperature) {
        return this.degreeInCelsius() < temperature.degreeInCelsius();
    }
}

public class Main {

    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(20, 'F');
        Temperature temperature2 = new Temperature(30, 'C');
        System.out.printf("Temperature 1 in Fahrenheit: %.2f\n", temperature1.degreeInFahrenheit());
        System.out.printf("Temperature 1 in Celsius: %.2f\n", temperature1.degreeInCelsius());
        System.out.printf("Temperature 2 in Fahrenheit: %.2f\n", temperature2.degreeInFahrenheit());
        System.out.printf("Temperature 2 in Celsius: %.2f\n", temperature2.degreeInCelsius());
        System.out.printf("Temperature 1 is equal to temperature 2 ? %s\n", temperature1.isEqual(temperature2));
        System.out.printf("Temperature 1 is greater than temperature 2 ? %s\n", temperature1.isGreater(temperature2));
        System.out.printf("Temperature 1 is lesser than temperature 2 ? %s\n", temperature1.isLesser(temperature2));
    }
}