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
}
