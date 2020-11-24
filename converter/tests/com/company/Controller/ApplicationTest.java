package com.company.Controller;

import com.company.View.Input;
import com.company.View.Menu;
import com.company.Model.MConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

public class ApplicationTest {
    private Menu menuMock;
    private MConverter mConverterMock;
    private Application sut;
    private Application spyObject;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        menuMock = mock(Menu.class);
        mConverterMock = mock(MConverter.class);
        sut = new Application(menuMock, mConverterMock);
        spyObject = spy(sut);
    }

    @After
    public void tearDown() throws Exception {
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
    public void start_shouldReturn() {
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
}
