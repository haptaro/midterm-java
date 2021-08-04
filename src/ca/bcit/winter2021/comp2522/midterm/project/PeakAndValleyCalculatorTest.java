package ca.bcit.winter2021.comp2522.midterm.project;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PeakAndValleyCalculatorTest {
    private PeakAndValleyCalculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new PeakAndValleyCalculator();
    }

    @Test
    void test_technical_report_1() {
        int[] input = new int[] {2, 6, 6, 6, 3};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {2};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {6, 6, 6};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_2() {
        int[] input = new int[] {6};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {6};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {6};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_3() {
        // Should ask when input value is empty
    }

    @Test
    void test_technical_report_4() {
        int[] input = new int[] {5,5,5,5};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {5,5,5,5};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {5,5,5,5};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_5() {
        int[] input = new int[] {6, 1, 4};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {1};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {6};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_6() {
        int[] input = new int[] {5, 6666, 2222, 3333, 2222, 1};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {1};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {6666};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_7() {
        int[] input = new int[] {1, 99999};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {1};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {99999};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_8() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {1};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {9};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }

    @Test
    void test_technical_report_9() {
        int[] input = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {1};
        assertTrue(Arrays.equals(peakAndValley.getValleys(), expectedValley));
        int[] expectedPeak = new int[] {9};
        assertTrue(Arrays.equals(peakAndValley.getPeaks(), expectedPeak));
    }
}