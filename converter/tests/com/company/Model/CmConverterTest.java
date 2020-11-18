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
    public void shouldReturnInches() throws IOException {
        double actual = sut.convertToInches(1.0);
        double expected = 0.393701;
        assertEquals(expected, actual, 0.000001);
    }
}
