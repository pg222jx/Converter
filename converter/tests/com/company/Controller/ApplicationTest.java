package com.company.Controller;
import com.company.View.Input;
import com.company.View.Console;
import com.company.Model.MConverter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ApplicationTest {
    private Console menuMock;
    private MConverter mConverterMock;
    private Application sut;


    @Before
    public void setUp() {
        menuMock = mock(Console.class);
        mConverterMock = mock(MConverter.class);
        sut = new Application(menuMock, mConverterMock);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void start_shouldCallDisplayWelcomeMessage() {
        sut.start();
        verify(menuMock).displayWelcomeMessage();
    }

    @Test
    public void start_shouldCallGetInput() {
        sut.start();
        verify(menuMock).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoice() {
        sut.start();
        verify(menuMock).getMenuChoice(anyString());
    }

    @Test
    public void start_shouldCallGetInputTwoTimes() {
        when(menuMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(menuMock, times(2)).getInput();
    }

    @Test
    public void start_shouldCallGetMenuChoiceTwoTimes() {
        when(menuMock.getMenuChoice(anyString())).thenReturn(Input.Meter);
        sut.start();
        verify(menuMock, times(2)).getMenuChoice(anyString());
    }
    
    @Test
    public void start_shouldCallConvertFromInches() {
        when(menuMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        sut.start();
        verify(mConverterMock).convertFromInches(anyDouble());
    }

    @Test
    public void start_shouldCallGetInputThreeTimes() {
        when(menuMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(mConverterMock.convertFromInches(anyDouble())).thenReturn(1.0);
        sut.start();
        verify(menuMock, times(3)).getInput();
    }

    @Test
    public void start_shouldCallGetValueOnce() {
        when(menuMock.getMenuChoice(anyString())).thenReturn(Input.Meter, Input.Inches);
        when(mConverterMock.convertFromInches(anyDouble())).thenReturn(1.0);
        sut.start();
        verify(menuMock, times(1)).getValue(anyString());
    }

}
