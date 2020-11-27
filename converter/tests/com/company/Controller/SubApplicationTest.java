package com.company.Controller;
import com.company.View.StartMenu;
import com.company.Model.Converter;
import com.company.View.Console;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class SubApplicationTest {
    private SubApplication sut;
    private StartMenu startMenuMock;

    @Before
    public void setUp() {
        startMenuMock = mock(StartMenu.class);
        sut = new SubApplication(startMenuMock);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getView_shouldCallGetWhatViewMessage() {
        sut.getView();
        verify(startMenuMock).getWhatViewMessage();
    }

    @Test
    public void getView_shouldCallPrintToConsole() {
        sut.getView();
        verify(startMenuMock).printToConsole(anyString());
    }

    @Test
    public void getView_shouldCallGetInput() {
        sut.getView();
        verify(startMenuMock).getInput();
    }
}
