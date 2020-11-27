package com.company.Controller;
import com.company.View.StartMenu;
import org.mockito.runners.MockitoJUnitRunner;

import com.company.View.ViewFactory;
import org.junit.After;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class SubApplicationTest {

    @InjectMocks
    private SubApplication sut;

    @Mock
    private StartMenu startMenuMock;

    @Mock
    private ViewFactory factoryMock;

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
        verify(factoryMock).getConsoleView(anyString());
    }
}