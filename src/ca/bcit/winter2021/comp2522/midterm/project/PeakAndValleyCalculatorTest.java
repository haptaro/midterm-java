package ca.bcit.winter2021.comp2522.midterm.project;

import ca.bcit.winter2021.comp2522.midterm.question3.TwitterAccount;
import ca.bcit.winter2021.comp2522.midterm.question7.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

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
        assertEquals(peakAndValley.getPeak(), 6);
    }

    @Test
    void test_calcurate_part2() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {2, 6, 6, 6, 3};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        assertEquals(peakAndValley.getValley(),2);
//        int[] expectedPeak = new int[] {6, 6, 6};
//        assertEquals(peakAndValley.getPeak(), expectedPeak);
    }
}