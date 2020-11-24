package com.company.Controller;

import com.company.View.Input;
import com.company.View.Menu;
import com.company.Model.MConverter;
import org.junit.Test;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;

public class ApplicationTest {
    private Menu menuMock;
    private MConverter mConverterMock;
    private Application sut;
    private Application spyObject;


    @BeforeEach
    public void setUp() {
        menuMock = mock(Menu.class);
        mConverterMock = mock(MConverter.class);
        sut = new Application(menuMock, mConverterMock);
        spyObject = spy(sut);
    }

    @Test
    public void start_shouldCall_getInput() {
        sut.start();
        verify(menuMock).getInput();
    }
}
