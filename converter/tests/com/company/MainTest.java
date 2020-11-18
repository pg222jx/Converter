package com.company;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private Main sut;

    @Before
    public void setUp() throws Exception {
        sut = new Main();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldReturnHelloWorld() throws IOException {
        String actual = sut.sayHello();
        assertEquals("Hello World", actual);
    }
}
