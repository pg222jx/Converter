package com.company.Model;

import com.company.View.Console;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.company.View.Input;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class ConverterFactoryTest {
    private ConverterFactory sut;
    private ConverterFactory spyObject;

    @Before
    public void setUp() throws Exception {
        sut = new ConverterFactory();
        spyObject = spy(sut);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getConverter_shouldCreateInstanceOfMConverter() {
        Converter c = ConverterFactory.getConverter(Input.Meter, 1.0);
        assertTrue(c instanceof MConverter);
    }


    @Test(expected = IllegalArgumentException.class)
    public void getConverter_shouldThrowIllegalArgumentExceptionIfInputFoot() {
        sut.getConverter(Input.Foot, 1.0);
    }

}
