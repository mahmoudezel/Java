package com.company;

class RatingScore {
    private final String description;
    private int rate;
    private final int maximumRate;

    RatingScore(String description, int rate, int maximumRate) {
        this.description = description;
        this.maximumRate = maximumRate;
        if (rate >= 0 && rate <= maximumRate)
            this.rate = rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getMaximumRate() {
        return maximumRate;
    }

    public int getRate() {
        return rate;
    }

    public String displayRate() {
        String string = description + "\t" + rate + "/" + maximumRate + "\t";
        for (int i = 0; i <= rate; i++)
            string += "*";
        return string;
    }
}

public class Main {

    public static void main(String[] args) {
        RatingScore ratingScore = new RatingScore("Star Wars VII", 8, 10);
        System.out.println(ratingScore.displayRate());
    }
}
