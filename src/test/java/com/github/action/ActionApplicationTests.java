package com.github.action;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActionApplicationTests {

    @Test
    void contextLoads() {
        // Test if the application context loads successfully
        assertTrue(true);
    }

    @Test
    void testSumOfPositiveNumbers() {
        int a = 5;
        int b = 10;
        int result = a + b;
        assertEquals(15, result, "Sum of 5 and 10 should be 15");
    }

    @Test
    void testSumOfNegativeNumbers() {
        int a = -5;
        int b = -10;
        int result = a + b;
        assertEquals(-15, result, "Sum of -5 and -10 should be -15");
    }

    @Test
    void testSumWithZero() {
        int a = 0;
        int b = 25;
        int result = a + b;
        assertEquals(25, result, "Sum of 0 and 25 should be 25");
    }

    @Test
    void testSumOfMixedNumbers() {
        int a = 7;
        int b = -3;
        int result = a + b;
        assertEquals(4, result, "Sum of 7 and -3 should be 4");
    }

    @Test
    void testSumOfLargeNumbers() {
        int a = 1_000_000;
        int b = 2_000_000;
        int result = a + b;
        assertEquals(3_000_000, result, "Sum of 1,000,000 and 2,000,000 should be 3,000,000");
    }

    @Test
    void testSumWithMinAndMaxInt() {
        int result = Integer.MAX_VALUE + Integer.MIN_VALUE;
        assertEquals(-1, result, "Sum of MAX_VALUE and MIN_VALUE should be -1");
    }

    @Test
    void testSumOfDoubles() {
        double a = 5.5;
        double b = 4.5;
        double result = a + b;
        assertEquals(10.0, result, 0.001, "Sum of 5.5 and 4.5 should be 10.0");
    }

    @Test
    void testSumWithFloatingPointPrecision() {
        double a = 0.1;
        double b = 0.2;
        double result = a + b;
        assertEquals(0.3, result, 0.0001, "Sum of 0.1 and 0.2 should be approximately 0.3");
    }

    @Test
    void testSumOfThreeNumbers() {
        int a = 2;
        int b = 3;
        int c = 5;
        int result = a + b + c;
        assertEquals(10, result, "Sum of 2, 3, and 5 should be 10");
    }
}
