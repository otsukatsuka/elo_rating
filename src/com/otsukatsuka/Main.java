package com.otsukatsuka;

import com.otsukatsuka.Enums.Outcome;
public class Main {

    public static void main(String[] args) {

        EloRating eloRating = new EloRating();

        int newRateA = eloRating.Rating(1500, 1500, 16, Outcome.Win);
        int newRateB = eloRating.Rating(1500, 1500, 16, Outcome.Lose);

        System.out.println(newRateA + ", " + newRateB);
    }
}
