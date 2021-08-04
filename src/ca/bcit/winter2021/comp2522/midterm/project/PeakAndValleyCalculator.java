package ca.bcit.winter2021.comp2522.midterm.project;

import ca.bcit.winter2021.comp2522.midterm.question7.Book;

import java.util.ArrayList;

public class PeakAndValleyCalculator {
    public PeakAndValley calcurate(int[] inputs){
        int minValue = calcurateMinValue(inputs);
        int[] maxValues = calcurateMaxValues(inputs);
        return new PeakAndValley(minValue, maxValues);
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

    private int[] calcurateMaxValues(int[] array) {
        ArrayList<Integer> intMaxs = new ArrayList<>();

        int intMax = array[0];
        for(int i = 1; i < array.length; i++) {
            if(intMax < array[i]) {
                intMax = array[i];
            }
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] == intMax) {
                intMaxs.add(intMax);
            }
        }

        int[] resultArray = intMaxs.stream().mapToInt(i -> i).toArray();
        return resultArray;
    }
}