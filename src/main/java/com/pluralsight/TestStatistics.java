package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {84, 64, 33, 88, 77, 67, 95, 80, 90, 100};

        Arrays.sort(scores);

        for(int score : scores) {
            System.out.println(score);
        }
        
        int sumScores = 0;

        for (int i = 0; i < scores.length; i++) {
            sumScores += scores[i];
        }

        double average = sumScores / scores.length;

        System.out.printf("Average: %.2f\n", average);

        System.out.println("Low Score: " + scores[0]);

        System.out.println("High Score: " + scores[9]);

    }
}
