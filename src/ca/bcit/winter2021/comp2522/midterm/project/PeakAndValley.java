package ca.bcit.winter2021.comp2522.midterm.project;

import ca.bcit.winter2021.comp2522.midterm.question7.Book;

import java.util.ArrayList;

public class PeakAndValley {
    private int valley;
    private int[] peaks;

    public PeakAndValley(int valley, int[] peaks) {
        this.valley = valley;
        this.peaks = peaks;
    }

    public int getValley() {
        return valley;
    }

    public int[] getPeak() {
        return peaks;
    }
}
