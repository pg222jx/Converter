package com.company.Model;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CmConverterTest {
    private CmConverter sut;

    @Before
    public void setUp() throws Exception {
        sut = new CmConverter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertToInches_shouldReturnInchesOfOneCm() {
        double actual = sut.convertToInches(1.0);
        double expected = 0.393701;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertToInches_shouldReturnInchesOfTwoCm() {
        double actual = sut.convertToInches(2.0);
        double expected = 0.787402;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertToInches_shouldReturnInchesOfTZeroCm() {
        double actual = sut.convertToInches(0);
        double expected = 0;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertToInches_shouldReturnInchesOfNegativeOneCm() {
        double actual = sut.convertToInches(-1.0);
        double expected = -0.393701;
        assertEquals(expected, actual, 0.000001);
    }
}
