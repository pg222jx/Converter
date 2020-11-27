package com.company.Model;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MConverterTest {
    private MConverter sut;

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertFromInches_shouldReturnOneInchInMeter() {
        sut = new MConverter(1.0);
        double actual = sut.convertFromInches();
        double expected = 0.0254;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnTwoInchesInMeter() {
        sut = new MConverter(2.0);
        double actual = sut.convertFromInches();
        double expected = 0.0508;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnNegativeOneInchesInMeter() {
        sut = new MConverter(-1.0);
        double actual = sut.convertFromInches();
        double expected = -0.0254;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromInches_shouldReturnZeroInchesInMeter() {
        sut = new MConverter(0.0);
        double actual = sut.convertFromInches();
        double expected = 0;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnOneFootInMeter() {
        sut = new MConverter(1.0);
        double actual = sut.convertFromFoot();
        double expected = 0.3048;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnTwoFootInMeter() {
        sut = new MConverter(2.0);
        double actual = sut.convertFromFoot();
        double expected = 0.6096;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnNegativeOneFootInMeter() {
        sut = new MConverter(-1.0);
        double actual = sut.convertFromFoot();
        double expected = -0.3048;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnZeroFootInMeter() {
        sut = new MConverter(0.0);
        double actual = sut.convertFromFoot();
        double expected = 0;
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    public void convertFromFoot_shouldReturnOnePointFiveFootInMeter() {
        sut = new MConverter(1.5);
        double actual = sut.convertFromFoot();
        double expected = 0.4572;
        assertEquals(expected, actual, 0.000001);
    }
}