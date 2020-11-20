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

    @Mock
    private Input inputMock;

    @Before
    public void setUp() throws Exception {
        sut = new Menu();
        inputMock = mock(Input.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldTakeUserInput() {

        String input = "m";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(input, sut.readLine());
    }

}
