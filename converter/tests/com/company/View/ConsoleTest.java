package com.company.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class ConsoleTest {
    private Console sut;
    private static final String WELCOME = "Welcome";

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        sut = new Console();
    }

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @Test
    public void printToConsole_shouldPrintToConsole() {
        sut.printToConsole(WELCOME);

        assertEquals(WELCOME,  outContent.toString());
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
        Input actual = sut.getMenuChoice("1");
        Input expected = Input.Meter;
        
        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputCentimeter() {
        Input actual = sut.getMenuChoice("2");
        Input expected = Input.Centimeter;

        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputInches() {
        Input actual = sut.getMenuChoice("3");
        Input expected = Input.Inches;

        assertEquals(expected, actual);
    }

    @Test
    public void getMenuChoice_shouldReturnInputFoot() {
        Input actual = sut.getMenuChoice("4");
        Input expected = Input.Foot;

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMenuChoice_shouldThrowIllegalArgumentExceptionIfValIsChar() {
        sut.getMenuChoice("A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMenuChoice_shouldThrowIllegalArgumentExceptionIfValIsEmpty() {
        sut.getMenuChoice("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMenuChoice_shouldThrowIllegalArgumentExceptionIfValIsNotInEnum() {
        sut.getMenuChoice("5");
    }

    @Test
    public void getValue_shouldConvertStringNumberToDouble() {
        double actual = sut.getValue("0.45");
        double expected = 0.45;

        assertEquals(expected, actual, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue_shouldThrowIllegalArgumentExceptionIfValIsChar() {
        sut.getValue("A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getValue_shouldThrowIllegalArgumentExceptionIfValIsEmpty() {
        sut.getValue("");
    }

    @Test
    public void getValue_shouldConvertStringIntToDouble() {
        double actual = sut.getValue("1");
        double expected = 1.0;

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getValue_shouldConvertStringNegativeOneToDouble() {
        double actual = sut.getValue("-1");
        double expected = -1.0;

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getWelcomeMessage_shouldReturnCorrectMessage() {
        String actual = sut.getWelcomeMessage();
        String expected = "Welcome to converter!\n" +
                "Which unit do you want to convert to? \n" +
                "1: Meter\n" +
                "2: Centimeter\n" +
                "3: Inches\n" +
                "4: Foot\n";

        assertEquals(expected, actual);
    }

    @Test
    public void getConvertFromMessage_shouldReturnCorrectMessage() {
        String actual = sut.getConvertFromMessage();
        String expected = "What unit do you want to convert from?\n" +
                "1: Meter\n" +
                "2: Centimeter\n" +
                "3: Inches\n" +
                "4: Foot\n";

        assertEquals(expected, actual);
    }

    @Test
    public void getFinalOutputMessage_shouldReturnCorrectMessage() {
        String actual = sut.getFinalOutputMessage(12.3456);
        String expected = "The final result is......:\n" +
                "12.3456";

        assertEquals(expected, actual);
    }

    @Test
    public void getDoubleToConvertMessage_shouldReturnCorrectMessage() {
        String actual = sut.getDoubleToConvertMessage();
        String expected = "Please enter the digit you want to convert with decimal points: \n";

        assertEquals(expected, actual);
    }
}