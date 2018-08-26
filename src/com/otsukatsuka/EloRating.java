package com.otsukatsuka;
import com.otsukatsuka.Enums.Outcome;
public class EloRating {

    public int Rating(int rateA, int rateB, int K, Outcome outcome){
        float expected = calcExpectedValue(rateB, rateA);

        float score = 0.0f;
        switch (outcome){
            case Win:
                score = 1.0f;
                break;
            case Draw:
                score = 0.5f;
                break;
            case Lose:
                score = 0.0f;
                break;
        }

        return  Math.round(rateA + K * (score - expected));
    }

    private float calcExpectedValue(int rate1, int rate2) {
        return 1.0f * 1.0f / (1 + 1.0f * (float) (Math.pow(10, 1.0f * (rate1 - rate2) / 400)));
    }
}
