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
    public void convertFromInches_shouldReturnMeterToInches() {
        double actual = sut.convertFromInches(1.0);
        double expected = 0.0254;
        assertEquals(expected, actual, 0.000001);
    }

}
