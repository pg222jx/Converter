package com.company.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    private Menu sut;

    @Before
    public void setUp() throws Exception {
        sut = new Menu();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getInput_shouldReturnM() {

        String input = "m";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(input, sut.getInput());
    }

    @Test
    public void getInput_shouldReturnCm() {

        String input = "cm";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(input, sut.getInput());
    }

    @Test
    public void getMenuChoice_shouldReturnInputMeter() {

        Input actual = sut.getMenuChoice("m");
        Input expected = Input.Meter;
        
        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputCentimeter() {

        Input actual = sut.getMenuChoice("c");
        Input expected = Input.Centimeter;

        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputInches() {

        Input actual = sut.getMenuChoice("i");
        Input expected = Input.Inches;

        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputFoot() {

        Input actual = sut.getMenuChoice("f");
        Input expected = Input.Foot;

        assertEquals(expected, actual);
    }

    @Test
    public void getValue_shouldConvertStringNumberToDouble() {

        double actual = sut.getValue("0.45");
        double expected = 0.45;

        assertEquals(expected, actual, 0.01);
    }
}
