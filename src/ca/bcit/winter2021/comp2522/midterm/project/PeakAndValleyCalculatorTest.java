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
    void test_calcurate() {
        PeakAndValleyCalculator calculator = new PeakAndValleyCalculator();
        int[] input = new int[] {6, 1, 4};
        PeakAndValley peakAndValley = calculator.calcurate(input);
        assertEquals(peakAndValley.getValley(),1);
    }
}