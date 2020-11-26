package com.company.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StartMenuTest {
    private StartMenu sut;

    @Before
    public void setUp() throws Exception {
        sut = new StartMenu();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getWhatViewMessage_shouldReturnCorrectMessage() {

        String actual = sut.getWhatViewMessage();
        String expected = "1. English \n2. Svenska\n";

        assertEquals(expected, actual);
    }
}
