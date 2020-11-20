package com.company.Model;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MConverterTest {
    private MConverter sut;

    @Before
    public void setUp() throws Exception {
        sut = new MConverter();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertFromInches_shouldReturnOneInchInMeter() {
        double actual = sut.convertFromInches(1.0);
        double expected = 0.0254;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnTwoInchesInMeter() {
        double actual = sut.convertFromInches(2.0);
        double expected = 0.0508;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnNegativeOneInchesInMeter() {
        double actual = sut.convertFromInches(-1.0);
        double expected = -0.0254;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnZeroInchesInMeter() {
        double actual = sut.convertFromInches(0.0);
        double expected = 0.0;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnOneFootInMeter() {
        double actual = sut.convertFromFoot(1.0);
        double expected = 0.3048;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnTwoFootInMeter() {
        double actual = sut.convertFromFoot(2.0);
        double expected = 0.6096;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnNegativeOneFootInMeter() {
        double actual = sut.convertFromFoot(-1.0);
        double expected = -0.3048;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnZeroFootInMeter() {
        double actual = sut.convertFromFoot(0.0);
        double expected = 0;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnOnePointFiveFootInMeter() {
        double actual = sut.convertFromFoot(1.5);
        double expected = 0.4572;
        assertEquals(expected, actual, 0.000001);
    }

}
