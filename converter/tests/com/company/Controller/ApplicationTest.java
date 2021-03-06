package com.company.Controller;
import com.company.View.Input;
import com.company.View.Console;
import com.company.Model.Converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ApplicationTest {
    private Console consoleMock;
    private Converter converterMock;
    private Application sut;

    @Before
    public void setUp() {
        consoleMock = mock(Console.class);
        converterMock = mock(Converter.class);
        sut = new Application(consoleMock);
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
    public void start_shouldCallGetConvertFromMessage() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(consoleMock).getConvertFromMessage();
    }

    @Test
    public void start_shouldCallGetInput() {
        sut.start();
        verify(consoleMock).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoiceOnce() {
        sut.start();
        verify(consoleMock).getMenuChoice(anyString());
    }

    @Test
    public void start_shouldCallGetInputThreeTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(consoleMock, times(3)).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoiceTwoTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(consoleMock, times(2)).getMenuChoice(anyString());
    }

    @Test
    public void start_shouldCallGetValueOnce() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(converterMock.convertFromInches()).thenReturn(1.0);
        sut.start();
        verify(consoleMock, times(1)).getValue(anyString());
    }

    @Test
    public void start_shouldCallPrintToConsoleOnce() {
        sut.start();
        verify(consoleMock).printToConsole(anyString());
    }

    @Test
    public void start_getConvertFromMessageShouldBeCalledOnce() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(converterMock.convertFromInches()).thenReturn(1.0);
        sut.start();
        verify(consoleMock).getConvertFromMessage();
    }

    @Test
    public void start_getFinalOutputMessageShouldBeCalledOnceWhenInches() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(converterMock.convertFromInches()).thenReturn(1.0);
        sut.start();
        verify(consoleMock).getFinalOutputMessage(anyDouble());
    }

    @Test
    public void start_shouldCallPrintToConsoleFourTimes() {
        when(consoleMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(converterMock.convertFromInches()).thenReturn(1.0);
        when(consoleMock.getFinalOutputMessage(anyDouble())).thenReturn("Hello");
        sut.start();
        verify(consoleMock, times(4)).printToConsole(anyString());
    }
}