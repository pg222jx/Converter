package com.company.Controller;
import com.company.View.StartMenu;
import com.company.Model.Converter;
import com.company.View.Console;

import com.company.View.ViewFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class SubApplicationTest {
    private SubApplication sut;
    private StartMenu startMenuMock;
    private ViewFactory viewFactoryMock;

    @Before
    public void setUp() {
        startMenuMock = mock(StartMenu.class);
        viewFactoryMock = mock(ViewFactory.class);
        sut = new SubApplication(startMenuMock, viewFactoryMock);
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

    @Test
    public void getView_shouldCallGetConsoleView() {
        sut.getView();
        verify(viewFactoryMock).getConsoleView(anyString());
    }
}
