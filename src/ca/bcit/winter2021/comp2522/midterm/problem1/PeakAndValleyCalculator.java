package ca.bcit.winter2021.comp2522.midterm.problem1;

import java.util.ArrayList;

public class PeakAndValleyCalculator {
    public PeakAndValley calcurate(int[] inputs){
        int[] minValues = calcurateMinValue(inputs);
        int[] maxValues = calcurateMaxValues(inputs);
        return new PeakAndValley(minValues, maxValues);
    }

    private int[] calcurateMinValue(int[] array) {
        ArrayList<Integer> intMins = new ArrayList<>();
        int intMin = array[0];

        for(int i = 1; i < array.length; i++) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] == intMin) {
                intMins.add(intMin);
            }
        }

        int[] resultArray = intMins.stream().mapToInt(i -> i).toArray();
        return resultArray;
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