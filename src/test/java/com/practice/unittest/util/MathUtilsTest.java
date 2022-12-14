package com.practice.unittest.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void whenDivideMethodDivideCorrect() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.divide(10, 5);

        assertEquals(expected,actual,
                "divide method running");
    }
}