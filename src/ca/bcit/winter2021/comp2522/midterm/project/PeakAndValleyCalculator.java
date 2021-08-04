package ca.bcit.winter2021.comp2522.midterm.project;

import ca.bcit.winter2021.comp2522.midterm.question7.Book;

import java.util.ArrayList;

public class PeakAndValleyCalculator {
    public PeakAndValley calcurate(int[] inputs){
        int minValue = calcurateMinValue(inputs);
        return new PeakAndValley(minValue);
    }

    private int calcurateMinValue(int[] array) {
        int intMin = array[0];

        for(int i = 1; i < array.length; i++) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }

        return  intMin;
    }
}