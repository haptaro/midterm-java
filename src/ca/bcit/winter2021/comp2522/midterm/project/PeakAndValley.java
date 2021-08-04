package ca.bcit.winter2021.comp2522.midterm.project;

import ca.bcit.winter2021.comp2522.midterm.question7.Book;

import java.util.ArrayList;

public class PeakAndValley {
    private int[] valleys;
    private int[] peaks;

    public PeakAndValley(int[] valleys, int[] peaks) {
        this.valleys = valleys;
        this.peaks = peaks;
    }

    public int[] getValleys() {
        return valleys;
    }

    public int[] getPeaks() {
        return peaks;
    }
}
