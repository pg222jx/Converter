package com.company.Controller;
import com.company.View.Input;
import com.company.View.Console;
import com.company.Model.MConverter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ApplicationTest {
    private Console consoleMock;
    private MConverter mConverterMock;
    private Application sut;


    @Before
    public void setUp() {
        consoleMock = mock(Console.class);
        mConverterMock = mock(MConverter.class);
        sut = new Application(consoleMock, mConverterMock);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void start_shouldCallDisplayWelcomeMessage() {
        sut.start();
        verify(consoleMock).getWelcomeMessage();
    }

    @Test
    public void start_shouldCallGetInput() {
        sut.start();
        verify(consoleMock).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoice() {
        sut.start();
        verify(consoleMock).getMenuChoice(anyString());
    }

    @Test
    public void start_shouldCallGetInputTwoTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(consoleMock, times(2)).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoiceTwoTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(consoleMock, times(2)).getMenuChoice(anyString());
    }
    
    @Test
    public void start_shouldCallConvertFromInches() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        sut.start();
        verify(mConverterMock).convertFromInches(anyDouble());
    }

    @Test
    public void start_shouldCallGetInputThreeTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(mConverterMock.convertFromInches(anyDouble())).thenReturn(1.0);
        sut.start();
        verify(consoleMock, times(3)).getInput();
    }

    @Test
    public void start_shouldCallGetValueOnce() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(mConverterMock.convertFromInches(anyDouble())).thenReturn(1.0);
        sut.start();
        verify(consoleMock, times(1)).getValue(anyString());
    }

    @Test
    public void start_shouldCallPrintToConsole() {
        sut.start();
        verify(consoleMock).printToConsole(anyString());
    }

}
