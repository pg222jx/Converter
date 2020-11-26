package com.company.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class StartMenuTest {
    private StartMenu sut;

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        sut = new StartMenu();
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
    public void getWhatViewMessage_shouldReturnCorrectMessage() {

        String actual = sut.getWhatViewMessage();
        String expected = "1. English \n2. Svenska\n";

        assertEquals(expected, actual);
    }

    @Test
    public void printToConsole_shouldPrintToConsole() {
        sut.printToConsole("hello");

        assertEquals("hello",  outContent.toString());
    }
    @Test
    public void getInput_shouldReturn1() {

        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(input, sut.getInput());
    }

}
