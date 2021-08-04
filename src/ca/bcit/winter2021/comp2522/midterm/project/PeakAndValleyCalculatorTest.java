package ca.bcit.winter2021.comp2522.midterm.project;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class PeakAndValleyCalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void test_calcurate_part1() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {6, 1, 4};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        assertEquals(peakAndValley.getValley(),1);
        int[] expectedPeak = new int[] {6};
        assertTrue(Arrays.equals(peakAndValley.getPeak(), expectedPeak));
    }

    @Test
    void test_calcurate_part2() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {2, 6, 6, 6, 3};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        assertEquals(peakAndValley.getValley(),2);
    }

    @Test
    void test_calcurate_part3() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {2, 6, 6, 6, 3};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedPeak = new int[] {6, 6, 6};
        assertTrue(Arrays.equals(peakAndValley.getPeak(), expectedPeak));
    }

    @Test
    void test_technical_report_1() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {2, 6, 6, 6, 3};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        int[] expectedValley = new int[] {2};
        assertTrue(Arrays.equals(peakAndValley.getValley(), expectedValley));
        int[] expectedPeak = new int[] {6, 6, 6};
        assertTrue(Arrays.equals(peakAndValley.getPeak(), expectedPeak));
    }
}