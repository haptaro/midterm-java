package ca.bcit.winter2021.comp2522.midterm.problem1;

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
